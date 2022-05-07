package main;

import java.net.URI;
import java.net.URISyntaxException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class TwitterQueue {
    public static void main(String[] args) throws URISyntaxException, Exception {
		BrokerService broker = BrokerFactory.createBroker(new URI("broker:(tcp://localhost:61616)"));
		broker.start();
		Connection connection = null;
		try {
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
			connection = connectionFactory.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("tweetQueue");
			
			Tweet tweet1 = new Tweet();
			tweet1.setContent("My first tweet !");
			tweet1.setTimestamp(1490230840);
			Tweet tweet2 = new Tweet();
			tweet2.setContent("My second tweet !");
			tweet2.setTimestamp(1490230840);
			Message msg1 = session.createTextMessage(tweet1.toString());
			Message msg2 = session.createTextMessage(tweet2.toString());
			MessageProducer producer = session.createProducer(queue);
			System.out.println("Sending tweet '" + tweet1.toString() + "'");
			producer.send(msg1);
			System.out.println("Sending tweet '" + tweet2.toString() + "'");
			producer.send(msg2);

			MessageConsumer consumer = session.createConsumer(queue);
			connection.start();
			TextMessage textMsg = (TextMessage) consumer.receive();
			System.out.println(textMsg);
			System.out.println("Received: " + textMsg.getText());
			session.close();
		} finally {
			if (connection != null) {
				connection.close();
			}
            broker.stop();
		}
	}
}

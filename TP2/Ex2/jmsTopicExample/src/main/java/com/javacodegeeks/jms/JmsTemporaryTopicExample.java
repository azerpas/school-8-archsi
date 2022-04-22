package com.javacodegeeks.jms;

import java.net.URI;
import java.net.URISyntaxException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class JmsTemporaryTopicExample {
	public static void main(String[] args) throws URISyntaxException, Exception {
		BrokerService broker = BrokerFactory.createBroker(new URI(
				"broker:(tcp://localhost:61616)"));
		broker.start();
		Connection clientConnection = null;
		try {
			// Producer
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					"tcp://localhost:61616");
			clientConnection = connectionFactory.createConnection();
			clientConnection.setClientID("TempTopicTest");
			Session session = clientConnection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			Topic topic = session.createTemporaryTopic();	
			
			// Consumer1 subscribes to customerTopic
			MessageConsumer consumer1 = session.createConsumer(topic);
			consumer1.setMessageListener(new ConsumerMessageListener("Consumer1"));
			
			// Consumer2 subscribes to customerTopic
		    MessageConsumer consumer2 = session.createConsumer(topic);
		    consumer2.setMessageListener(new ConsumerMessageListener("Consumer2"));
		    
			clientConnection.start();		
			
			// Publish
			String payload = "Important Task";
			Message msg = session.createTextMessage(payload);
			MessageProducer producer = session.createProducer(topic);
			System.out.println("Sending text '" + payload + "'");
			producer.send(msg);
			
			Thread.sleep(3000);
			session.close();
		} finally {
			if (clientConnection != null) {
				clientConnection.close();
			}
			broker.stop();
		}
	}
}

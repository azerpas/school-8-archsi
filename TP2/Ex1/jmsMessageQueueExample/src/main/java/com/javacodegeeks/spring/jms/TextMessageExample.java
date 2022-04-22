package com.javacodegeeks.spring.jms;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMessageExample {
	public static void main(String[] args) throws URISyntaxException, Exception {
		BrokerService broker = BrokerFactory.createBroker(new URI(
				"broker:(tcp://localhost:61616)"));
		broker.start();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		try {
			JmsProducer producer = (JmsProducer) context
					.getBean("jmsProducer");
			producer.sendTextMessage("Hi");

			JmsConsumer consumer = (JmsConsumer) context
					.getBean("jmsConsumer");
			System.out.println("Consumer receives " + consumer.receiveTextMessage());
		} finally {
			broker.stop();
			context.close();
		}
	}
}

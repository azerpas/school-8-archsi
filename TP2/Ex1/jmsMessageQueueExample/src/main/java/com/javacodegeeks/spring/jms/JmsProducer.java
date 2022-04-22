package com.javacodegeeks.spring.jms;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.StreamMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class JmsProducer {
	private JmsTemplate jmsTemplate;
	private Destination destination;
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public void sendEmptyMessage() {
		System.out.println("Producer sends empty message");
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message msg = session.createMessage();
				msg.setBooleanProperty("isPayloadEmpty", true);
				return msg;
			}});		
	}
	
	public void sendTextMessage(final String msg) {
		System.out.println("Producer sends " + msg);
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}});		
	}
	
	public void sendObjectMessage(final Person person) {
		System.out.println("Producer sends " + person);
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(person);
			}});		
	}

	public void sendByteMessage(final Person person) {
		System.out.println("Producer sends " + person + " using byte message");
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				BytesMessage bytesMessage = session.createBytesMessage();
				bytesMessage.writeUTF(person.getName());
				bytesMessage.writeInt(person.getAge());
				return bytesMessage;
			}});
	}
	
	public void sendStreamMessage(final Person person) {
		System.out.println("Producer sends " + person + " using stream message");
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				StreamMessage streamMessage = session.createStreamMessage();
				streamMessage.writeString(person.getName());
				streamMessage.writeInt(person.getAge());
				return streamMessage;
			}});
	}	
	
	public void sendMapMessage(final Person person) {
		System.out.println("Producer sends " + person + " using map message");
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage mapMessage = session.createMapMessage();
				mapMessage.setString("name", person.getName());
				mapMessage.setInt("age", person.getAge());
				return mapMessage;
			}});
	}	
}

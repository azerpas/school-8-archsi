package com.javacodegeeks.spring.jms;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.StreamMessage;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

public class JmsConsumer {
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
	
	public boolean receiveEmptyMessage() throws JMSException {
		Message emptyMsg = jmsTemplate.receive(destination);		
		return emptyMsg != null && emptyMsg.getBooleanProperty("isPayloadEmpty");
	}
	
	public String receiveTextMessage() throws JMSException {
		TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);		
		return textMessage.getText();
	}
	
	public Person receiveObjectMessage() throws JMSException {
		ObjectMessage message = (ObjectMessage) jmsTemplate.receive(destination);		
		return (Person) message.getObject();
	}
	
	public Person receiveBytesMessage() throws JMSException {
		BytesMessage message = (BytesMessage) jmsTemplate.receive(destination);		
		Person person = new Person(message.readUTF(), message.readInt());
		return person;
	}
	
	public Person receiveStreamMessage() throws JMSException {
		StreamMessage message = (StreamMessage) jmsTemplate.receive(destination);		
		Person person = new Person(message.readString(), message.readInt());
		return person;
	}
	
	public Person receiveMapMessage() throws JMSException {
		MapMessage message = (MapMessage) jmsTemplate.receive(destination);		
		Person person = new Person(message.getString("name"), message.getInt("age"));
		return person;
	}
}

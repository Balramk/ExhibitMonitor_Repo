package com.demo.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="messageServiceA")
public class MessageServiceA {
	@ServiceActivator(inputChannel="messageChennelA", autoStartup="true")
	public String processMessage(Message message){

		String originalMessage = (String)message.getPayload();;
		String extendsMessage = originalMessage.concat("||SecondMessage");
		return extendsMessage;
	}
}

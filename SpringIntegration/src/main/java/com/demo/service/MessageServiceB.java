package com.demo.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint(value="messageServiceB")
public class MessageServiceB {
	@ServiceActivator(inputChannel="messageChennelB")
	public void printMessage(Message<String> message) {
		System.out.println(message.getPayload());
	}
}

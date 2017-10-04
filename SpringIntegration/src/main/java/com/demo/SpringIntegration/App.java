package com.demo.SpringIntegration;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
    	MessageChannel chennel = context.getBean("messageChennelA",MessageChannel.class);
    	Message<String> message = MessageBuilder.withPayload("FirstMessage").build();
    	chennel.send(message);
    }
}

package com.gemasu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SenderService {

  private static final Logger LOGGER = LoggerFactory.getLogger(SenderService.class);

  @Autowired
  private JmsTemplate jmsTemplate;

  public void send(String destination, String message) {
	  System.out.println("SendingMess: " + message);
    LOGGER.info("sending message='{}' to destination='{}'", message, destination);
    jmsTemplate.convertAndSend(destination, message);
  }
}
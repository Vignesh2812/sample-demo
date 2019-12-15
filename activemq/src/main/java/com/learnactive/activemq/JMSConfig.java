package com.learnactive.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import java.util.Queue;
import java.awt.*;


@Configuration
@EnableJms
public class JMSConfig {
    @Bean
    public javax.jms.Queue queue(){
        return new ActiveMQQueue("simple-jms-queue");
    }
}

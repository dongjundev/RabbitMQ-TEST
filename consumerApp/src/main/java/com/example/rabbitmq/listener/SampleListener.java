package com.example.rabbitmq.listener;

import com.example.rabbitmq.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {

    private static final Logger log = LoggerFactory.getLogger(SampleListener.class);

//    @RabbitListener(queues = "sample.queue")
//    public void receiveMessage(final Message message) {
//        log.info(message.toString());
//    }

    @RabbitHandler
    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(Member member) {
        log.info(member.toString());
    }
}

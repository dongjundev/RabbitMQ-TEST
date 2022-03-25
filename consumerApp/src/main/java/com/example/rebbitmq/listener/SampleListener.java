package com.example.rebbitmq.listener;

import com.example.rebbitmq.config.SampleConfig;
import com.example.rebbitmq.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener {

    private static final Logger log = LoggerFactory.getLogger(SampleListener.class);

//    @RabbitListener(queues = "sample.queue")
//    public void receiveMessage(final Message message) {
//        log.info(message.toString());
//    }

    @RabbitListener(queues = SampleConfig.QUEUE_NAME)
    public void receiveMessage(Member member) {
        log.info(member.toString());
    }
}

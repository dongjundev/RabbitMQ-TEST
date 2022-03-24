package com.example.rabbitmq.controller;

import com.example.rabbitmq.vo.Member;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final String EXCHANGE_NAME = "sample.exchange";

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/sample/queue")
    public String samplePublish() {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME,
                "sample.dong.#", "RabbitMQ + Springboot = Success!");
        return "message sending";
    }

    // 객체 메시지큐 테스트
    @GetMapping("/sample/member")
    public String objectPublish() {
        Member member = new Member("홍길동", 18, "010-1234-5678");
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "sample.dong.#", member);
        return "object sending!";
    }

}

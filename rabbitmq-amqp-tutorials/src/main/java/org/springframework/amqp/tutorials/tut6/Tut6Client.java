package org.springframework.amqp.tutorials.tut6;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StopWatch;

public class Tut6Client {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange exchange;

    int start = 0;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        System.out.println(" [x] Requesting fib(" + start + ")");
        StopWatch watch = new StopWatch();
        watch.start();
        Integer response = (Integer) template.convertSendAndReceive
                (exchange.getName(), "rpc", start++);
        watch.stop();

        System.out.println(" [.] Got '" + response + "'");
        System.out.println(" [.] duration time " + watch.getTotalTimeSeconds() + "s");
    }
}
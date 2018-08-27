package org.springframework.amqp.tutorials.tut6;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.util.StopWatch;

public class Tut6Server {

    @RabbitListener(queues = "tut.rpc.requests")
    // @SendTo("tut.rpc.replies") used when the
    // client doesn't set replyTo.
    public int fibonacci(int n) {
        System.out.println(" [x] Received request for " + n);
        StopWatch watch = new StopWatch();
        watch.start();
        int result = fib(n);
        watch.stop();
        double seconds = watch.getTotalTimeSeconds();
        System.out.println(" [.] Returned " + result);
        System.out.println(" [.] duration time " + seconds +"s");
        return result;
    }

    public int fib(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : (fib(n - 1) + fib(n - 2));
    }

}
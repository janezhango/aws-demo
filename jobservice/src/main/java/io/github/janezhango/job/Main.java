package io.github.janezhango.job;

import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaojing on 3/31/2016.
 */
@SpringBootApplication
@ComponentScan
public class Main {

    @Bean
    public JobListener listener() {
        return new JobListener();
    }

    @Bean
    public MessageListenerAdapter listenerAdapter(JobListener listener) {
        return new MessageListenerAdapter(listener, "receiveMessage");
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

package io.github.janezhango.mq;

/**
 * Created by xiaojing on 3/31/2016.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.janezhango.device.model.Device;
@RestController
public class JobPublisher {

    private static final String QUEUE_NAME = "job-queue";
    private static final String TOPIC_EXCHANGE = "job-exchange";

    @Autowired
    RabbitTemplate rabbitTemplate;

    private List<Job> repository;

    public JobPublisher() {
        repository = new ArrayList<Job>();
    }

    @Bean
    Queue queue() {
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(QUEUE_NAME);
    }

//    @RequestMapping("/sendall")
//    public Map<Long, Person> sendAllPersons() throws InterruptedException {
//        System.out.println("Sending message...");
//        rabbitTemplate.convertAndSend(QUEUE_NAME, repository.getAllPersons());
//        System.out.println("Message sent.");
//
//        return repository.getAllPersons();
//    }

    @RequestMapping("/createJob")
    public Job createJob(
            @RequestParam(value = "id", required = true) String id,
            @RequestParam(value = "name", required = true) String name) {

        Job job = new Job(id, name);
        repository.add(job);
        return job;
    }
}

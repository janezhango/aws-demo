package io.github.janezhango.job;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.janezhango.job.model.Job;

/**
 * Created by xiaojing on 3/31/2016.
 */
public class JobListener {
    private ObjectMapper mapper;

    public JobListener() {
        mapper = new ObjectMapper();
    }

    public void receiveMessage(String message) throws JsonProcessingException {
//        Iterator<Map.Entry<Integer, Job>> it = message.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, Job> pairs = (Map.Entry<Integer, Job>)it.next();
//            System.out.println(mapper.writeValueAsString(pairs.getValue()));
//            it.remove();
//        }
        if(message.equals("create job")){
            Job job = new Job();
            System.out.println("Job Created!!!");
        }
    }
}

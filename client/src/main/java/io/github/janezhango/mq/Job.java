package io.github.janezhango.mq;

/**
 * Created by xiaojing on 3/31/2016.
 */
public class Job {
    private String id = "uuid";
    private String name;

    public Job(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

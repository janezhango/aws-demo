package io.github.janezhango.app.model;

/**
 * Created by xiaojing on 3/31/2016.
 */
public class App {
    private String id;
    private String name;
    public App(){}
    public App(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package io.github.janezhango.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaojing on 3/31/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages={"io.github.janezhango.app.controller"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

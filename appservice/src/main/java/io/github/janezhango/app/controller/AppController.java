package io.github.janezhango.app.controller;

import io.github.janezhango.app.model.App;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaojing on 3/31/2016.
 */
@Controller
public class AppController {
    @RequestMapping("/app")
    @ResponseBody
    public App getApp() {
        return new App("1","test app");
    }
}

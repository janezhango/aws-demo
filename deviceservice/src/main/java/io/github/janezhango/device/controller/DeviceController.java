package io.github.janezhango.device.controller;

import io.github.janezhango.device.model.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaojing on 3/31/2016.
 */
@Controller
public class DeviceController {
    @RequestMapping("/device")
    @ResponseBody
    public Device getDevice() {
        return new Device("1","test device");
    }
}

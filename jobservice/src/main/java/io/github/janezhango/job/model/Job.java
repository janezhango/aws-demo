package io.github.janezhango.job.model;

import io.github.janezhango.app.model.App;
import io.github.janezhango.device.model.Device;

/**
 * Created by xiaojing on 3/31/2016.
 */
public class Job {
   private Device device;
   private App app;

   public Device getDevice() {
      return device;
   }

   public void setDevice(Device device) {
      this.device = device;
   }

   public App getApp() {
      return app;
   }

   public void setApp(App app) {
      this.app = app;
   }
}

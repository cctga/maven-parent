package com.example.eurekaclientorder.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Mao LuDong
 * @date : Created in 10:33 2020/9/10
 */
@Configuration
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {

  private static WebServerInitializedEvent event;

  public static int getPort() {
    return event.getWebServer().getPort();
  }

  @Override
  public void onApplicationEvent(WebServerInitializedEvent event) {
    ServiceInfoUtil.event = event;
  }
}

package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mao LuDong
 * @date : Created in 16:53 2020/9/10
 */
@RestController
@RequestMapping("/param")
public class ParamController {

  @Value("${clientParam}")
  private String clientParam;

  @GetMapping("/client")
  public String getParam() {
    return this.clientParam;
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello world!";
  }

}

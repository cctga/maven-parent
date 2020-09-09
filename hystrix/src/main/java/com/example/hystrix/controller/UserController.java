package com.example.hystrix.controller;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : Mao LuDong
 * @date : Created in 20:43 2020/9/8
 */
@RestController
public class UserController {

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/findOrderByUser/{userId}")
  @Hystrix(fallbackHandler = )
  public String findOrderByUser(@PathVariable String userId) {
    String orderId = userId;
    return restTemplate.getForObject("http://eureka-user-order-1/order/" + orderId, String.class);
  }

}

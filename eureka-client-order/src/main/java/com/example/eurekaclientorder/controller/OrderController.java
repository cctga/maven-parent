package com.example.eurekaclientorder.controller;

import com.example.eurekaclientorder.config.ServiceInfoUtil;
import com.example.eurekaclientorder.po.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mao LuDong
 * @date  : Created in 20:11 2020/9/8
 */
@RestController
@RequestMapping("/order")
public class OrderController {

  @GetMapping("/{id}")
  public String findOrderById(@PathVariable String id) {
    int port = ServiceInfoUtil.getPort();
    System.out.println(port);
    Order order = new Order();
    order.setId(id);
    order.setPrice(100.02);
    order.setReceiverAddress("杭州拱墅区");
    order.setReceiverName("毛鲁东");
    order.setReceiverPhone("15726817106");
    return order.toString();
  }
}

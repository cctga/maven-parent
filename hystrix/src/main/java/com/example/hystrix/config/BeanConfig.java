package com.example.hystrix.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Mao LuDong
 * @date : Created in 20:39 2020/9/8
 */
@Configuration
public class BeanConfig {

  @Bean
  // 使用 Ribbon 进行客户端的负载均衡，当使用本实例来进行服务调用时，Ribbon 就会自动的进行均衡
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}

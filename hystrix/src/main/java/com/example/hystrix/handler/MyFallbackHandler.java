package com.example.hystrix.handler;

import com.netflix.hystrix.HystrixInvokableInfo;
import com.netflix.ribbon.hystrix.FallbackHandler;
import rx.Observable;

import java.util.Map;

/**
 * @author : Mao LuDong
 * @date : Created in 23:04 2020/9/9
 */
public class MyFallbackHandler implements FallbackHandler<String> {

  @Override
  public Observable<String> getFallback(
      HystrixInvokableInfo<?> hystrixInvokableInfo, Map<String, Object> map) {
    return null;
  }
}

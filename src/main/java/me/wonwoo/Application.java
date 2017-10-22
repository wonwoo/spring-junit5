package me.wonwoo;

import me.wonwoo.service.HelloService;
import me.wonwoo.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Application {

  @Bean
  HelloService helloService() {
    return () -> "hello world";
  }

  @Profile("default")
  static class TestOrder {

    @Bean
    OrderService orderService() {
      return name -> "hello " + name;
    }
  }
  @Profile("dev")
  static class DevOrder {

    @Bean
    OrderService devOrderService() {
      return name -> "hello dev " + name;
    }
  }
}

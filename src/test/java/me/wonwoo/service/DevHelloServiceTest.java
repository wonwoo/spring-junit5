package me.wonwoo.service;

import me.wonwoo.annotation.DevTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DevTestConfig
class DevHelloServiceTest {
  private final OrderService orderService;

  @Autowired
  DevHelloServiceTest(OrderService orderService) {
    this.orderService = orderService;
  }

  @Test
  void hello() {
    assertEquals(orderService.ordered("wonwoo"), "hello dev wonwoo");
  }
}

package me.wonwoo.service;

import me.wonwoo.Application;
import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(Application.class)
class RepeatedHelloServiceTests {

  @RepeatedTest(10)
  void ordered(@Autowired OrderService orderService) {
    assertEquals(orderService.ordered("wonwoo"), "hello wonwoo");
  }
}

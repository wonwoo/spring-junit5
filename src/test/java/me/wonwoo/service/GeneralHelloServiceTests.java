package me.wonwoo.service;

import me.wonwoo.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Application.class)
class GeneralHelloServiceTests {

  private final HelloService helloService;

  @Autowired
  GeneralHelloServiceTests(HelloService helloService) {
    this.helloService = helloService;
  }

  @Test
  void parametersHello(@Autowired HelloService helloService) {
    assertEquals(helloService.hello(), "hello world");
  }
  @Test
  void constructorHello() {
    assertEquals(this.helloService.hello(), "hello world");
  }

}
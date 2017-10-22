package me.wonwoo.service;

import me.wonwoo.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(Application.class)
class AnnotationHelloServiceTests {

  private final HelloService helloService;

  @Autowired
  AnnotationHelloServiceTests(HelloService helloService) {
    this.helloService = helloService;
  }

  @Test
  void parametersHello(@Autowired HelloService helloService) {
    assertEquals(helloService.hello(), "hello world");
  }

  @Test
  void constructorHello(@Autowired HelloService helloService) {
    assertEquals(this.helloService.hello(), "hello world");
  }

}
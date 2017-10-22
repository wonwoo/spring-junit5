package me.wonwoo.annotation;

import me.wonwoo.Application;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@SpringJUnitConfig(Application.class)
@ActiveProfiles("dev")
public @interface DevTestConfig {
}

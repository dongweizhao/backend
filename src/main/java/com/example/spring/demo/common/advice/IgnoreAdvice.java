package com.example.spring.demo.common.advice;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface IgnoreAdvice {
}

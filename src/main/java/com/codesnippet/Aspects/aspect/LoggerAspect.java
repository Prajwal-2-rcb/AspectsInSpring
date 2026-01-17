package com.codesnippet.Aspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* com.codesnippet.Aspects.controller.HelloController.sayHello(..))")
    public void log()
    {
        System.out.println("Aspect log called");
    }
}

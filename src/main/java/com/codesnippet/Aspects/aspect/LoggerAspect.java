package com.codesnippet.Aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("execution(* com.codesnippet.Aspects.controller.*.*(..))")
    public void controllerPointcut() {}

    @Around("controllerPointcut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("Aspect log called");
        Object result = joinPoint.proceed();
        System.out.println("Aspect log executed");
        return result;
    }
}

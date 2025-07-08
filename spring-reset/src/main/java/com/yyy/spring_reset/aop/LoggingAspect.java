package com.yyy.spring_reset.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

   @Before("execution(* com.yyy.spring_reset.repo.JobRepo.*(..))")
    public void logMethodCall() {
        LOGGER.info("Method in JobService was called");
    }
    @After("execution(* com.yyy.spring_reset.repo.JobRepo.*(..))")
    public void logMethodAfterCall() {
        LOGGER.info("Method in JobService was called and executed successfully");
    }
}

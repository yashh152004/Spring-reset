package com.yyy.spring_reset.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitor {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(PerformanceMonitor.class);

    @Around("execution(* com.yyy.spring_reset.repo.JobRepo.*(..))")
    public Object monitorTime(ProceedingJoinPoint joinPoint) throws Throwable
    {
        long start = System.currentTimeMillis();


        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();


        LOGGER.info("Time taken: "+(end-start)+" milliseconds");
        return result;
    }
}

package com.yyy.spring_reset.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Validation {
     private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Validation.class);
     @Around("execution(* com.yyy.spring_reset.repo.JobRepo.*(..)) && args(postId)")

     public Object validatePostId(ProceedingJoinPoint joinPoint,int postId) throws Throwable
     {
             if(postId <0)
             {
                 LOGGER.info("PostId cannot be negative");
                 postId = 0;
                 LOGGER.info("PostId set to 0");
             }
        Object obj=joinPoint.proceed(new Object[]{postId});
         return obj;
     }
     }
    


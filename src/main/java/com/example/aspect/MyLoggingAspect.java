package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.example.dao.*.*(..))")
    public Object aroundAllRepositoryMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature)  proceedingJoinPoint.getSignature();

        String name = methodSignature.getName();

        System.out.println("Begin of " + name);


        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("End of " + name);

        return targetMethodResult;
    }

}

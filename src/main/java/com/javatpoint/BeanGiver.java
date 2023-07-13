package com.javatpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//@EnableAspectJAutoProxy
//public class BeanGiver {
//
//    @Pointcut("execution(* BeanExample.*(..))")
//    public void k(){}//pointcut name
//
//    @Before("k()")//applying pointcut on before advice
//    public void sh(JoinPoint jp, Object obj) {
//        System.out.println("hi da....");
//      //  System.out.println("signature.. "+jp.getSignature());
//    }
//}

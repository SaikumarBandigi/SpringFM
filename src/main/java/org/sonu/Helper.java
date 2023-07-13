package org.sonu;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

    @Pointcut("execution(* Alien.*(..))")
    public void k() {
    }

    @Before("k()")
    public void log() {
        System.out.println("log called..");
    }
}

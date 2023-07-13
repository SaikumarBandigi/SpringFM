package org.sonu;

/*
Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. But the key unit of modularity is aspect than class.

AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.

A cross-cutting concern is a concern that can affect the whole application and should be centralized in one location in code as possible,
 such as transaction management, authentication, logging, security etc.

 AOP Concepts and Terminology
AOP concepts and terminologies are as follows:

Join point
Advice
Pointcut
Introduction
Target Object
Aspect
Interceptor
AOP Proxy
Weaving

Join point
Join point is any point in your program such as method execution, exception handling, field access etc. Spring supports only method execution join point.

Advice
Advice represents an action taken by an aspect at a particular join point. There are different types of advices:

Before Advice: it executes before a join point.
After Returning Advice: it executes after a joint point completes normally.
After Throwing Advice: it executes if method exits by throwing an exception.
After (finally) Advice: it executes after a join point regardless of join point exit whether normally or exceptional return.
Around Advice: It executes before and after a join point.
Pointcut
It is an expression language of AOP that matches join points.

Introduction
It means introduction of additional method and fields for a type. It allows you to introduce new interface to any advised object.

Target Object
It is the object i.e. being advised by one or more aspects.
It is also known as proxied object in spring because Spring AOP is implemented using runtime proxies.

Aspect
It is a class that contains advices, joinpoints etc.

Interceptor
It is an aspect that contains only one advice.

AOP Proxy
It is used to implement aspect contracts, created by AOP framework. It will be a JDK dynamic proxy or CGLIB proxy in spring framework.

Weaving
It is the process of linking aspect with other application types or objects to create an advised object.
 Weaving can be done at compile time, load time or runtime. Spring AOP performs weaving at runtime.

AOP Implementations
AOP implementations are provided by:

AspectJ
Spring AOP
JBoss AOP
Spring AOP
Spring AOP can be used by 3 ways given below. But the widely used approach is Spring AspectJ Annotation Style. The 3 ways to use spring AOP are given below:

By Spring1.2 Old style (dtd based) (also supported in Spring3)
By AspectJ annotation-style
By Spring XML configuration-style(schema based)

 */


import org.springframework.stereotype.Component;

@Component
public class Alien {

    public void show()
    {
        System.out.println("Alien show ");
    }
    public void show1()
    {
        System.out.println("Alien show 1");
    }
}

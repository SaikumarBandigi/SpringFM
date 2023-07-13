package com.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        // Register the bean class
        context.register(MyBean.class);
//
//        // Refresh the application context
        context.refresh();

        // Get a bean from the context
        MyBean myBean = context.getBean(MyBean.class);

        // Use the bean
        myBean.doSomething();

        // Close the application context
        context.close();
    }
}


/*
Note:

*if you are using  AnnotationConfigApplicationContext then watch out this..
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCfg.class);
        Karthika karthika = context.getBean(Karthika.class);
        karthika.kar();
---------------------------------------------------------------------------------------------------------------
* if you are using java based configuration if you use @Bean then @Component is no need
if you use @ComponentScan(basePackages ="com.lifecycle") then @Component is needed..
---------------------------------------------------------------------------------------------------------------
* if you are passing null then refresh or refresh is no need...
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCfg.class); -- no need
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); -- refresh is needed
--------------------------------------------------------------------------------------------------------------
* if you are registering in main class then @Component is optional

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        // Register the bean class
       context.register(MyBean.class);
//
//        // Refresh the application context
        context.refresh();
________________________________________________________________________________________________________________________________________________________

 */

/*
The lifecycle of a bean in Spring consists of the following phases:

1) Instantiation: At this stage, the bean is created by the container. This can occur through various mechanisms such as constructor invocation,
 factory methods, or object cloning.

2) Dependency Injection: After instantiation, dependencies of the bean are injected. Spring resolves dependencies either through setter methods,
constructor arguments, or autowiring.

3) Initialization: Once the dependencies are resolved, the bean's initialization phase begins. This phase involves two options:

a. Bean initialization callbacks: Spring provides two ways to define initialization callbacks for a bean.
 The first approach is by implementing the InitializingBean interface and overriding the afterPropertiesSet() method.
 The second approach is to annotate a method with the @PostConstruct annotation. These callbacks allow you to perform any necessary initialization logic.

b. Custom initialization methods: Additionally, you can define custom initialization methods by specifying an init-method attribute in XML configuration
or using the @Bean(initMethod = "...") annotation in Java configuration.
These methods will be invoked after dependency injection and before the bean is ready for use.

4) Bean Ready for Use: After the initialization phase, the bean is ready to be used by other components in the application. It is now in the usable state.

5) Usage: The bean is utilized by the application to perform its intended functionality.

6) Destruction: When the application or the Spring container is shutting down, the destruction phase begins. This phase involves two options:

a. Bean destruction callbacks: Spring provides two ways to define destruction callbacks for a bean.
 The first approach is by implementing the DisposableBean interface and overriding the destroy() method. The second approach is to annotate a method
 with the @PreDestroy annotation. These callbacks allow you to perform any necessary cleanup or releasing of resources.

b. Custom destruction methods: Similar to custom initialization methods, you can define custom destruction methods by specifying a destroy-method
attribute in XML configuration or using the @Bean(destroyMethod = "...") annotation in Java configuration.
These methods will be invoked before the bean is destroyed, allowing you to perform any necessary cleanup logic.

7) Bean Destruction: At this stage, the bean is destroyed, and any resources associated with the bean are released.

It's important to note that Spring manages the lifecycle of beans automatically within its container. The container is responsible for instantiating,
initializing, using, and destroying the beans based on their configuration and the container's lifecycle.

By understanding the bean lifecycle, you can leverage initialization and destruction callbacks to perform setup and cleanup tasks for your beans,
 ensuring their proper management within the Spring container.
 */
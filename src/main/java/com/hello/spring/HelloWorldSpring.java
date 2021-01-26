package com.hello.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldSpring {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);

        renderer.render();
    }
}

package com.xiaolee.demo;

import com.xiaolee.demo.beans.Child;
import com.xiaolee.demo.beans.Component1;
import com.xiaolee.demo.beans.Component2;
import com.xiaolee.demo.beans.Parent;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.MergedAnnotation;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.annotation.Annotation;

//@SpringBootApplication(scanBasePackages = {"com.xiaolee.demo"})
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.xiaolee.demo"})
//@PropertySource(value = {"classpath:application.properties"})
//@Import(Component2.class)
@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
//        ValidatorFactory validFactory = Validation.buildDefaultValidatorFactory();
//        Validator validator = validFactory.getValidator();


        // 非web应用，spring core context
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartApplication.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println(context.getBean("component1").toString());

        // web应用，包含 tomcat server
//        AnnotationConfigServletWebServerApplicationContext context = new AnnotationConfigServletWebServerApplicationContext(StartApplication.class);

        // spring boot web
        SpringApplication.run(StartApplication.class);
    }
}

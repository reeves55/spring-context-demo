package com.xiaolee.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class Component1 {
    @Value("${name}")
    @Valid
    public String name;

//    @Autowired
//    private Component2 component2;

//    public Component2 getComponent2() {
//        return component2;
//    }
//
//    public void setComponent2(Component2 component2) {
//        this.component2 = component2;
//    }

//    public Component1(Component2 component2) {
////        this.name = "hahaha";
//        this.component2 = component2;
//        System.out.println("Component1 constructor called...");
//    }


    @Override
    public String toString() {
        return "Component1{" +
                '}';
    }
}

package com.xiaolee.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
public class Component2 {
    @Autowired
    public Component1 component1;

//    public void setComponent1(Component1 component1) {
//        this.component1 = component1;
//    }
//
//    public Component2() {
//        System.out.println("Component2 constructor called...");
//    }


    @Override
    public String toString() {
        return "Component2{}";
    }
}

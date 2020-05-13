package com.xiaolee.demo.beans;

public class ChildFactory {
    public Child newChild() {
        return new Child("haha", 10);
    }

//    public Component2 newChild() {
//        //return new Child("haha", 10);
//        return new Component2();
//    }
}

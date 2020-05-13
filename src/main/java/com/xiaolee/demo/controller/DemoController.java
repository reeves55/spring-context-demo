package com.xiaolee.demo.controller;

import com.xiaolee.demo.beans.Child;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController {
    @PostMapping("/test")
    public String demo(@RequestBody @Valid Child child) {
        return "success";
    }
}

package com.xiaolee.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.xiaolee.demo.beans.Child;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @PostMapping("/test")
    public String demo(@RequestBody @Valid Child child) {
        return "success";
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), Child.class).sheet("模板").doWrite(data());
    }

    private List<Child> data() {
        List<Child> data = new ArrayList<>(100);
        for (int i=0; i< 100; i++) {
            Child child = new Child();
            child.setName("name "+ i);
            child.setAge(i);
            data.add(child);
        }

        return data;
    }
}

package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.service.WebService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class WebController {

    @Resource
    WebService webService;

    @GetMapping(value = "hello")
    public  Result hello() {
        return Result.success();
    }

    @GetMapping(value = "hello2")
    public  Result hello2() {
        Map<Object,Object> map = webService.hello2();
        return Result.success(map);
    }

}

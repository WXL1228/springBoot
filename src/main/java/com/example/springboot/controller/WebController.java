package com.example.springboot.controller;

import com.example.springboot.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class WebController {

    @GetMapping(value = "hello")
    public  Result hello() {
        return Result.success();
    }

    @GetMapping(value = "hello2")
    public  Result hello2() {
        Map<Object,Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        for(int i = 0; list.size() < 10; i++){
            list.add("hello" + i);
        }
        map.put("hello2",list);
        map.put("hello","world");
        return Result.success(map);
//        return map;
    }

}

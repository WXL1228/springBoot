package com.example.springboot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WebService {


    public Map<Object, Object> hello2() {

        Map<Object,Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        for(int i = 0; list.size() < 10; i++){
            list.add("hello" + i);
        }
        map.put("hello2",list);
        map.put("hello","world");
        return map;
    }
}

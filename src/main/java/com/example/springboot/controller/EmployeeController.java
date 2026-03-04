package com.example.springboot.controller;


import com.example.springboot.common.Result;
import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mployee")
public class EmployeeController {


    @Resource
    private EmployeeService employeeService;

    @GetMapping(value = "findAll")
    public Result findAll() {
        List<Employee> list = employeeService.findAll();
        return Result.success(list);
    }
}

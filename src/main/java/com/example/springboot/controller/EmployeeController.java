package com.example.springboot.controller;


import com.example.springboot.common.Result;
import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/mployee")
public class EmployeeController {


    @Resource
    private EmployeeService employeeService;


    /**
     * 查询全部
     *
     */
    @GetMapping(value = "findAll")
    public Result findAll() {
        List<Employee> list = employeeService.findAll();
        return Result.success(list);
    }


    //    id name age 查询
    @GetMapping(value = "selectById")
    public Result selectById(@RequestParam(required = false) Integer id) {
        Employee employee = employeeService.selectById(id);
        return Result.success(employee);
    }


    /**
     * 条件查询
     *
     * @param employee
     */
    @PostMapping(value = "selectList")
    public Result selectList(Employee employee) {
        List<Employee> list = employeeService.selectList(employee);
        return Result.success(list);
    }


    /**
     * 分页查询
     *
     * @param employee
     * @param pageNum
     * @param pageSize
     */
    @PostMapping(value = "selectPage")
    public Result selectPage(@RequestBody Employee employee, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo<Employee> list = employeeService.selectPage(employee, pageNum, pageSize);
        return Result.success(list);
    }


    /**
     * 新增
     *
     * @param employee
     */
    @PostMapping(value = "add")
    public Result insert(@RequestBody Employee employee) {
        employeeService.insert(employee);
        return Result.success();
    }
}

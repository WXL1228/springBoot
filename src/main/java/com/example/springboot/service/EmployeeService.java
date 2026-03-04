package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.mapper.EmployeeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> findAll() {
        List<Employee> list = employeeMapper.findAll();
        return list;
    }
}

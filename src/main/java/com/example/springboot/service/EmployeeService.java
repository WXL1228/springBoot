package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.mapper.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> findAll() {
//        List<Employee> list = employeeMapper.findAll();
        return employeeMapper.findAll();
    }

    public List<Employee> selectById(Integer id, String name, Integer age) {
//        List<Employee> list = employeeMapper.selectById(id, name, age);
        return employeeMapper.selectById(id, name, age);
    }

    public List<Employee> selectList(Employee employee) {
        List<Employee> list = employeeMapper.selectList(employee);
        System.out.println("selectList" + employee);
        return list;
    }

    public PageInfo<Employee> selectPage(Employee employee, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Employee> list = employeeMapper.selectList(employee);
        return PageInfo.of(list);
    }
}

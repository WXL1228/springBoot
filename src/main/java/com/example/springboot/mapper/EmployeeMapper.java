package com.example.springboot.mapper;

import com.example.springboot.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> findAll();

    Employee selectById(@Param("id") Integer id
    );

    List<Employee> selectList(Employee employee);

    void insert(Employee employee);

    void update(Employee employee);

    Employee selectByName(String name);
}

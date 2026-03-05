package com.example.springboot.mapper;

import com.example.springboot.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> findAll();

    List<Employee> selectById(@Param("id") Integer id,
                              @Param("name") String name,
                              @Param("age") Integer age);

    List<Employee> selectList(Employee employee);
}

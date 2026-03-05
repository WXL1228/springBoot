package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.exception.CustomException;
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

    public Employee selectById(Integer id) {

        return employeeMapper.selectById(id);
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

    public void insert(Employee employee) {
        if (employee.getId() == null) {
            if (employee.getName() == null) {
                throw new CustomException("名称不能为空");
            }

            Employee existingDataName = employeeMapper.selectByName(employee.getName());
            if (existingDataName != null) {
                throw new CustomException("改名字已被占用");
            } else {
                employeeMapper.insert(employee);
            }

        } else {
            Employee existingDataId = employeeMapper.selectById(employee.getId());
            if (existingDataId == null) {
                throw new CustomException("id信息不正确");
            }
            Employee existingDataName = employeeMapper.selectByName(employee.getName());
            System.out.println("existingDataName=" + existingDataName);
            if (existingDataName != null) {
                throw new CustomException("改名字已被占用");
            } else {
                employeeMapper.update(employee);
            }
        }
    }
}

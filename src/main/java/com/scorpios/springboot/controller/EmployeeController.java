package com.scorpios.springboot.controller;

import com.scorpios.springboot.bean.Employee;
import com.scorpios.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Think
 * @Title: EmployeeController
 * @ProjectName springboot-data-cache
 * @Description: TODO
 * @date 2018/12/1220:40
 */

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {

        Employee employee = employeeService.getEmpById(id);
        return employee;
    }


    @GetMapping("/emp/del/{id}")
    public Employee delEmpById(@PathVariable("id") Integer id) {

        Employee employee = employeeService.getEmpById(id);
        return employee;
    }


    @GetMapping("/emp/modigy/{id}")
    public Employee updateEmpById(@PathVariable("id") Integer id) {

        Employee employee = employeeService.getEmpById(id);
        return employee;
    }


}

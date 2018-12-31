package com.scorpios.springboot.service;

import com.scorpios.springboot.bean.Employee;
import com.scorpios.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Think
 * @Title: EmployeeService
 * @ProjectName springboot-data-cache
 * @Description: TODO
 * @date 2018/12/1220:39
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id) {
        System.out.println("查询" + id + "员工");
        return employeeMapper.getEmpById(id);
    }

}

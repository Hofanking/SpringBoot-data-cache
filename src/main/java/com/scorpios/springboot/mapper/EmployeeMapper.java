package com.scorpios.springboot.mapper;

import com.scorpios.springboot.bean.Department;
import com.scorpios.springboot.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;


@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Delete("delete from where id=#{id}")
    public int deleteEmpById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into employee(lastName,email,gender,d_id) values (#{lastName},#{email},#{gender},#{d_id})")
    public int insertEmp(Employee employee);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public int updateEmp(Employee employee);

}

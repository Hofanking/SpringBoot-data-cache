package com.scorpios.springboot.mapper;

import com.scorpios.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author Think
 * @Title: DepartmentMapper
 * @ProjectName springboot-data-mybatis
 * @Description: TODO
 * @date 2018/12/1121:28
 */

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}

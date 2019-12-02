package com.mapper;
import com.po.po;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LoginMapper {


    @Select("select d_id,d_department,d_name  from department limit 1")
    @Results(value = {
            @Result(column = "d_id", property = "d_id", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Result(column = "d_department", property = "d_department", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(column = "d_name", property = "d_name", javaType = String.class, jdbcType = JdbcType.VARCHAR)})
    List<po> list();

}

package com.tottimctj.springboot.demo.dao;

import com.tottimctj.springboot.demo.bean.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.Entity;
import java.lang.reflect.ParameterizedType;

// 使用@Repository注解标注这是一个持久化操作对象
@Repository
public class UserDao <T> {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public User selecetByUserName(String name) {
        //定一个SQL语句
        //定义一个RowMapper
        //执行一个查询方法

        String sql = "select * from user where name = ?";
        RowMapper rowMapper = new BeanPropertyRowMapper<>(User.class);
        User user = (User) jdbcTemplate.queryForObject(sql, new Object[]{name},rowMapper);
        return user;
    }


    // sql方式访问数据
    // Class<? extends Entity>  继承于Entity的Class
    public T selectBySql(String sql, Object[] args, Class<? extends Entity> mappedClass) {

        RowMapper rowMapper = new BeanPropertyRowMapper<>(mappedClass);
        T result = (T) jdbcTemplate.queryForObject(sql, args ,rowMapper);
        return result;
    }
}

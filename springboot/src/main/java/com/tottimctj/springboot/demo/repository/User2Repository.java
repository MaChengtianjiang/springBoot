package com.tottimctj.springboot.demo.repository;

import com.tottimctj.springboot.demo.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface User2Repository extends PagingAndSortingRepository<User,Integer> {


    // 查询方法以get/find/read开头
    // 条件属性用条件关键字连接
    public User findByName(String name);

    //如何编写JPQL语句

    //Hibernate -- HQL语句
    //JPQL 和HQL是类似的
    @Query("from User where name =:name")
    public User findUserByName(@Param("name") String name);
}

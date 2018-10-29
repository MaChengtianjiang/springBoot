package com.tottimctj.springboot.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//实体类持久化
@Entity
public class User {


    @Id //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //默认自增长
    private int id;//主键

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

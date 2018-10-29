package com.tottimctj.springboot.demo.repository;

import com.tottimctj.springboot.demo.bean.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {


}

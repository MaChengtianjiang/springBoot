package com.tottimctj.springboot.demo.service;


import com.tottimctj.springboot.demo.bean.User;
import com.tottimctj.springboot.demo.dao.UserDao;
import com.tottimctj.springboot.demo.repository.User2Repository;
import com.tottimctj.springboot.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;


/**
 * save,update ,delete 方法需要绑定事务.
 *
 * 使用@Transactional进行事务的绑定.
 *
 */

@Service
public class UserService<T> {

    @Resource
    private UserRepository userRepository;

    @Resource
    private User2Repository user2Repository;

    @Resource
    private  UserDao userDao;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }


    public User findByName(String name) {
        return user2Repository.findByName(name);
    }

    public User findByName2(String name) {
        return user2Repository.findUserByName(name);
    }

    public User selectByUserName(String name) {
        return  userDao.selecetByUserName(name);
    }

    public T selectBySql(String sql,Object[] args) {
        return (T) userDao.selectBySql(sql,args, User.class);
    }
}

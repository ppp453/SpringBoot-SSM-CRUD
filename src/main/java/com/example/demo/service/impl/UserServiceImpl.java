package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author jx
 * @date 2020/4/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getList() {
        return userDao.getList();
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public Integer insert(User user) {
        int id = new Random().nextInt(100000);
        user.setUserId(id);
        userDao.insert(user);
        return id;
    }

    @Override
    public boolean update(User user) {
        if (user.getUserId() == null) {
            //编辑时没有主键id, 抛出异常
            return false;
        }
        User userFromDB = userDao.getById(user.getUserId());
        if (userFromDB == null) {
            //没有查询到用户
            return false;
        }

        return userDao.updateByIdBySelective(user) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return userDao.deleteById(id) > 0;
    }
}

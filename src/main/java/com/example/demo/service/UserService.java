package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

/**
 * @author jx
 * @date 2020/4/7
 */
public interface UserService {
    /**
     * 获取user列表
     *
     * @return
     */
    List<User> getList();

    /**
     * 通过uid获取用户
     *
     * @return
     * @param id
     */
    User getById(Integer id);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     * 修改用户
     *
     * @param user
     */
    boolean update(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    boolean deleteById(Integer id);
}

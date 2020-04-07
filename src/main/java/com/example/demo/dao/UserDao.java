package com.example.demo.dao;

import com.example.demo.domain.User;

import java.util.List;

/**
 * @author jx
 * @date 2020/4/7
 */
public interface UserDao {
    /**
     * 获取全部
     *
     * @return
     */
    List<User> getList();

    /**
     * 通过id获取
     *
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 插入
     *
     * @param user
     * @return
     */
    boolean insert(User user);

    /**
     * 选择更新
     *
     * @param user
     * @return
     */
    int updateByIdBySelective(User user);

    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    int deleteById(Integer id);
}

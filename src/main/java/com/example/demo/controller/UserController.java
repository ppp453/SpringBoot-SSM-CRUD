package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jx
 * @date 2020/4/7
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> getList() {
        return userService.getList();
    }

    @RequestMapping("{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @RequestMapping("getById")
    public User getUserById(@RequestParam("id") Integer id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Integer insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        return userService.update(user) ? "ok" : "failed";
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.DELETE)
    public String deleteById(@RequestParam("id") Integer id) {

        return userService.deleteById(id) ? "ok" : "failed";
    }
}

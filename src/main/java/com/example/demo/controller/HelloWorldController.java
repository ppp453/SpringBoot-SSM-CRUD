package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jx
 * @date 2020/4/7
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld";
    }

}

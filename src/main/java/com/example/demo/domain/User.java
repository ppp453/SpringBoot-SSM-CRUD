package com.example.demo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author jx
 * @date 2020/4/7
 */
@Data
public class User {

    private Integer userId;

    private Integer deptId;

    private String userAccount;

    private String userPassword;

    private String userName;

    private String img;

    private Integer userAge;

    private String sex;

    private String userAddress;

    private Date userBirth;

    private String userPhone;

    private String email;

    private Date regTime;
}

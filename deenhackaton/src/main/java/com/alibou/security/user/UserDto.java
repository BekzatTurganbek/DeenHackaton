package com.alibou.security.user;


import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String localPhone;
}
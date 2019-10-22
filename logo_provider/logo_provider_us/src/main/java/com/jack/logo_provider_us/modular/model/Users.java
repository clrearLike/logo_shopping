package com.jack.logo_provider_us.modular.model;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("users")
public class Users implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String password_salt;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

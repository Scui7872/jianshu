package com.jianshu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
*@ClassName User
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
@Data
public class User implements Serializable {
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;
    private String address;
    private LocalDate joinDate;
    private String description;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User(Integer id, String account, String password, String nickname, String avatar, String address, LocalDate joinDate, String description) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.address = address;
        this.joinDate = joinDate;
        this.description = description;



    }
}


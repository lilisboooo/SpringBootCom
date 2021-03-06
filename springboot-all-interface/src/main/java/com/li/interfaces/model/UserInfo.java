package com.li.interfaces.model;

import java.io.Serializable;

/**
 * @author li
 * @create 2021-03-22 22:50
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 2130796602340979794L;
    private Integer id;
    private String nick;
    private String phone;
    private String address;
    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

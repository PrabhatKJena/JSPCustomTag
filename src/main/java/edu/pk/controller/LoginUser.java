package edu.pk.controller;

/**
 * Created by Dipti on 6/9/2016.
 */
public class LoginUser {
    private String userId;
    private String email;
    private Character sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                '}';
    }
}

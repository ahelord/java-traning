package com.ahelord.jdbctest;

public class User {
    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                '}';
    }
}

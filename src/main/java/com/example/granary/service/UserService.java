package com.example.granary.service;

public class UserService {
    private double username;
    private double password;

    public double getUsername() {
        return username;
    }

    public void setUsername(double username) {
        this.username = username;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "username=" + username +
                ", password=" + password +
                '}';
    }
}

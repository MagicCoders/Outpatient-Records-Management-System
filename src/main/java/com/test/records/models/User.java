package com.test.records.models;

import java.io.Serializable;

//User model
public class User implements Serializable{
    public String userId;
    public String name;
    public String staffId;
    public String nationalId;
    public String email;
    public String role;
    public String gender;
    public String password;

    public User(String userId, String name, String staffId, String nationalId, String email, String role, String gender, String password) {
        this.userId = userId;
        this.name = name;
        this.staffId = staffId;
        this.email = email;
        this.role = role;
        this.gender = gender;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

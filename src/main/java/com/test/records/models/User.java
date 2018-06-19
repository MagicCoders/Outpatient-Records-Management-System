package com.test.records.models;

public class User {
    private String userId;
    private String name;
    private String staffId;
    private String email;
    private String role;
    private String password;

    public User(String userId, String name, String staffId, String email, String role, String password) {
        this.userId = userId;
        this.name = name;
        this.staffId = staffId;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    private String getUserId() {
        return userId;
    }

    private void setUserId(String userId) {
        this.userId = userId;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getStaffId() {
        return staffId;
    }

    private void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getRole() {
        return role;
    }

    private void setRole(String role) {
        this.role = role;
    }
}

package com.test.records.models;

public class Student {
    private String rejNo;
    private String patinetId;
    private String name;

    public Student(String rejNo, String patinetId, String name) {
        this.rejNo = rejNo;
        this.patinetId = patinetId;
        this.name = name;
    }

    public String getRejNo() {
        return rejNo;
    }

    public void setRejNo(String rejNo) {
        this.rejNo = rejNo;
    }

    public String getPatinetId() {
        return patinetId;
    }

    public void setPatinetId(String patinetId) {
        this.patinetId = patinetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.test.records.models;

//Student Model

public class Student {
    private String regNo;
    private String patientId;
    private String name;

    public Student(String regNo, String patientId, String name) {
        this.regNo = regNo;
        this.patientId = patientId;
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

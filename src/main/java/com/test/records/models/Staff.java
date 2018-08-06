package com.test.records.models;

public class Staff {
    public String staffId;
    public String name;
    public String patientId;
    public String id;

    public Staff(String staffId, String name, String patientId, String id) {
        this.staffId = staffId;
        this.name = name;
        this.patientId = patientId;
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

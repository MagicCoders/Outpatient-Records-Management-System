package com.test.records.models;

public class Communuty {
    public String id;
    public String patientId;
    public String name;

    public Communuty(String id, String patientId, String name) {
        this.id = id;
        this.patientId = patientId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

package com.test.records.models;

public class Community {
    public int NationalId;
    public String patientId;
    public String name;

    public Community(int NationalId, String patientId, String name) {
        this.NationalId = NationalId;
        this.patientId = patientId;
        this.name = name;
    }

    public int getNationalId() {
        return NationalId;
    }

    public void setNationalId(int nationalId) {
        this.NationalId = nationalId;
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

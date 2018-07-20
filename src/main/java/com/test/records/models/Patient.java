package com.test.records.models;

import java.util.Date;

public class Patient {
    private String patientId;
    private String height;
    private int age;
    private int weight;
    private String doctor;
    private String prognosis;
    private String diagnosis;
    private String Tests;
    private String prescription;
    private Date date;

    public Patient(String patientId, String height, int age, int weight, String doctor, String prognosis, String diagnosis, String tests, String prescription, Date date) {
        this.patientId = patientId;
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.doctor = doctor;
        this.prognosis = prognosis;
        this.diagnosis = diagnosis;
        Tests = tests;
        this.prescription = prescription;
        this.date = date;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTests() {
        return Tests;
    }

    public void setTests(String tests) {
        Tests = tests;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

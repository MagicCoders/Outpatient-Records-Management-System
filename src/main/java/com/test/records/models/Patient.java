package com.test.records.models;

import org.springframework.data.annotation.Id;

import java.util.Date;


public class Patient {
//    @Id
    private String patientId;
    private String height;
    private String name;
    private String type;
<<<<<<< HEAD
    private String age;
    private String weight;
=======
    private int age;
    private int weight;
>>>>>>> master
    private String doctor;
    private String prognosis;
    private String diagnosis;
    private String tests;
    private String prescription;
    private Date date;

<<<<<<< HEAD

    public Patient(String patientId, String height, String name, String type, String age, String weight, String doctor, String prognosis, String diagnosis, String tests, String prescription, Date date) {
=======
    public Patient(String patientId, String height, String name, String type, int age, int weight, String doctor, String prognosis, String diagnosis, String tests, String prescription, Date date) {
>>>>>>> master
        this.patientId = patientId;
        this.height = height;
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.doctor = doctor;
        this.prognosis = prognosis;
        this.diagnosis = diagnosis;
        this.tests = tests;
        this.prescription = prescription;
        this.date = date;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
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
        return tests;
    }

    public void setTests(String tests) {
        tests = tests;
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

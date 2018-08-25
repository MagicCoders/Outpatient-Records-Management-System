package com.test.records.crud;

import com.test.records.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    void findByPatientId(String patientId);
}

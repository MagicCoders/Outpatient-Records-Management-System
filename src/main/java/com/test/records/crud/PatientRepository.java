package com.test.records.crud;

import com.test.records.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
    void findByName(String name);
<<<<<<< HEAD
    void findPatientsByAge(int age);
=======
>>>>>>> origin/wesley
}

package com.test.records.crud;

import com.test.records.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient findByPatientId(String patientId);
    List<Patient> findAllByType(String type);

}

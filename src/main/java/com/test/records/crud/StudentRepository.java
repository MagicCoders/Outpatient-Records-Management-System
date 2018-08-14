package com.test.records.crud;

import com.test.records.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentByRegNo(String regNo);
}

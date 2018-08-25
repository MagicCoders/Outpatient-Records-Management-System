package com.test.records.crud;

import com.test.records.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StaffRepository extends MongoRepository<Staff, String> {
    Staff findStaffByStaffId(String staffId);
}

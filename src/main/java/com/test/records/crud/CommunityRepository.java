package com.test.records.crud;

import com.test.records.models.Community;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommunityRepository extends MongoRepository<Community, Integer> {
    Community findByNationalId(int nationalId);
}

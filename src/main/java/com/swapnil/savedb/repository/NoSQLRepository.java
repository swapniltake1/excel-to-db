package com.swapnil.savedb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.swapnil.savedb.entity.NoSQLEntity;
@Repository
public interface NoSQLRepository extends MongoRepository<NoSQLEntity, String> {
   
}

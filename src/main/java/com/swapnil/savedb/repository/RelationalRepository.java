package com.swapnil.savedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swapnil.savedb.entity.RelationalEntity;

@Repository
public interface RelationalRepository extends JpaRepository<RelationalEntity, Long> {

	//void saveData(String tableName, Map<String, Object> data);
}

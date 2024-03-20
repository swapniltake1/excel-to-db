package com.swapnil.savedb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DynamicTableService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void createTable(String tableName) {
        String sql = "CREATE TABLE " + tableName + " ("
                     + "id BIGINT AUTO_INCREMENT PRIMARY KEY,"
                     + "data VARCHAR(2550),"
                     + ")";
        jdbcTemplate.execute(sql);
    }
}

package com.swapnil.savedb.controllers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.swapnil.savedb.service.ExcelService;

@Slf4j
@RestController
@RequestMapping("/api/save-to-db")
public class ExcelController {
    
    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadExcel(@RequestParam("file") MultipartFile file) {
        try {
            log.info("Received request to upload Excel file.");
            excelService.processExcel(file);
            log.info("Excel file uploaded and data stored successfully.");
            return ResponseEntity.ok("Excel file uploaded and data stored successfully.");
        } catch (Exception e) {
            log.error("Failed to upload Excel file.", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload Excel file: " + e.getMessage());
        }
    }
}
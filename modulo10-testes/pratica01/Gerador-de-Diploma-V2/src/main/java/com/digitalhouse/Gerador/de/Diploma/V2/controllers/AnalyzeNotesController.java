package com.digitalhouse.Gerador.de.Diploma.V2.controllers;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.services.CertificateServiceImpl;
import com.digitalhouse.Gerador.de.Diploma.V2.services.CertificateServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AnalyzeNotesController {

    private CertificateServiceInterface studentService = new CertificateServiceImpl();

    @PostMapping("/analyzeNotes")
    public ResponseEntity<StudentResponseDTO> generateDiploma(@RequestBody @Valid  StudentDTO studentDTO){
           return ResponseEntity.status(HttpStatus.CREATED).body(studentService.analyzeNotes(studentDTO));
    }
}
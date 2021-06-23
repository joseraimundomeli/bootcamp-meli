package com.digitalhouse.Gerador.de.Diploma.V2.services;

import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;

import java.util.List;

public interface CertificateServiceInterface {
    StudentResponseDTO analyzeNotes(StudentDTO student);
    Double calculateAvarege(List<Double> notes);
    String withHonors(Double average);
}

package com.digitalhouse.Gerador.de.Diploma.V2.services;

import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;

public interface StudentServiceInterface {
    StudentResponseDTO analyzeNotes(StudentDTO student);
}

package com.digitalhouse.Gerador.de.Diploma.V2.services;

import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.SubjectTDO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;

@Service
public class StudentService implements StudentServiceInterface {

    @Override
    public StudentResponseDTO analyzeNotes(StudentDTO student){

        DoubleSummaryStatistics statistics = student
                .getSubjects()
                .stream()
                .mapToDouble(SubjectTDO::getNote)
                .summaryStatistics();

        Double average = statistics.getAverage();
        average = Math.round(average * 100.0)/100.0;

        String message = "";
        if (average > 9){
            message = "Parabéns, "+ average +", aprovado com louvor!";
        }else{
            message = "Sua média foi de " + average + "!";
        }

        StudentResponseDTO studantResult = new StudentResponseDTO(
                message,
                average,
                student);

        return      studantResult;// new ResponseEntity<>(studantResult, HttpStatus.CREATED);
    }
}

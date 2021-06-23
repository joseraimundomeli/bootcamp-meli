package com.digitalhouse.Gerador.de.Diploma.V2.services;

import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.StudentResponseDTO;
import com.digitalhouse.Gerador.de.Diploma.V2.detos.SubjectTDO;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CertificateServiceImpl implements CertificateServiceInterface {

    @Override
    public StudentResponseDTO analyzeNotes(StudentDTO student){

        Double average = this.calculateAvarege(student.getSubjects()
                .stream()
                .map(SubjectTDO::getNote)
                .collect(Collectors.toList()));

        String message = this.withHonors(average);

        StudentResponseDTO studantResult = new StudentResponseDTO(
                message,
                average,
                student);

        return      studantResult;
    }

    @Override
    public Double calculateAvarege(List<Double> notes){
        DoubleSummaryStatistics statistics = notes
                .stream()
                .mapToDouble(value -> value)
                .summaryStatistics();

        Double average = statistics.getAverage();
        return Math.round(average * 100.0)/100.0;
    }

    @Override
    public String withHonors(Double average){
        String message = "";
        if (average > 9){
            message = "Parabéns, "+ average +", aprovado com louvor!";
        }else{
            message = "Sua média foi de " + average + "!";
        }
        return message;
    }
}

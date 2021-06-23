package com.digitalhouse.Gerador.de.Diploma.V2.detos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentResponseDTO {
    private String message;
    private Double average;
    private StudentDTO student;
}

package com.digitalhouse.Gerador.de.Diploma.V2.detos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;


@Getter @Setter @AllArgsConstructor
@Validated
public class StudentDTO {
    @NotNull(message = "O nome do aluno é obrigatório!")
    @Size(min = 8, max = 50, message = "O nome do aluno deve conter entre 8 e 50 caracteres!")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome do aluno deve conter apenas letras!")
    private String name;
    @Valid
    private List<SubjectTDO> subjects;
}

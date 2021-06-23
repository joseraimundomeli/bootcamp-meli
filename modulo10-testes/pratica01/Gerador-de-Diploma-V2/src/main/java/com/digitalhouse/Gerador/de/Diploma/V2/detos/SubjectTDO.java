package com.digitalhouse.Gerador.de.Diploma.V2.detos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;


@Getter @Setter @AllArgsConstructor
@Validated
public class SubjectTDO {

    @NotNull(message = "O campo matéria deve ser preenchido!")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "O nome da matéria deve conter apenas letras")
    @Size(min = 5, max = 50, message = "A o nome da matéria deve conter entre 8 e 50 caracteres!")
    private String subject;

    @NotNull(message = "A nota da matéria é obrigatório!")
    @Min(value = 0, message = "A nota deve ter valor maior que 0!")
    @Max(value = 10, message = "A nota deve ter valor menor que 10!")
    private Double note;

}

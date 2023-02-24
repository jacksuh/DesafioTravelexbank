package br.com.confidencecambio.javabasico.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ImcDto {

    @NotNull
    private double peso;
    @NotNull
    private double altura;



}

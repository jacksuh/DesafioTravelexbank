package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalculoIMC {

    private double peso;
    private double altura;



}

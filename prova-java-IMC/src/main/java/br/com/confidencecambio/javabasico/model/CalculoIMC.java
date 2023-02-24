package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CalculoIMC {

    private double peso;
    private double altura;


    public CalculoIMC(ImcDto dto) {
        this.peso = dto.getPeso();
        this.altura = dto.getAltura();
    }

}

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

    private double imc = peso / (altura * altura);




    public double CalculoIMC(ImcDto dto){
        this.peso = dto.getPeso();
        this.altura = dto.getAltura();

        this.imc = dto.getPeso() / (dto.getAltura() * dto.getAltura());


        return imc;

    }

}

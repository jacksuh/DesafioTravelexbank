package br.com.confidencecambio.javabasico.service;


import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.model.CalculoIMC;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.text.DecimalFormat;

@Service
public class CalculoImcService {

    public String CalculoIMC(ImcDto dto) {
        CalculoIMC c = new CalculoIMC();
        c.setPeso(dto.getPeso());
        c.setAltura(dto.getAltura());

        double v = c.getPeso() / (c.getAltura() * c.getAltura());

        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.UP);

        if (v <= 18.5) {
            return ("Sua Classificação é de Magreza --"+ " " + "IMC:" + " " + df.format(v));
        } else if (v > 18.5 && v <= 24.9) {
            return ("Sua Classificação Está Dentro do Normal --" + " " + "IMC:" +  df.format(v));
        } else if (v > 25.0 && v <= 29.9) {
            return ("Sua Classificação é de Sobrepeso I --" + " " + "IMC:" + df.format(v));
        } else if (v > 30.0 && v <= 39.9) {
            return ("Sua Classificação é Obesidade II --" +" " + "IMC:" + df.format(v));
        } else if (v >= 40.0) {
            return ("Sua Classificação é Obesidade Grave III ---" + " " + "IMC:" + df.format(v));
        }

        return null;
    }
    }






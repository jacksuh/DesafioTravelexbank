package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.model.CalculoIMC;
import br.com.confidencecambio.javabasico.service.CalculoImcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("imc")
@Slf4j
public class CalculoImcController {


    @Autowired
    private CalculoImcService service;

    @PostMapping
    public ResponseEntity cadastrarvalor(@RequestBody @Valid ImcDto dados){
        CalculoIMC c = new CalculoIMC();
        c.setPeso(dados.getPeso());
        c.setAltura(dados.getAltura());

        CalculoIMC c2 = CalculoIMC.builder()
                .peso(dados.getPeso())
                .altura(dados.getAltura())
                .build();


        String calculo = service.calculoIMC(c2);

        return ResponseEntity.ok(calculo);
    }

}


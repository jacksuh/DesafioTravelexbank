package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.model.CalculoIMC;
import br.com.confidencecambio.javabasico.service.CalculoImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("imc")
public class CalculoImcController {


    @Autowired
    private CalculoImcService service;

    @PostMapping
    public ResponseEntity cadastrarvalor(@RequestBody @Valid ImcDto dados){
        String calculo = service.CalculoIMC(dados);

        return ResponseEntity.ok(calculo);
    }

}


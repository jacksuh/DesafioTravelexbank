package br.com.confidencecambio.javabasico.model;


import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.service.CalculoImcService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImcTest {

    @Autowired
    private CalculoImcService service;

    @Test
    public void testeCalcular(){
        ImcDto c = new ImcDto();

        c.setPeso(93);
        c.setAltura(1.78);

        service.CalculoIMC(c);

        Assert.assertEquals(29, 29);

    }

}

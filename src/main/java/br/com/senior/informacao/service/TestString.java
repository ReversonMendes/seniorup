package br.com.senior.informacao.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestString {

    InformacaoService informacaoService = new InformacaoService();


    @Test
    public void testaNulo(){

        String inverso = informacaoService.reverseString(null);

        assertEquals(inverso, null);
    }

    @Test
    public void reverse(){

        String inverso = informacaoService.reverseString("reverson");

        assertEquals(inverso, "nosrever");
    }
}

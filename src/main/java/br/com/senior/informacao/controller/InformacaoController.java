package br.com.senior.informacao.controller;

import br.com.senior.informacao.domain.InformacaoResponse;
import br.com.senior.informacao.service.InformacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("informacao")
public class InformacaoController {

    @Autowired
    InformacaoService informacaoService;

    @Async
    @PostMapping
    public InformacaoResponse save(@RequestBody String informacao){
        return informacaoService.save(informacao);
    }

}


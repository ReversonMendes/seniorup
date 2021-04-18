package br.com.senior.informacao.service;

import br.com.senior.informacao.domain.Informacao;
import br.com.senior.informacao.domain.InformacaoResponse;
import br.com.senior.informacao.repository.InformacaoRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

@Service
public class InformacaoService {

    @Autowired
    InformacaoRepository informacaoRepository;

    public InformacaoResponse save(String valor) {
        Instant start = Instant.now();

        Informacao informacao = new Informacao();
        informacao.setInformacao(valor);

        informacaoRepository.save(informacao);

        InformacaoResponse response = new InformacaoResponse();

        //Utilizei o StringUtils para reverter a informação porém poderia fazer conforme método abaixo não utilizado;
        //# reverseString
        response.setInformacaoInverso(StringUtils.reverse(informacao.getInformacao()));

        Instant end = Instant.now();
        response.setTempoExecucao(Duration.between(start, end).toMillis());

        return response;
    }

    public String reverseString(String original){

        if(original == null) {
            return null;
        }

        char[] inverso = new char[original.length()];

        for (int i = 0; i < original.length(); i++) {
            inverso[i] = original.charAt(original.length() - 1 - i);
        }

        return String.valueOf(inverso);
    }

}

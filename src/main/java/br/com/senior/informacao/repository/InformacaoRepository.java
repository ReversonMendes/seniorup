package br.com.senior.informacao.repository;

import br.com.senior.informacao.domain.Informacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacaoRepository extends JpaRepository<Informacao, Long> {
}

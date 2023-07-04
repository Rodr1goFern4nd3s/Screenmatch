package br.com.alura.Screenmatch.domain.filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    /*Está interface representa um repositório de acesso a dados, ela que vai ser a responsável
     de acessar a tabela de filmes representada pela entidade Filme, utilizando herança herdando
     de outra interface do Spring
     */


}

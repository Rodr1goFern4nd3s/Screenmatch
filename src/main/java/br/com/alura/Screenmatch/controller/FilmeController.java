package br.com.alura.Screenmatch.controller;

import br.com.alura.Screenmatch.domain.filme.DadosCadastroFilme;
import br.com.alura.Screenmatch.domain.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    /*
    Com a anotação @Controller, indicamos que esta classe é um controlador, ou seja,
    ela vai receber requisições http
     */

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping
    public String carregaPaginaFormulario() {
        //Objetivo deste método é abrir o formulário no navegador

        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
    //Este método recebe os valores enviados nos campos do formulário

        var filme = new Filme(dados);
        filmes.add(filme);
        System.out.println(filmes);
        return "filmes/formulario";
    }
}

package br.com.alura.Screenmatch.controller;

import br.com.alura.Screenmatch.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    /*
    Com a anotação @Controller, indicamos que esta classe é um controlador, ou seja,
    ela vai receber requisições http
     */

    @GetMapping
    public String carregaPaginaFormulario() {
        //Objetivo deste método é abrir o formulário no navegador
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
    //Este método recebe os valores enviados nos campos do formulário
        System.out.println(dados);
        return "filmes/formulario";
    }
}

package br.com.alura.Screenmatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    /*
    Com a anotação @Controller, indicamos que esta classe é um controlador, ou seja,
    ela vai receber requisições http
     */

    @GetMapping("")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }
}

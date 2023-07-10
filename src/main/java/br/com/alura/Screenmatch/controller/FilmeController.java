package br.com.alura.Screenmatch.controller;

import br.com.alura.Screenmatch.domain.filme.DadosAlteracaoFilme;
import br.com.alura.Screenmatch.domain.filme.DadosCadastroFilme;
import br.com.alura.Screenmatch.domain.filme.Filme;
import br.com.alura.Screenmatch.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    /*
    Com a anotação @Controller, indicamos que esta classe é um controlador, ou seja,
    ela vai receber requisições http
     */

    @Autowired
    private FilmeRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model) { //Objetivo deste método é abrir o formulário no navegador
        if(id != null) {
            var filme = repository.getReferenceById(id);
            model.addAttribute("informacaoFilme", filme);
        }
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {
        //Toda vez que for navegar para a página de lista, temos que adicionar a variável lista no Model

        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraFilme(DadosCadastroFilme dados) {
    //Este método recebe os valores enviados nos campos do formulário

        var filme = new Filme(dados);
        repository.save(filme);
        //System.out.println(filmes);
        return "redirect:/filmes";
    }

    @PutMapping
    @Transactional
    public String alteraFilme(DadosAlteracaoFilme dados) {
        //Este método recebe os valores enviados do link Editar para atualizações
        var filme = repository.getReferenceById(dados.id()); //Aqui carrega o filme desejado, para ser editado
        filme.atualizaDados(dados);
        return "redirect:/filmes";
    }

    @DeleteMapping
    @Transactional
    public String removeFilme(Long id) {
        //System.out.println("Filme excluído");

        repository.deleteById(id);
        return "redirect:/filmes";
    }
}

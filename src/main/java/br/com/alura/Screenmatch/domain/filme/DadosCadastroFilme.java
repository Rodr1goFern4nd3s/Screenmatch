package br.com.alura.Screenmatch.domain.filme;

public record DadosCadastroFilme(String nome, Integer duracaoEmMinutos, Integer anoLancamento, String genero) {

    //Esta classe record vai representar os dados para cadastro dos filmes, que serão enviados pelo formulário.

}

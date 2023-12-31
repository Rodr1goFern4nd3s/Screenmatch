package br.com.alura.Screenmatch.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "duracao_em_minutos")
    private Integer duracaoEmMinutos;
    @Column(name = "ano_lancamento")
    private Integer anoDeLancamento;
    private String genero;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracaoEmMinutos();
        this.anoDeLancamento = dados.anoLancamento();
        this.genero = dados.genero();
    }

    public Filme() {

    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracaoEmMinutos();
        this.anoDeLancamento = dados.anoLancamento();
        this.genero = dados.genero();
    }
}

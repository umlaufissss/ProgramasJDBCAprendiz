package org.example.Model;

public class Livros
{
    private long id;
    private String nome_livro;
    private String autor_livro;
    private int ano_lancamento;
    private String status_disponivel;

    public Livros(String status_disponivel, long id, String nome_livro, String autor_livro, int ano_lancamento) {
        this.status_disponivel = status_disponivel;
        this.id = id;
        this.nome_livro = nome_livro;
        this.autor_livro = autor_livro;
        this.ano_lancamento = ano_lancamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus_disponivel() {
        return status_disponivel;
    }

    public void setStatus_disponivel(String status_disponivel) {
        this.status_disponivel = status_disponivel;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }
}

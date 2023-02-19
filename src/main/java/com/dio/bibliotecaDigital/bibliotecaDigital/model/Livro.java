package com.dio.bibliotecaDigital.bibliotecaDigital.model;

import org.springframework.stereotype.Component;

@Component
public class Livro {
    private Integer idLivro;
    private String titulo;
    private String genero;
    private String autor;
    private Integer numPaginas;

    public Livro(int idLivro, String titulo, String genero, String autor, Integer numPaginas) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + ", Genero: " + genero + "\nAutor: " + autor + ", Número de paginas: " + numPaginas;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

}

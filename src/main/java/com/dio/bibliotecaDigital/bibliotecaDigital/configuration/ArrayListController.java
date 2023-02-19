package com.dio.bibliotecaDigital.bibliotecaDigital.configuration;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.dio.bibliotecaDigital.bibliotecaDigital.model.Livro;

@Component
public class ArrayListController {
    private List<Livro> listaLivro;

    public ArrayListController(){
        listaLivro = new ArrayList<>();
        listaLivro.add(new Livro(1, "O senhor do anéis: A sociedade do Anel", "Fantasia", "J. R. R. Tolkien", 576));
        listaLivro.add(new Livro(2, "As vantagens de ser invisível", "Ficção Juvenil", "Stephen Chbosky", 233));
    }

    public List<Livro> getListaLivro(){
        return listaLivro;
    }

    public void setListaLivro(Livro livro) {
        listaLivro.add(livro);
    }
}

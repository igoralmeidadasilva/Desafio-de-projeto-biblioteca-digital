package com.dio.bibliotecaDigital.bibliotecaDigital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import com.dio.bibliotecaDigital.bibliotecaDigital.configuration.ArrayListController;
import com.dio.bibliotecaDigital.bibliotecaDigital.model.Livro;

@Component
public class MyApp implements CommandLineRunner{
    
    @Autowired
    private Livro livro;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---\tAcervo de livros da biblioteca digital\t---");
        ApplicationContext context = SpringApplication.run(ArrayListController.class, args);
        ArrayListController lista = context.getBean(ArrayListController.class);
        livro.setIdLivro(3);
        livro.setGenero("Ficção Científica");
        livro.setAutor("George Orwell");
        livro.setNumPaginas(364);
        livro.setTitulo("1984");
        lista.setListaLivro(livro);
        System.out.println(lista.getListaLivro());
    }

}

package br.com.projeto.test;

import br.com.projeto.model.Produto;
import br.com.projeto.repository.ProdutoRepository;

import java.util.List;

public class TesteListar {

    public static void main (String args[]){

       ProdutoRepository produtoRepository = new ProdutoRepository();

        List<Produto> produtos = produtoRepository.listar();

        for (Produto produto: produtos ) {

            System.out.println(produto);
        }
    }
}

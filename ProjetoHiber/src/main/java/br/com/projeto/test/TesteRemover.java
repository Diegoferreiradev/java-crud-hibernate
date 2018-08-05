package br.com.projeto.test;

import br.com.projeto.model.Produto;
import br.com.projeto.repository.ProdutoRepository;

public class TesteRemover {

    public static void main(String args[]){

        ProdutoRepository produtoRepository = new ProdutoRepository();

        Produto produto = produtoRepository.remover(10);

        System.out.println(produto.getNome());
    }
}

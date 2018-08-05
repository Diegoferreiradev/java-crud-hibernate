package br.com.projeto.test;


import br.com.projeto.model.Produto;
import br.com.projeto.repository.ProdutoRepository;

public class TesteAtualizar {

    public static void main(String args[]){

    Produto produto = new Produto();

    ProdutoRepository produtoRepository = new ProdutoRepository();

    produtoRepository.atualizar(produto);


    }
}

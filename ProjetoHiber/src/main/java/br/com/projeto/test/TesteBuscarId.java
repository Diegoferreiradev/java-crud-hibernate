package br.com.projeto.test;

import br.com.projeto.model.Produto;
import br.com.projeto.repository.ProdutoRepository;

public class TesteBuscarId {

    public static void main(String args[]){

        ProdutoRepository produtoRepository = new ProdutoRepository();

        Produto produto = produtoRepository.buscarId(11);

        System.out.println(produto.getMarca());
    }
}

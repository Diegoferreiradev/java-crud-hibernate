package br.com.projeto.test;

import br.com.projeto.model.Produto;
import br.com.projeto.repository.ProdutoRepository;

public class TesteInserir {

    public static void main(String args[]){

        Produto produto = new Produto();

        produto.setNome("Smartphone");
        produto.setMarca("Xaomi");
        produto.setModelo("5A");
        produto.setQuantidade(1);
        produto.setValor(479.00);
        produto.setDescricao("Lançamento");
        produto.setCodigo("DOCPZX65");

        ProdutoRepository pr  = new ProdutoRepository();

        pr.inserir(produto);

    }
}

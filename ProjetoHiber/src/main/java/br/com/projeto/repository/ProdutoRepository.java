package br.com.projeto.repository;

import br.com.projeto.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProdutoRepository {

    EntityManagerFactory emf;
    EntityManager em;

    public ProdutoRepository(){

        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
    }

    public void inserir(Produto produto){

        try{

            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();

        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {

            em.close();
            emf.close();
        }
    }

    public Produto remover(long id){

        Produto produto = null;
        try{

           em.getTransaction().begin();
           produto = em.find(Produto.class,id );
           em.remove(produto);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {

            em.close();
            emf.close();
        }

       return produto;
    }

    public void atualizar(Produto produto){

        try{
         produto = em.find(Produto.class, 2L);
         em.getTransaction().begin();
         produto.setNome("Teste");
         produto.setMarca("Teste");
         produto.setModelo("Teste");
         em.merge(produto);
         em.getTransaction().commit();

        }catch (Exception e){
         em.getTransaction().rollback();
         e.printStackTrace();

        }finally {
            em.close();
            emf.close();
        }

    }

    public List<Produto> listar(){

       List<Produto> produto = null;

       try{
           produto = em.createQuery("from Produto").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return produto;
    }

    public Produto buscarId(long id){

        Produto produto = null;
         try{
            em.getTransaction().begin();
            produto = em.find(Produto.class, id);
            em.getTransaction().commit();

         }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();

         }finally {
             em.close();
             emf.close();
         }

        return produto;
    }


}


package CONTROLLER;

import DAO.ProdutoDAOImpl;
import MODEL.Entrada;
import MODEL.Produto;
import java.util.ArrayList;

public class ProdutoController {
    ProdutoDAOImpl dao;
 
    public ProdutoController() {
       
     dao = new ProdutoDAOImpl();
        
    }

    public void cadastrar(Produto pro) {
        dao.cadastrar(pro);
    }

    public void deletar(Produto pro) {
        dao.deletar(pro);
    }

    public Produto pesquisar(String Produto) {
        return dao.pesquisar(Produto);
    }

    public Produto pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Produto pro) {
        dao.alterar(pro);
    }

    public ArrayList<Produto> selecionarProdutos() {
        return dao.selecionarProdutos();
    }

    public ArrayList<Produto> pesquisarProdutosNome(String nome) {
        return dao.pesquisarProdutoNome(nome);
    }

   
    public ArrayList<Produto> pesquisarProdutos(String nome) {
        return dao.pesquisarProduto(nome);
    }

    public int pegarIdProduto() {
        return dao.pegarIdProduto();
    }
     public double pegarEstoqueAtual(int codigo) {
        return dao.pegarEstoqueAtual(codigo);
    }
         public void cadastrar(Entrada entrada) {
             dao.cadastrar(entrada);
         }
}

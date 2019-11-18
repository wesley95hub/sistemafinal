package DAO;
import java.util.ArrayList;
import MODEL.Produto;
public interface ProdutoDAO {

    
    public void cadastrar(Produto pro);
    
    public void deletar(Produto pro);
    
    public Produto pesquisar(String Produto);
    
    public Produto pesquisar(int codigo);
    
    public void alterar(Produto pro);
   
     public ArrayList<Produto> selecionarProdutos();
    
    public ArrayList<Produto> selecionarProdutos(String nome);
    
    public ArrayList<Produto> pesquisarProdutoNome(String nome);   
    
    public ArrayList<Produto> pesquisarProduto(String nome);
    
    public int pegarIdProduto();
}

    


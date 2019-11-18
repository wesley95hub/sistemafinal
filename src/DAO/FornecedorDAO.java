package DAO;

import MODEL.Cliente;
import MODEL.Fornecedor;
import java.util.ArrayList;

public interface FornecedorDAO {
    
    public void cadastrar(Fornecedor forn);
    
    public void deletar(Fornecedor forn);
    
    public Fornecedor pesquisar(String Cliente);
    
    public Fornecedor pesquisar(int codigo);
    
    public void alterar(Fornecedor forn);
    
    public ArrayList<Fornecedor> selecionarFornecedor();
    
    public ArrayList<Fornecedor> pesquisarNomeFornecedor(String nome);
    
    public ArrayList<Fornecedor> selcionarFornecedorCPF(String CPF);
    
    public ArrayList<Fornecedor> pesquisarFornecedores(String nome);
  
    public int pegarIdFornecedor(Fornecedor forn);
}


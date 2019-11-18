package DAO;
import java.util.ArrayList;
import MODEL.Cliente;
        
public interface ClienteDAO {
    
    public void cadastrar(Cliente cli);
    
    public void deletar(Cliente cli);
    
    public Cliente pesquisar(String Cliente);
    
    public Cliente pesquisar(int codigo);
    
    public void alterar(Cliente cli);
    
    public ArrayList<Cliente> selecionarClientes();
    
    public ArrayList<Cliente> pesquisarClientesNome(String nome);
    
    public ArrayList<Cliente> selcionarClientesCPF(String CPF);
    
    public ArrayList<Cliente> pesquisarClientes(String nome);
    
    public int pegarIdCliente();
}

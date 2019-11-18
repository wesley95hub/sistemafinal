package CONTROLLER;

import DAO.ClienteDAOImpl;
import MODEL.Cliente;
import java.util.ArrayList;

public class ClienteController {
    
 ClienteDAOImpl dao;
 
    public ClienteController() {
       
     dao = new ClienteDAOImpl();
        
    }

    public void cadastrar(Cliente cli) {
        dao.cadastrar(cli);
    }

    public void deletar(Cliente cli) {
        dao.deletar(cli);
    }

    public Cliente pesquisar(String cli) {
        return dao.pesquisar(cli);
    }

    public Cliente pesquisar(int cli) {
        return dao.pesquisar(cli);
    }

    public void alterar(Cliente cli) {
        dao.alterar(cli);
    }

    public ArrayList<Cliente> selecionarClientes() {
        return dao.selecionarClientes();
    }

    public ArrayList<Cliente> pesquisarClientesNome(String nome) {
        return dao.pesquisarClientesNome(nome);
    }

    public ArrayList<Cliente> selcionarClientesCPF(String cpf) {
        return dao.selcionarClientesCPF(cpf);
    }

    public ArrayList<Cliente> pesquisarClientes(String nome) {
        return dao.pesquisarClientes(nome);
    }

    public int pegarIdCliente() {
        return dao.pegarIdCliente();
    }
    
    
}

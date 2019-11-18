package CONTROLLER;

import DAO.FuncionarioDAOImpl;
import MODEL.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {
    
 FuncionarioDAOImpl dao;
 
    public FuncionarioController() {
       
     dao = new FuncionarioDAOImpl();
        
    }

    public void cadastrar(Funcionario fun) {
        dao.cadastrar(fun);
    }

    public void deletar(Funcionario fun) {
        dao.deletar(fun);
    }

    public Funcionario pesquisar(String Funcionario) {
        return dao.pesquisar(Funcionario);
    }

    public Funcionario pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Funcionario fun) {
        dao.alterar(fun);
    }

    public ArrayList<Funcionario> selecionarFuncionarios() {
        return dao.selecionarFuncionarios();
    }

    public ArrayList<Funcionario> pesquisarFuncionariosNome(String nome) {
        return dao.pesquisarFuncionariosNome(nome);
    }

    public ArrayList<Funcionario> selcionarFuncionariosUF(String uf) {
        return dao.selcionarFuncionariosUF(uf);
    }

    public ArrayList<Funcionario> pesquisarFuncionarios(String nome) {
        return dao.pesquisarFuncionarios(nome);
    }

    public int pegarIdFuncionario(Funcionario fun) {
        return dao.pegarIdFuncionario(fun);
    }
     public int pegarIdFuncionario() {
        return dao.pegarIdFuncionario();
    }
    
    
}

package CONTROLLER;

import DAO.DepartamentoDAOImpl;
import MODEL.Departamento;
import java.util.ArrayList;

public class DepartamentoController {
    
 DepartamentoDAOImpl dao;
 
    public DepartamentoController() {
       
     dao = new DepartamentoDAOImpl();
        
    }

    public void cadastrar(Departamento dep) {
        dao.cadastrar(dep);
    }

    public void deletar(Departamento dep) {
        dao.deletar(dep);
    }

    public Departamento pesquisar(String Departamento) {
        return dao.pesquisar(Departamento);
    }

    public Departamento pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Departamento dep) {
        dao.alterar(dep);
    }

    public ArrayList<Departamento> selecionarDepartamentos() {
        return dao.selecionarDepartamentos();
    }

    public ArrayList<Departamento> pesquisarDepartamentosNome(String nome) {
        return dao.pesquisarDepartamentosNome(nome);
    }

   
    public ArrayList<Departamento> pesquisarDepartamentos(String nome) {
        return dao.pesquisarDepartamentos(nome);
    }

    public int pegarIdDepartamento() {
        return dao.pegarIdDepartamento();
    }
    
    
}

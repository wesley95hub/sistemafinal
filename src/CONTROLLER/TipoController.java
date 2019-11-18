package CONTROLLER;

import DAO.TipoDAOImpl;
import MODEL.Tipo;
import java.util.ArrayList;

public class TipoController {
    
 TipoDAOImpl dao;
 
    public TipoController() {
       
     dao = new TipoDAOImpl();
        
    }

    public void cadastrar(Tipo tipo) {
        dao.cadastrar(tipo);
    }

    public void deletar(Tipo tipo) {
        dao.deletar(tipo);
    }

    public Tipo pesquisar(String Tipo) {
        return dao.pesquisar(Tipo);
    }

    public Tipo pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Tipo tipo) {
        dao.alterar(tipo);
    }

    public ArrayList<Tipo> selecionarTipos() {
        return dao.selecionarTipos();
    }

    public ArrayList<Tipo> pesquisarTiposNome(String nome) {
        return dao.pesquisarTiposNome(nome);
    }

   
    public ArrayList<Tipo> pesquisarTipos(String nome) {
        return dao.pesquisarTipos(nome);
    }

    public int pegarIdTipo() {
        return dao.pegarIdTipo();
    }
    
    
}

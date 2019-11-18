package CONTROLLER;

import DAO.MarcaDAOImpl;
import MODEL.Marca;
import java.util.ArrayList;

public class MarcaController {
    
 MarcaDAOImpl dao;
 
    public MarcaController() {
       
     dao = new MarcaDAOImpl();
        
    }

    public void cadastrar(Marca mar) {
        dao.cadastrar(mar);
    }

    public void deletar(Marca mar) {
        dao.deletar(mar);
    }

    public Marca pesquisar(String Marca) {
        return dao.pesquisar(Marca);
    }

    public Marca pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Marca mar) {
        dao.alterar(mar);
    }

    public ArrayList<Marca> selecionarMarcas() {
        return dao.selecionarMarcas();
    }

    public ArrayList<Marca> pesquisarMarcasNome(String nome) {
        return dao.pesquisarMarcasNome(nome);
    }

   
    public ArrayList<Marca> pesquisarMarcas(String nome) {
        return dao.pesquisarMarcas(nome);
    }

    public int pegarIdMarca() {
        return dao.pegarIdMarca();
    }
    
    
}

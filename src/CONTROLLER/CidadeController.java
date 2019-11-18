package CONTROLLER;

import DAO.CidadeDaoImpl;
import MODEL.Cidade;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CidadeController {
    
 CidadeDaoImpl dao;
 
    public CidadeController() {
       
     dao = new CidadeDaoImpl();
        
    }

    public void cadastrar(Cidade cid) {
        dao.cadastrar(cid);
    }

    public void deletar(Cidade cid) {
        dao.deletar(cid);
    }

    public Cidade pesquisar(String Cidade) {
        return dao.pesquisar(Cidade);
    }
public Cidade pesquisar(String Cidade,String Uf) {
        return dao.pesquisar(Cidade,Uf);
    }
    public Cidade pesquisar(int codigo) {
        return dao.pesquisar(codigo);
    }

    public void alterar(Cidade cid) {
        dao.alterar(cid);
    }

    public ArrayList<Cidade> selecionarCidades() {
        return dao.selecionarCidades();
    }

    public ArrayList<Cidade> pesquisarCidadesNome(String nome) {
        return dao.pesquisarCidadesNome(nome);
    }

    public ArrayList<Cidade> selcionarCidadesUF(String uf) {
        return dao.selecionarCidadesUF(uf);
    }

    public ArrayList<Cidade> pesquisarCidades(String nome) {
        return dao.pesquisarCidades(nome);
    }

    public int pegarIdCidade() {
        return dao.pegarIdCidade();
    }
    
    public ResultSet retornarConsultaSQL(String pesq, int opcao){
        return dao.retornarConsultaSQL(pesq, opcao);
    }
   
}

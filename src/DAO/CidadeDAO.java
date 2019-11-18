package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import MODEL.Cidade;

public interface CidadeDAO {
    
    public void cadastrar(Cidade cid);
    
    public void deletar(Cidade cid);
    
    public Cidade pesquisar(String cidade);
    
    public Cidade pesquisar(int codigo);
    
    public void alterar(Cidade cid);
    
    public ArrayList<Cidade> selecionarCidades();
    
    public ArrayList<Cidade> pesquisarCidadesNome(String nome);
    
    public ArrayList<Cidade> selecionarCidadesUF(String uf);
    
    public ArrayList<Cidade> pesquisarCidades(String nome);
    
    public int pegarIdCidade();
    
    public ResultSet retornarConsultaSQL(String pesq, int opcao);
    
}


package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import MODEL.Cidade;

public class CidadeDaoImpl extends DAOConexao implements CidadeDAO{
    
    @Override
    public void cadastrar(Cidade cid){
        String sql = "INSERT INTO cidade (nomeCidade, ufCidade, paisCidade)" + " VALUES ('"+cid.getNome()+"','"+cid.getUf()+"','"+cid.getPais()+"');"; 
        conectar();
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Cidade cadastrada com sucesso.","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        fechar();
    }
    
    @Override
    public Cidade pesquisar(String nome){        
        String sql = "SELECT * FROM cidade WHERE idCidade = '"+nome+"' OR nomeCidade like '"+nome+"%';";        
        ResultSet rs;        
        conectar();        
        Cidade cid = new Cidade();        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }        
        fechar();       
        return cid;                
    }
    public Cidade pesquisar(String nome,String Uf){        
        String sql = "SELECT * FROM cidade WHERE UfCidade = '"+Uf+"' and  nomeCidade like '"+nome+"%';";        
        ResultSet rs;        
        conectar();        
        Cidade cid = new Cidade();        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
        return cid;
                
    }
    
    @Override
    public Cidade pesquisar(int codigo){        
        String sql = "SELECT * FROM cidade WHERE idCidade = '"+codigo+"';";        
        ResultSet rs;        
        conectar();        
        Cidade cid = new Cidade();        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
           }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }        
        fechar();        
        return cid;                
    }
    
    @Override
    public int pegarIdCidade(){        
        String sql = "SELECT max(idCidade) as id FROM Cidade;";        
        int id = 0;        
        ResultSet rs;        
        conectar();        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("id");                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao pegar o código da Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }        
        fechar();        
        return id;
    }
    
    @Override
    public ArrayList<Cidade> selecionarCidadesUF(String uf){        
        String sql = "SELECT * FROM cidade WHERE ufCidade = '"+uf+"';";        
        ResultSet rs;        
        ArrayList<Cidade> cidades = new ArrayList<>();        
        conectar();        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cidade cid = new Cidade();
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
                cidades.add(cid);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar as Cidades. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
        return cidades;
    }
    
    @Override
    public ArrayList<Cidade> selecionarCidades(){
        
        String sql = "SELECT * FROM cidade ORDER BY nomeCidade;";
        
        ResultSet rs;
        
        ArrayList<Cidade> cidades = new ArrayList<>();
        
        conectar();
        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cidade cid = new Cidade();
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
                cidades.add(cid);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar as Cidades. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
        return cidades;
    }
   
    @Override
    public void alterar(Cidade cid){
        
        String sql = "UPDATE cidade SET nomeCidade = '"+cid.getNome()+"',ufCidade = '"+cid.getUf()+"', paisCidade = '"+cid.getPais()+"' WHERE idCidade = '"+cid.getCodigo()+"';";
        
        conectar();
        
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados da cidade alterados com sucesso.","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados da Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
    }
    
    @Override
    public void deletar (Cidade cid){
        
        String sql = "DELETE FROM cidade WHERE idcidade = "+cid.getCodigo()+";";
        
        conectar();
        
        try{
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cidade deletada com sucesso.","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao deletar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
    }

    @Override
    public ArrayList<Cidade> pesquisarCidadesNome(String nome) {
        String sql = "SELECT * FROM cidade WHERE nomeCidade = '"+nome+"';";
        
        ResultSet rs;
        
        ArrayList<Cidade> cidades = new ArrayList<>();
        
        conectar();
        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cidade cid = new Cidade();
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
                cidades.add(cid);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
        return cidades;
    }

    @Override
    public ArrayList<Cidade> pesquisarCidades(String nome){
        
        String sql = "SELECT * FROM cidade WHERE idCidade = '"+nome+"' OR nomeCidade like '"+nome+"%' OR ufCidade like '"+nome+"%';";
        
        ResultSet rs;
        
        conectar();
        
        ArrayList<Cidade> cidades = new ArrayList<>();
        
        try{
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cidade cid = new Cidade();
                cid.setCodigo(rs.getInt("idCidade"));
                cid.setNome(rs.getString("nomeCidade"));
                cid.setUf(rs.getString("ufCidade"));
                cid.setPais(rs.getString("paisCidade"));
                cidades.add(cid);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
        return cidades;
                
    }

    @Override
    public ResultSet retornarConsultaSQL(String pesq, int opcao) {
        String sql = "";
        ResultSet rs = null;
        
        if (opcao == 1) {
            sql = "SELECT cidade.`idCidade` AS cidade_idCidade, cidade.`ufCidade` AS cidade_ufCidade,"
                    + "cidade.`nomeCidade` AS cidade_nomeCidade, cidade.`paisCidade` AS cidade_paisCidade FROM `cidade` cidade ORDER BY "
                    + "cidade.`ufCidade` ASC, cidade.`nomeCidade` ASC";
        } else if (opcao == 2) {
            sql = "SELECT cidade.`idCidade` AS cidade_idCidade, cidade.`ufCidade` AS cidade_ufCidade,"
                    + "cidade.`nomeCidade` AS cidade_nomeCidade, cidade.`paisCidade` AS cidade_paisCidade FROM `cidade` cidade WHERE cidade.`nomeCidade` "
                    + "LIKE '%" + pesq + "%' ORDER BY cidade.`ufCidade` ASC, cidade.`nomeCidade` ASC";
        } else {
            sql = "SELECT cidade.`idCidade` AS cidade_idCidade, cidade.`ufCidade` AS cidade_ufCidade,"
                    + "cidade.`nomeCidade` AS cidade_nomeCidade, cidade.`paisCidade` AS cidade_paisCidade FROM `cidade` cidade WHERE cidade.`ufCidade` "
                    + "LIKE '" + pesq + "' ORDER BY cidade.`ufCidade` ASC, cidade.`nomeCidade` ASC";
        }
        
        System.out.println(sql);
        
        conectar();
        
        try{
            rs = comando.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar a Cidade. \n Erro:" + ex.getMessage(),"Mensagem do Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        return rs;
    }
    
}

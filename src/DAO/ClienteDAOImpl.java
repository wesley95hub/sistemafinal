package DAO;

import DAO.ClienteDAO;
import DAO.DAOConexao;
import MODEL.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
public class ClienteDAOImpl extends DAOConexao implements ClienteDAO {

    @Override
    public void cadastrar(Cliente Cli) {  
     String sql = "INSERT INTO Cliente(nomeCliente, rgCliente, cpfCliente, emailCliente, sexoCliente, dataNascCliente, telefoneCliente, celularCliente, obsCliente) Values( '"+
            Cli.getNome()+"','"+Cli.getRg()+"','"+Cli.getCpf()+"','"+Cli.getEmail()+"','"+Cli.getSexo()+"','"+Cli.getDataNasc()+"','"+Cli.getTelefone()+"','"+Cli.getCelular()+"','"+Cli.getObsCliente()+"');";
        conectar();
        
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o Cliente.  Erro"  +ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
    }

    @Override
    public void deletar(Cliente Cli) {
        String sql = "DELETE FROM Cliente WHERE idCliente = "+Cli.getCodigo()+";";
        
        conectar();
        
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE );
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Cliente", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
    }

    @Override
    public Cliente pesquisar(String nome) {
        String sql = "SELECT * FROM Cliente  where idCliente = '"+nome+"' or nomeCliente like '"+nome+"%';";
        
        ResultSet rs;
        
        conectar();
        
        Cliente Cli = new Cliente();
        
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cli.setCodigo(rs.getInt("idCliente"));
                Cli.setNome(rs.getString("nomeCliente"));
                Cli.setRg(rs.getString("rgCliente"));
                Cli.setCpf(rs.getString("cpfCliente"));
                Cli.setEmail(rs.getString("emailCliente"));
                Cli.setSexo(rs.getString("sexoCliente"));
                Cli.setDataNasc(rs.getString("dataNascCliente"));
                Cli.setTelefone(rs.getString("telefoneCliente"));
                Cli.setCelular(rs.getString("celularCliente"));
               Cli.setObsCliente(rs.getString("obsCliente"));
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Cliente  Erro:" +ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
            
        }
        
        fechar();
        
        return Cli;
    }

    @Override
    public Cliente pesquisar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Cliente Cli) {

        
        
      String sql = "UPDATE Cliente SET nomeCliente = '"+Cli.getNome()+"', rgCliente = '"+Cli.getRg()+"',cpfCliente = '"+Cli.getCpf()+"',emailCliente ='"+Cli.getEmail()+"', sexoCliente = '"+Cli.getSexo()+"', dataNascCliente ='"+Cli.getDataNasc()+"',telefoneCliente ='"+Cli.getTelefone()+"',celularCliente='"+Cli.getCelular()+"',obsCliente='"+Cli.getObsCliente()+"';";

        conectar();
        
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Dados do Cliente alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao alterar o Cliente.  Erro"  +ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        fechar();
        
    }

    @Override
    public ArrayList<Cliente> selecionarClientes() {
       String sql = "SELECT * FROM Cliente ORDER by nomeCliente";
        
        ResultSet rs;
        
        conectar();
        
        ArrayList<Cliente> Clientes = new ArrayList<>();
        
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cliente Cli = new Cliente();
                Cli.setCodigo(rs.getInt("idCliente"));
                Cli.setNome(rs.getString("nomeCliente"));
                Cli.setRg(rs.getString("rgCliente"));
                Cli.setCpf(rs.getString("cpfCliente"));
                Cli.setEmail(rs.getString("emailCliente"));
                Cli.setSexo(rs.getString("sexoCliente"));
                Cli.setDataNasc(rs.getString("dataNascCliente"));
                Cli.setTelefone(rs.getString("telefoneCliente"));
                Cli.setCelular(rs.getString("celularCliente"));
                Cli.setObsCliente(rs.getString("obsCliente"));
                Clientes.add(Cli);
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Cliente  Erro:" +ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
            
        }
        
        fechar();
        
        return Clientes;
    }

    @Override
    public ArrayList<Cliente> pesquisarClientesNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> selcionarClientesCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> pesquisarClientes(String nome) {
    String sql = "SELECT * FROM Cliente where idCliente = '"+nome+"' or nomeCliente like '"+nome+"%' or idCliente like  '"+nome+"%' ORDER by nomeCliente";
        
        ResultSet rs;
        
        conectar();
        
        ArrayList<Cliente> Clientes = new ArrayList<>();
        
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Cliente Cli = new Cliente();
                Cli.setCodigo(rs.getInt("idCliente"));
                Cli.setNome(rs.getString("nomeCliente"));
                Cli.setRg(rs.getString("rgCliente"));
                Cli.setCpf(rs.getString("cpfCliente"));
                Cli.setEmail(rs.getString("emailCliente"));
                Cli.setSexo(rs.getString("sexoCliente"));
                Cli.setDataNasc(rs.getString("dataNascCliente"));
                Cli.setTelefone(rs.getString("telefoneCliente"));
                Cli.setCelular(rs.getString("celularCliente"));
                Cli.setObsCliente(rs.getString("obsCliente"));
                Clientes.add(Cli);
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Cliente  Erro:" +ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
            
        }
        
        fechar();
        
        return Clientes;
    }

    @Override
    public int pegarIdCliente() {
        String sql = "SELECT max(idCliente) as id FROM Cliente;";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o Código do Cliente \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
    }
    
}

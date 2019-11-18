package DAO;

import MODEL.Cidade;
import MODEL.Fornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class FornecedorDAOImpl extends DAOConexao implements FornecedorDAO {

    @Override
    public void cadastrar(Fornecedor Forn) {
        String sql = "INSERT INTO fornecedor\n"
                + "(nomeFantasiaFornecedor,"
                + "cnpjFornecedor,"
                + "contatoFornecedor,"
                + "telefoneFornecedor,"
                + "razaoSocialFornecedor,"
                + "celularFornecedor,"
                + "emailFornecedor,"
                + "tipoFornecedor,"
                + "ieFornecedor,"
                + "cpfFornecedor)"
                + "VALUES ('"
                 +Forn.getNome() + "','"
                + Forn.getCnpjFornecedor() + "','"
                + Forn.getContatoFornecedor() + "','"
                + Forn.getTelefone()+ "','"
                + Forn.getRazaoSocialFornecedor() + "','"
                + Forn.getCelular() + "','"
                + Forn.getEmail() + "','"
                + Forn.getTipoFornecedor() + "','"
                + Forn.getIeFornecedor() + "','"
                + Forn.getCpf()+ "');";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Fornecedor. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Fornecedor Forn) {
        String sql = "DELETE FROM Fornecedor WHERE idFornecedor = " + Forn.getIdFornecedor()+ ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Fornecedor", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Fornecedor pesquisar(String nome) {
        String sql = "SELECT * FROM Fornecedor where idFornecedor = '" + nome + "' or nomeFantasiaFornecedor like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Fornecedor Forn = new Fornecedor();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Forn.setIdFornecedor(rs.getInt("idFornecedor"));
                Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
                Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                Forn.setCpf(rs.getString("cnpjFornecedor"));
                Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
                Forn.setTelefone(rs.getString("telefoneFornecedor"));
                Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
                Forn.setCelular(rs.getString("celularFornecedor"));
                Forn.setEmail(rs.getString("celularFornecedor"));
                Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
                Forn.setIeFornecedor(rs.getString("ieFornecedor"));
                Forn.setCpf(rs.getString("cpfFornecedor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Fornecedor \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return Forn;
    }

    @Override
    public Fornecedor pesquisar(int codigo) {
        String sql = "SELECT * FROM Fornecedor WHERE idFornecedor = '" + codigo + "';";

        ResultSet rs;

        conectar();

        Fornecedor Forn = new Fornecedor();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Forn.setIdFornecedor(rs.getInt("idFornecedor"));
                Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
                Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
                Forn.setTelefone(rs.getString("telefoneFornecedor"));
                Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
                Forn.setCelular(rs.getString("celularFornecedor"));
                Forn.setEmail(rs.getString("emailFornecedor"));
                Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
                Forn.setIeFornecedor(rs.getString("ieFornecedor"));
                Forn.setCpf(rs.getString("cpfFornecedor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Forncedor. \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

        return Forn;
    }

    @Override
    public void alterar(Fornecedor Forn) {
        String sql = "UPDATE Fornecedor SET nomeFantasiaFornecedor= '" + Forn.getNome()+ "',"
                + "cnpjFornecedor = '" + Forn.getCnpjFornecedor() + "', "
                + "contatoFornecedor = '" + Forn.getContatoFornecedor() + "',"
                + "telefoneFornecedor = '" + Forn.getTelefone() + "',"
                + "razaoSocialFornecedor = '" + Forn.getRazaoSocialFornecedor() + "',"
                + "celularFornecedor = '" + Forn.getCelular() + "',"
                + "emailFornecedor = '" + Forn.getEmail() + "',"
                + "tipoFornecedor = '" + Forn.getTipoFornecedor() + "',"
                + "ieFornecedor = '" + Forn.getIeFornecedor() + "',"
                + "cpfFornecedor = '" + Forn.getCpf() + "' where idFornecedor ='"+Forn.getIdFornecedor()
                + "';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do fornecedor alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a Fornecedor. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Fornecedor> selecionarFornecedor() {
        String sql = "SELECT * FROM Fornecedor ORDER by nomeFantasiaFornecedor";

        ResultSet rs;

        conectar();

        ArrayList<Fornecedor> Fornecedores = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Fornecedor Forn = new Fornecedor();
                Forn.setIdFornecedor(rs.getInt("idFornecedor"));
                Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
                Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
                Forn.setTelefone(rs.getString("telefoneFornecedor"));
                Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
                Forn.setCelular(rs.getString("celularFornecedor"));
                Forn.setEmail(rs.getString("emailFornecedor"));
                Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
                Forn.setIeFornecedor(rs.getString("ieFornecedor"));
                Forn.setCpf(rs.getString("cpfFornecedor"));

                Fornecedores.add(Forn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Fornecedor \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return Fornecedores;
    }

    @Override
    public ArrayList<Fornecedor> pesquisarNomeFornecedor(String nome) {
        String sql = "SELECT * FROM Fornecedor WHERE nomeFantasiaFornecedor = '" + nome + "';";

        ResultSet rs;

        ArrayList<Fornecedor> Fornecedores = new ArrayList<>();

        conectar();

        try {

            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Fornecedor Forn = new Fornecedor();
                Forn.setIdFornecedor(rs.getInt("idFornecedor"));
                Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
                Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
                Forn.setTelefone(rs.getString("telefoneFornecedor"));
                Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
                Forn.setCelular(rs.getString("celularFornecedor"));
                Forn.setEmail(rs.getString("emailFornecedor"));
                Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
                Forn.setIeFornecedor(rs.getString("ieFornecedor"));
                Forn.setCpf(rs.getString("cpfFornecedor"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Fornecedor. \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

        return Fornecedores;
    }

    @Override
    public ArrayList<Fornecedor> selcionarFornecedorCPF(String cpf) {
        String sql = "SELECT * FROM Fornecedor WHERE cpfFornecedor = '" + cpf + "';";

        ResultSet rs;

        Fornecedor Forn = new Fornecedor();
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();

        conectar();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
            Forn.setIdFornecedor(rs.getInt("idFornecedor"));
            Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
            Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
            Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
            Forn.setTelefone(rs.getString("telefoneFornecedor"));
            Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
            Forn.setCelular(rs.getString("celularFornecedor"));
            Forn.setEmail(rs.getString("emailFornecedor"));
            Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
            Forn.setIeFornecedor(rs.getString("ieFornecedor"));
            Forn.setCpf(rs.getString("cpfFornecedor"));
            fornecedor.add(Forn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Fornecedor. \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

        return fornecedor;
    }

    @Override
    public ArrayList<Fornecedor> pesquisarFornecedores(String nome) {
        String sql = "SELECT * FROM fornecedor where idFornecedor = '" + nome + "' or nomeFornecedor like '" + nome + "%' ORDER by nomeFornecedor";

        ResultSet rs;

        conectar();

        ArrayList<Fornecedor> fornecedor = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
            Fornecedor Forn = new Fornecedor();
            Forn.setIdFornecedor(rs.getInt("idFornecedor"));
            Forn.setNome(rs.getString("nomeFantasiaFornecedor"));
            Forn.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
            Forn.setContatoFornecedor(rs.getString("contatoFornecedor"));
            Forn.setTelefone(rs.getString("telefoneFornecedor"));
            Forn.setRazaoSocialFornecedor(rs.getString("razaoSocialFornecedor"));
            Forn.setCelular(rs.getString("celularFornecedor"));
            Forn.setEmail(rs.getString("emailFornecedor"));
            Forn.setTipoFornecedor(rs.getString("tipoFornecedor"));
            Forn.setIeFornecedor(rs.getString("ieFornecedor"));
            Forn.setCpf(rs.getString("cpfFornecedor"));
                fornecedor.add(Forn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Fornecedor \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return fornecedor;
    }

    @Override
    public int pegarIdFornecedor(Fornecedor forn) {
String sql = "SELECT max(idFornecedor) as id FROM Fornecedor;";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Fornecedor \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
        
    }
    
     public int pegarIdFornecedor() {
String sql = "SELECT max(idFornecedor) as id FROM Fornecedor;";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Fornecedor \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
        
    }

}

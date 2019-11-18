package DAO;

import MODEL.Tipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class TipoDAOImpl extends DAOConexao implements TipoDAO {

    @Override
    public void cadastrar(Tipo tipo) {
        String sql = "INSERT into tipo(idTipo, nomeTipo)" + "VALUES ('" + tipo.getIdTipo()+ "','" + tipo.getNomeTipo() + "');";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tipo cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o tipo. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Tipo tipo) {
        String sql = "DELETE FROM tipo WHERE idTipo = " + tipo.getIdTipo()+ ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tipo deletado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Tipo", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Tipo pesquisar(String nome) {
        String sql = "SELECT * FROM tipo where idtipo = '" + nome + "' or nomeTipo like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Tipo tipo = new Tipo();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setNomeTipo(rs.getString("nomeTipo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Tipo \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
        return tipo;
    }

    @Override
    public Tipo pesquisar(int codigo) {
       String sql = "SELECT * FROM tipo where idtipo = '" + codigo+"';";

        ResultSet rs;

        conectar();

        Tipo tipo = new Tipo();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setNomeTipo(rs.getString("nomeTipo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Tipo \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
        return tipo;
    }

    @Override
    public void alterar(Tipo tipo) {
        String sql = "UPDATE Tipo SET nomeTipo = '" + tipo.getNomeTipo() + "' WHERE idTipo= '" + tipo.getIdTipo()+ "';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do Tipo alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o Tipo. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
    }

    @Override
    public ArrayList<Tipo> selecionarTipos() {
        String sql = "SELECT * FROM tipo ORDER by nomeTipo";

        ResultSet rs;

        conectar();

        ArrayList<Tipo> tipo = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Tipo tip = new Tipo();
                tip.setIdTipo(rs.getInt("idTipo"));
                tip.setNomeTipo(rs.getString("nomeTipo"));
                tipo.add(tip);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a tipoade \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }
        fechar();
        return tipo;
    }

    @Override
    public ArrayList<Tipo> pesquisarTiposNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tipo> pesquisarTipos(String nome) {
        String sql = "SELECT * FROM tipo where idTipo = '" + nome + "' or nomeTipo like '" + nome + "%' ORDER by nomeTipo";

        ResultSet rs;

        conectar();

        ArrayList<Tipo> tipo = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Tipo tip = new Tipo();
                tip.setIdTipo(rs.getInt("idTipo"));
                tip.setNomeTipo(rs.getString("nomeTipo"));
                tipo.add(tip);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o tipo \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return tipo;
    }

    @Override
    public int pegarIdTipo() {
        String sql = "SELECT max(idTipo) as id FROM Tipo;";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o Código do Produto \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
    }

}

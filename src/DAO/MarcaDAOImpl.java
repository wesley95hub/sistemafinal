package DAO;

import MODEL.Marca;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class MarcaDAOImpl extends DAOConexao implements MarcaDAO {

    @Override
    public void cadastrar(Marca mar) {
        String sql = "INSERT into Marca(nomeMarca,idMarca)" + "VALUES ('"
                + mar.getNomeMarca()
                + "','" + mar.getIdMarca()+ "');";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Marca cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a marca. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Marca mar) {
        String sql = "DELETE FROM marca WHERE idMarca = " + mar.getIdMarca() + ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Marca deletada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Marca", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Marca pesquisar(String nome) {
        String sql = "SELECT * FROM Marca where idMarca = '" + nome + "' or nomeMarca like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Marca mar = new Marca();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                mar.setIdMarca(rs.getInt("IdMarca"));
                mar.setNomeMarca(rs.getString("nomeMarca"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Marca \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return mar;
    }

    @Override
    public Marca pesquisar(int codigo) {
       String sql = "SELECT * FROM Marca where idMarca = '" + codigo+"';";

        ResultSet rs;

        conectar();

        Marca mar = new Marca();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                mar.setIdMarca(rs.getInt("IdMarca"));
                mar.setNomeMarca(rs.getString("nomeMarca"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Marca \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return mar;
    }

    @Override
    public void alterar(Marca mar) {
        String sql = "UPDATE marca SET " +" `nomeMarca` = '" +mar.getNomeMarca()+"' WHERE `idMarca` = '"+mar.getIdMarca()+"';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados da marca alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a marca. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Marca> selecionarMarcas() {
        String sql = "select * FROM marca ORDER by nomeMarca";

        ResultSet rs;

        conectar();
  
        ArrayList<Marca> marcas = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Marca mar = new Marca();
                mar.setIdMarca(rs.getInt("IdMarca"));
                mar.setNomeMarca(rs.getString("nomeMarca"));
             
                marcas.add(mar);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a marca \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return marcas;
    }

    @Override
    public ArrayList<Marca> pesquisarMarcasNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Marca> pesquisarMarcas(String nome) {
        String sql = "SELECT * FROM marca where idMarca = '" + nome + "' or nomeMarca like '" + nome + "%' ORDER by nomeMarca";

        ResultSet rs;

        conectar();

        ArrayList<Marca> marcas = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Marca mar = new Marca();
                mar.setIdMarca(rs.getInt("IdMarca"));
                mar.setNomeMarca(rs.getString("nomeMarca"));
                marcas.add(mar);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a marca \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return marcas;
    }

    @Override
    public int pegarIdMarca() {
          String sql = "SELECT max(idMarca) as id FROM Marca;";

         ResultSet rs;

         conectar();
         int id = 0;

         try {
             rs = comando.executeQuery(sql);
             while (rs.next()) {
                 id = rs.getInt("id");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao pegar o Código da Marca \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

         }

         fechar();

         return id;
    }

}

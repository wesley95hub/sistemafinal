package DAO;

import MODEL.Departamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class DepartamentoDAOImpl extends DAOConexao implements DepartamentoDAO {

    @Override
    public void cadastrar(Departamento dep) {
        String sql = "INSERT into departamento(idDepartamento, nomeDepartamento)" + "VALUES ('" + dep.getIdDepartmento() + "','" + dep.getNomeDepartamento() + "');";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Departamento cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o departamento. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Departamento dep) {
        String sql = "DELETE FROM departamento WHERE idDepartamento = '" + dep.getIdDepartmento() + "';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Departamento deletada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Departamento", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Departamento pesquisar(String nome) {
        String sql = "SELECT * FROM departamento where iddepartamento = '" + nome + "' or nomeDepartamento like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Departamento dep = new Departamento();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                dep.setIdDepartmento(rs.getInt("idDepartamento"));
                dep.setNomeDepartamento(rs.getString("nomeDepartamento"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Departamento \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return dep;
    }

    @Override
    public Departamento pesquisar(int codigo) {
        String sql = "SELECT * FROM departamento where iddepartamento = '" + codigo + "';";
        ResultSet rs;
        conectar();
        Departamento dep = new Departamento();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                dep.setIdDepartmento(rs.getInt("idDepartamento"));
                dep.setNomeDepartamento(rs.getString("nomeDepartamento"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Departamento \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
        return dep;
    }

    @Override
    public void alterar(Departamento dep) {
        String sql = "UPDATE Departamento SET nomeDepartamento = '" + dep.getNomeDepartamento() + "' WHERE idDepartamento= '" + dep.getIdDepartmento() + "';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do Departamento alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a Departamento. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Departamento> selecionarDepartamentos() {
        String sql = "SELECT * FROM departamento ORDER by nomeDepartamento";

        ResultSet rs;

        conectar();

        ArrayList<Departamento> departamento = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Departamento dep = new Departamento();
                dep.setIdDepartmento(rs.getInt("idDepartamento"));
                dep.setNomeDepartamento(rs.getString("nomeDepartamento"));
                departamento.add(dep);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a depade \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return departamento;
    }

    @Override
    public ArrayList<Departamento> pesquisarDepartamentosNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Departamento> pesquisarDepartamentos(String nome) {
        String sql = "SELECT * FROM departamento where idDepartamento = '" + nome + "' or nomeDepartamento like '" + nome + "%' ORDER by nomeDepartamento";

        ResultSet rs;

        conectar();

        ArrayList<Departamento> departamento = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Departamento dep = new Departamento();
                dep.setIdDepartmento(rs.getInt("idDepartamento"));
                dep.setNomeDepartamento(rs.getString("nomeDepartamento"));
                departamento.add(dep);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a departamento \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return departamento;
    }

    @Override
    public int pegarIdDepartamento() {
         String sql = "SELECT max(idDepartamento) as id FROM Departamento;";

         ResultSet rs;

         conectar();
         int id = 0;

         try {
             rs = comando.executeQuery(sql);
             while (rs.next()) {
                 id = rs.getInt("id");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao pegar o Código do Departamento \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

         }

         fechar();

         return id;
    }

}

package DAO;

import MODEL.Cargo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class CargoDAOImpl extends DAOConexao implements CargoDAO {

    @Override
    public void cadastrar(Cargo car) {
        String sql = "INSERT into Cargo(nomeCargo,idCargo)" + "VALUES ('"
                + car.getNomeCargo()
                + "','" + car.getIdCargo()+ "');";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cargo cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cargo. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Cargo car) {
        String sql = "DELETE FROM cargo WHERE idCargo = " + car.getIdCargo() + ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cargo deletada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Cargo", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Cargo pesquisar(String nome) {
        String sql = "SELECT * FROM Cargo where idCargo = '" + nome + "' or nomeCargo like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Cargo car = new Cargo();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                car.setIdCargo(rs.getInt("IdCargo"));
                car.setNomeCargo(rs.getString("nomeCargo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Cargo \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return car;
    }

    @Override
    public Cargo pesquisar(int codigo) {
        String sql = "SELECT * FROM Cargo where idCargo = '"+codigo+"';";
        ResultSet rs;
        conectar();
        Cargo car = new Cargo();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                car.setIdCargo(rs.getInt("IdCargo"));
                car.setNomeCargo(rs.getString("nomeCargo"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Cargo \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
        return  car;
    }

    @Override
    public void alterar(Cargo car) {
        String sql = "UPDATE cargo SET " +" `nomeCargo` = '" +car.getNomeCargo()+"' WHERE `idCargo` = '"+car.getIdCargo()+"';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do cargo alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a cargo. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Cargo> selecionarCargos() {
        String sql = "select * FROM cargo ORDER by nomeCargo";

        ResultSet rs;

        conectar();

        ArrayList<Cargo> cargos = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Cargo car = new Cargo();
                car.setIdCargo(rs.getInt("IdCargo"));
                car.setNomeCargo(rs.getString("nomeCargo"));
                cargos.add(car);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a carade \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return cargos;
    }

    @Override
    public ArrayList<Cargo> pesquisarCargosNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cargo> pesquisarCargos(String nome) {
        String sql = "SELECT * FROM cargo where idCargo = '" + nome + "' or nomeCargo like '" + nome + "%' ORDER by nomeCargo";

        ResultSet rs;

        conectar();

        ArrayList<Cargo> cargos = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Cargo car = new Cargo();
                car.setIdCargo(rs.getInt("IdCargo"));
                car.setNomeCargo(rs.getString("nomeCargo"));
                cargos.add(car);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a carade \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return cargos;
    }

     @Override
    public int pegarIdCargo() {
         String sql = "SELECT max(idCargo) as id FROM Cargo;";

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

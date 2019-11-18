package DAO;

import MODEL.Funcionario;
import MODEL.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class FuncionarioDAOImpl extends DAOConexao implements FuncionarioDAO {

    @Override
    public void cadastrar(Funcionario fun) {
        String sql = "INSERT into funcionario("
                + "nomeFuncionario, "
                + "rgFuncionario, "
                + "cpfFuncionario, "
                + "ctFuncionario, "
                + "emailFuncionario, "
                + "sexoFuncionario, "
                + "dataNascFuncionario, "
                + "telefoneFuncionario, "
                + "celularFuncionario, "
                + "salarioFuncionario, "
                + "dataAdmissaoFuncionario, "
                + "pisFuncionario,"
                + "estadoCivilFuncionario, "
                + "formacaoEscolarFuncionario, "
                + "cargo_idCargo, "
                + "departamento_idDepartamento, "
                + "qtdDependentesFuncionario) "
                + "VALUES ('" 
                + fun.getNome()
                + "','" + fun.getRg()
                + "','" + fun.getCpf()
                + "','" + fun.getCtFuncionario()
                + "','" + fun.getEmail()
                + "','" + fun.getSexo()
                + "','" + fun.getDataNasc()
                + "','" + fun.getTelefone()
                + "','" + fun.getCelular()
                + "','" + fun.getSalarioFuncionario()
                + "','" + fun.getDataAdmissaoFuncionario()
                + "','" + fun.getPisFuncionario()
                + "','" + fun.getEstadoCivilFuncionario()
                + "','" + fun.getFormacaoEscolarFuncionario()
                + "','" + fun.getCargo_idCargo()
                + "','" + fun.getDepartamento_idDepartamento()
                + "','" + fun.getQtdDependentesFuncionario()
                + "');";
        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Funcionario cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a funcionário. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Funcionario fun) {
        String sql = "DELETE FROM funcionario WHERE idfuncionario = " + fun.getIdFuncionario() + ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Funcionário deletada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar funcionário", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Funcionario pesquisar(String nome) {
        String sql = "SELECT * FROM funcionario where idFuncionario = '" + nome + "' or nomeFuncionario like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Funcionario fun = new Funcionario();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                fun.setIdFuncionario(rs.getInt("idFuncionario"));
                fun.setNome(rs.getString("nomeFuncionario"));
                fun.setRg(rs.getString("rgFuncionario"));
                fun.setCpf(rs.getString("cpfFuncionario"));
                fun.setCtFuncionario(rs.getString("ctFuncionario"));
                fun.setEmail(rs.getString("emailFuncionario"));
                fun.setSexo(rs.getString("sexoFuncionario"));
                fun.setDataNasc(rs.getString("dataNascFuncionario"));
                fun.setTelefone(rs.getString("telefoneFuncionario"));
                fun.setCelular(rs.getString("celularFuncionario"));
                fun.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
                fun.setDataAdmissaoFuncionario(rs.getString("dataAdmissaoFuncionario"));
                fun.setPisFuncionario(rs.getString("pisFuncionario"));
                fun.setEstadoCivilFuncionario(rs.getString("estadoCivilFuncionario"));
                fun.setFormacaoEscolarFuncionario(rs.getString("formacaoEscolarFuncionario"));
                fun.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
                fun.setDepartamento_idDepartamento(rs.getInt("departamento_idDepartamento"));
                fun.setQtdDependentesFuncionario(rs.getInt("qtdDependentesFuncionario"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionario \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return fun;
    }

    @Override
    public Funcionario pesquisar(int codigo) {
                String sql = "SELECT * FROM funcionario where idFuncionario = '" + codigo+"';";

        ResultSet rs;

        conectar();

        Funcionario fun = new Funcionario();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                fun.setIdFuncionario(rs.getInt("idFuncionario"));
                fun.setNome(rs.getString("nomeFuncionario"));
                fun.setRg(rs.getString("rgFuncionario"));
                fun.setCpf(rs.getString("cpfFuncionario"));
                fun.setCtFuncionario(rs.getString("ctFuncionario"));
                fun.setEmail(rs.getString("emailFuncionario"));
                fun.setSexo(rs.getString("sexoFuncionario"));
                fun.setDataNasc(rs.getString("dataNascFuncionario"));
                fun.setTelefone(rs.getString("telefoneFuncionario"));
                fun.setCelular(rs.getString("celularFuncionario"));
                fun.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
                fun.setDataAdmissaoFuncionario(rs.getString("dataAdmissaoFuncionario"));
                fun.setPisFuncionario(rs.getString("pisFuncionario"));
                fun.setEstadoCivilFuncionario(rs.getString("estadoCivilFuncionario"));
                fun.setFormacaoEscolarFuncionario(rs.getString("formacaoEscolarFuncionario"));
                fun.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
                fun.setDepartamento_idDepartamento(rs.getInt("departamento_idDepartamento"));
                fun.setQtdDependentesFuncionario(rs.getInt("qtdDependentesFuncionario"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionario \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return fun;
    }

    @Override
    public void alterar(Funcionario fun) {
       
        String sql = "UPDATE Funcionario SET "
                + " nomeFuncionario = '" + fun.getNome()
                + "', rgFuncionario = '" + fun.getRg()
                + "', cpfFuncionario='" + fun.getCpf()
                + "', ctFuncionario='" + fun.getCtFuncionario()
                + "', emailFuncionario='" + fun.getEmail()
                + "', sexoFuncionario='" + fun.getSexo()
                + "', dataNascFuncionario='" + fun.getDataNasc()
                + "', telefoneFuncionario='" + fun.getTelefone()
                + "', celularFuncionario='" + fun.getCelular()
                + "', salarioFuncionario='" + fun.getSalarioFuncionario()
                + "', dataAdmissaoFuncionario='" + fun.getDataAdmissaoFuncionario()
                + "', pisFuncionario='" + fun.getPisFuncionario()
                + "', estadoCivilFuncionario='" + fun.getEstadoCivilFuncionario()
                + "', formacaoEscolarFuncionario='" + fun.getFormacaoEscolarFuncionario()
                + "', cargo_idCargo='" + fun.getCargo_idCargo()
                + "', departamento_idDepartamento='" + fun.getDepartamento_idDepartamento()
                + "', qtdDependentesFuncionario='" + fun.getQtdDependentesFuncionario()
                + "' WHERE idFuncionario= '" + fun.getIdFuncionario() + "';";
        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do Funcionário alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a Funcionário. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Funcionario> selecionarFuncionarios() {
        String sql = "SELECT * FROM Funcionario ORDER by nomeFuncionario";

        ResultSet rs;

        conectar();

        ArrayList<Funcionario> funcionario = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setIdFuncionario(rs.getInt("idFuncionario"));
                fun.setNome(rs.getString("nomeFuncionario"));
                fun.setRg(rs.getString("rgFuncionario"));
                fun.setCpf(rs.getString("cpfFuncionario"));
                fun.setCtFuncionario(rs.getString("ctFuncionario"));
                fun.setEmail(rs.getString("emailFuncionario"));
                fun.setSexo(rs.getString("sexoFuncionario"));
                fun.setDataNasc(rs.getString("dataNascFuncionario"));
                fun.setTelefone(rs.getString("telefoneFuncionario"));
                fun.setCelular(rs.getString("celularFuncionario"));
                fun.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
                fun.setDataAdmissaoFuncionario(rs.getString("dataAdmissaoFuncionario"));
                fun.setPisFuncionario(rs.getString("pisFuncionario"));
                fun.setEstadoCivilFuncionario(rs.getString("estadoCivilFuncionario"));
                fun.setFormacaoEscolarFuncionario(rs.getString("formacaoEscolarFuncionario"));
                fun.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
                fun.setDepartamento_idDepartamento(rs.getInt("departamento_idDepartamento"));
                fun.setQtdDependentesFuncionario(rs.getInt("qtdDependentesFuncionario"));
                funcionario.add(fun);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionário \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return funcionario;
    }

    @Override
    public ArrayList<Funcionario> pesquisarFuncionariosNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> selcionarFuncionariosUF(String uf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> pesquisarFuncionarios(String nome) {
        String sql = "SELECT * FROM funcionario where idFuncionario = '" + nome + "' or nomeFuncionario like '" + nome + "%' or cpffuncionario like  '" + nome + "%' ORDER by nomeFuncionario";

        ResultSet rs;

        conectar();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setIdFuncionario(rs.getInt("idFuncionario"));
                fun.setNome(rs.getString("nomeFuncionario"));
                fun.setRg(rs.getString("rgFuncionario"));
                fun.setCpf(rs.getString("cpfFuncionario"));
                fun.setCtFuncionario(rs.getString("ctFuncionario"));
                fun.setEmail(rs.getString("emailFuncionario"));
                fun.setSexo(rs.getString("sexoFuncionario"));
                fun.setDataNasc(rs.getString("dataNascFuncionario"));
                fun.setTelefone(rs.getString("telefoneFuncionario"));
                fun.setCelular(rs.getString("celularFuncionario"));
                fun.setSalarioFuncionario(rs.getDouble("salarioFuncionario"));
                fun.setDataAdmissaoFuncionario(rs.getString("dataAdmissaoFuncionario"));
                fun.setPisFuncionario(rs.getString("pisFuncionario"));
                fun.setEstadoCivilFuncionario(rs.getString("estadoCivilFuncionario"));
                fun.setFormacaoEscolarFuncionario(rs.getString("formacaoEscolarFuncionario"));
                fun.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
                fun.setDepartamento_idDepartamento(rs.getInt("departamento_idDepartamento"));
                fun.setQtdDependentesFuncionario(rs.getInt("qtdDependentesFuncionario"));
                funcionarios.add(fun);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionário \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return funcionarios;
    }

    @Override
    public int pegarIdFuncionario(Funcionario fun) {
         String sql = "SELECT idFuncionario FROM Funcionario where cpfFuncionario = '"+fun.getCpf()+"';";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("idFuncionario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionário \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
        
    }
     public int pegarIdFuncionario() {
         
           String sql = "SELECT max(idFuncionario) as id FROM Funcionario;";

        ResultSet rs;

        conectar();
        int id = 0;

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
              id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a Funcionário \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return id;
        
    }

}

package DAO;

import MODEL.Endereco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class EnderecoDAOImpl extends DAOConexao implements EnderecoDAO {

    @Override
    public void cadastrar(Endereco end) {
        String sql = "INSERT INTO endereco"
                + "(ruaEndereco,"
                + "bairroEndereco,"
                + "cepEndereco,"
                + "numEndereco,"
                + "referenciaEndereco,"
                + "idClienteEndereco,"
                + "idFornecedorEndereco,"
                + "idFuncionarioEndereco,"
                + "complementoEndereco,"
                + "idCidadeEndereco)"
                + "VALUES('"
                + end.getRuaEndereco() + "','"
                + end.getBairroEndereco() + "','"
                + end.getCepEndereco() + "','"
                + end.getNumEndereco() + "','"
                + end.getReferenciaEndereco() + "','"
                + end.getIdClienteEndereco() + "','"
                + end.getIdFornecedorEndereco() + "','"
                + end.getIdFuncionarioEndereco() + "','"
                + end.getComplementoEndereco() + "','"
                + end.getIdCidadeEndereco() + "');";
        conectar();
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Endereco cadastrada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o endereco. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Endereco end) {
        String sql = "DELETE FROM endereco WHERE idEndereco = " + end.getIdEndereco() + ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Endereco deletada com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Endereco", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Endereco pesquisar(String nome) {
        String sql = "SELECT * FROM Endereco where idEndereco = '" + nome + "' or nomeEndereco like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Endereco end = new Endereco();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                end.setIdEndereco(rs.getInt("IdEndereco"));
                end.setRuaEndereco(rs.getString("RuaEndereco"));
                end.setBairroEndereco(rs.getString("BairroEndereco"));
                end.setCepEndereco(rs.getString("CepEndereco"));
                end.setNumEndereco(rs.getInt("NumEndereco"));
                end.setReferenciaEndereco(rs.getString("ReferenciaEndereco"));
                end.setIdClienteEndereco(rs.getInt("IdClienteEndereco"));
                end.setIdFornecedorEndereco(rs.getInt("IdFornecedorEndereco"));
                end.setIdFuncionarioEndereco(rs.getInt("IdFuncionarioEndereco"));
                end.setComplementoEndereco(rs.getString("ComplementoEndereco"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Endereco \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return end;
    }

    @Override
    public Endereco pesquisar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Endereco end) {
        String sql = "UPDATE endereco SET "
                + "ruaEndereco = '" + end.getRuaEndereco() + "',"
                + "bairroEndereco = '" + end.getBairroEndereco() + "',"
                + "cepEndereco = '" + end.getCepEndereco() + "',"
                + "numEndereco = '" + end.getNumEndereco() + "',"
                + "referenciaEndereco = '" + end.getReferenciaEndereco() + "',"
                + "idClienteEndereco = '" + end.getIdClienteEndereco() + "',"
                + "idFornecedorEndereco = '" + end.getIdFornecedorEndereco() + "',"
                + "idFuncionarioEndereco = '" + end.getIdFuncionarioEndereco() + "',"
                + "complementoEndereco = '" + end.getComplementoEndereco() + "',"
                + "idCidadeEndereco = '" + end.getIdCidadeEndereco() + "' "
                + "where idEndereco = " + end.getIdEndereco() + ";";
        conectar();
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do endereco alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a endereco. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
    }

    @Override
    public ArrayList<Endereco> selecionarEnderecos() {
        String sql = "select * FROM endereco ORDER by nomeEndereco";
        ResultSet rs;
        conectar();
        ArrayList<Endereco> enderecos = new ArrayList<>();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Endereco end = new Endereco();
                end.setIdEndereco(rs.getInt("IdEndereco"));
                end.setRuaEndereco(rs.getString("RuaEndereco"));
                end.setBairroEndereco(rs.getString("BairroEndereco"));
                end.setCepEndereco(rs.getString("CepEndereco"));
                end.setNumEndereco(rs.getInt("NumEndereco"));
                end.setReferenciaEndereco(rs.getString("ReferenciaEndereco"));
                end.setIdClienteEndereco(rs.getInt("IdClienteEndereco"));
                end.setIdFornecedorEndereco(rs.getInt("IdFornecedorEndereco"));
                end.setIdFuncionarioEndereco(rs.getInt("IdFuncionarioEndereco"));
                end.setComplementoEndereco(rs.getString("ComplementoEndereco"));
                enderecos.add(end);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a endade \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);        }
        fechar();
        return enderecos;
    }

    @Override
    public ArrayList<Endereco> pesquisarEnderecosNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco pesquisarEnderecosFuncionario(int codigo) {
        String sql = "select * FROM endereco where idFuncionarioEndereco='"+codigo+"';";
        ResultSet rs;
        conectar();
        Endereco end = new Endereco();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                end.setIdEndereco(rs.getInt("IdEndereco"));
                end.setRuaEndereco(rs.getString("RuaEndereco"));
                end.setBairroEndereco(rs.getString("BairroEndereco"));
                end.setCepEndereco(rs.getString("CepEndereco"));
                end.setNumEndereco(rs.getInt("NumEndereco"));
                end.setReferenciaEndereco(rs.getString("ReferenciaEndereco"));
                end.setIdCidadeEndereco(rs.getInt("IdCidadeEndereco"));
                end.setIdClienteEndereco(rs.getInt("IdClienteEndereco"));
                end.setIdFornecedorEndereco(rs.getInt("IdFornecedorEndereco"));
                end.setIdFuncionarioEndereco(rs.getInt("IdFuncionarioEndereco"));
                end.setComplementoEndereco(rs.getString("ComplementoEndereco"));      
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a endereço \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }
        fechar();
        return end;
    }

    @Override
    public Endereco pesquisarEnderecosCliente(int codigo) {
        String sql = "select * FROM endereco where idClienteEndereco='"+codigo+"';";
        ResultSet rs;
        conectar();
        Endereco end = new Endereco();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                end.setIdEndereco(rs.getInt("IdEndereco"));
                end.setRuaEndereco(rs.getString("RuaEndereco"));
                end.setBairroEndereco(rs.getString("BairroEndereco"));
                end.setCepEndereco(rs.getString("CepEndereco"));
                end.setNumEndereco(rs.getInt("NumEndereco"));
                end.setReferenciaEndereco(rs.getString("ReferenciaEndereco"));
                end.setIdCidadeEndereco(rs.getInt("IdCidadeEndereco"));
                end.setIdClienteEndereco(rs.getInt("IdClienteEndereco"));
                end.setIdFornecedorEndereco(rs.getInt("IdFornecedorEndereco"));
                end.setIdFuncionarioEndereco(rs.getInt("IdFuncionarioEndereco"));
                end.setComplementoEndereco(rs.getString("ComplementoEndereco"));      
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a endereço \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }
        fechar();
        return end;
    }

    @Override
    public Endereco pesquisarEnderecos(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco pesquisarEnderecosFornecedor(int codigo) {
      String sql = "select * FROM endereco where idFornecedorEndereco='"+codigo+"';";
        ResultSet rs;
        conectar();
        Endereco end = new Endereco();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                end.setIdEndereco(rs.getInt("IdEndereco"));
                end.setRuaEndereco(rs.getString("RuaEndereco"));
                end.setBairroEndereco(rs.getString("BairroEndereco"));
                end.setCepEndereco(rs.getString("CepEndereco"));
                end.setNumEndereco(rs.getInt("NumEndereco"));
                end.setReferenciaEndereco(rs.getString("ReferenciaEndereco"));
                end.setIdCidadeEndereco(rs.getInt("IdCidadeEndereco"));
                end.setIdFornecedorEndereco(rs.getInt("IdFornecedorEndereco"));                
                end.setComplementoEndereco(rs.getString("ComplementoEndereco"));      
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a endereço \n Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }
        fechar();
        return end;
    }

    @Override
    public int pegarIdEndereco(Endereco end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

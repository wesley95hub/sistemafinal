package DAO;

import DAO.ProdutoDAO;
import DAO.DAOConexao;
import MODEL.Entrada;
import MODEL.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class ProdutoDAOImpl extends DAOConexao implements ProdutoDAO {

    @Override
    public void cadastrar(Produto pro) {
        String sql = "INSERT INTO Produto(idProduto,nomeProduto,modeloProduto,dataCadProduto,unidCompraProduto,unidVendaProduto,pesoProduto,valorVendaProduto,descricaoProduto,idTipoProduto,idMarcaProduto,obsProduto,percetualProduto,codigoBarraProduto,dataVencimentoProduto)Values('"
                + pro.getIdProduto() + "','" + pro.getNomeProduto() + "','" + pro.getModeloProduto() + "','" + pro.getDataCadProduto() + "','" + pro.getUnidCompraProduto() + "','" + pro.getUnidVendaProduto() + "','" + pro.getPesoProduto() + "','" + pro.getValorVendaProduto() + "','" + pro.getDescricaoProduto() + "','" + pro.getIdTipoProduto() + "','" + pro.getIdMarcaProduto() + "','" + pro.getObsProduto() + "','" + pro.getPercetualProduto() + "','" + pro.getCodigoBarrasProduto() + "','" + pro.getDataVencimentoProduto() + "');";
        conectar();
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Produto.  Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public void deletar(Produto pro) {
        String sql = "DELETE FROM Produto WHERE idProduto = " + pro.getIdProduto() + ";";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Produto", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();
    }

    @Override
    public Produto pesquisar(String nome) {
        String sql = "SELECT * FROM Produto  where idProduto = '" + nome + "' or nomeProduto like '" + nome + "%';";

        ResultSet rs;

        conectar();

        Produto pro = new Produto();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                pro.setIdProduto(rs.getInt("idProduto"));
                pro.setNomeProduto(rs.getString("nomeProduto"));
                pro.setDataCadProduto(rs.getString("dataCadProduto"));
                pro.setPercetualProduto(rs.getDouble("percetualProduto"));
                pro.setCodigoBarrasProduto(rs.getInt("codigoBarraProduto"));
                pro.setDataVencimentoProduto(rs.getString("dataVencimentoProduto"));
                pro.setUnidCompraProduto(rs.getString("unidCompraProduto"));
                pro.setUnidVendaProduto(rs.getString("unidVendaProduto"));
                pro.setPesoProduto(rs.getDouble("pesoProduto"));
                pro.setValorVendaProduto(rs.getDouble("valorVendaProduto"));
                pro.setDescricaoProduto(rs.getString("descricaoProduto"));
                pro.setIdTipoProduto(rs.getInt("idTipoProduto"));
                pro.setIdMarcaProduto(rs.getInt("idMarcaProduto"));
                pro.setModeloProduto(rs.getString("modeloProduto"));
                pro.setObsProduto(rs.getString("obsProduto"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Produto  Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return pro;
    }

    @Override
    public Produto pesquisar(int codigo) {
       String sql = "SELECT * FROM Produto order by idProduto";

        ResultSet rs;

        conectar();

        Produto pro = new Produto();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                pro.setIdProduto(rs.getInt("idProduto"));
                pro.setNomeProduto(rs.getString("nomeProduto"));
                pro.setDataCadProduto(rs.getString("dataCadProduto"));
                pro.setPercetualProduto(rs.getDouble("percetualProduto"));
                pro.setCodigoBarrasProduto(rs.getInt("codigoBarraProduto"));
                pro.setDataVencimentoProduto(rs.getString("dataVencimentoProduto"));
                pro.setUnidCompraProduto(rs.getString("unidCompraProduto"));
                pro.setUnidVendaProduto(rs.getString("unidVendaProduto"));
                pro.setPesoProduto(rs.getDouble("pesoProduto"));
                pro.setValorVendaProduto(rs.getDouble("valorVendaProduto"));
                pro.setDescricaoProduto(rs.getString("descricaoProduto"));
                pro.setIdTipoProduto(rs.getInt("idTipoProduto"));
                pro.setIdMarcaProduto(rs.getInt("idMarcaProduto"));
                pro.setModeloProduto(rs.getString("modeloProduto"));
                pro.setObsProduto(rs.getString("obsProduto"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Produto  Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
            
        }

        fechar();

        return pro;
    }

    @Override
    public void alterar(Produto pro) {

        String sql = "UPDATE Produto SET nomeProduto = '" + pro.getNomeProduto()
                + "', dataCadProduto = '" + pro.getDataCadProduto()
                + "',unidCompraProduto = '" + pro.getUnidCompraProduto()
                + "',unidVendaProduto ='" + pro.getUnidVendaProduto()
                + "', pesoProduto = '" + pro.getPesoProduto()
                + "', valorVendaProduto = '" + pro.getValorVendaProduto()
                + "',descricaoProduto ='" + pro.getDescricaoProduto()
                + "',idTipoProduto ='" + pro.getIdTipoProduto()
                + "',idMarcaProduto ='" + pro.getIdMarcaProduto()
                + "',modeloProduto ='" + pro.getModeloProduto()
                + "',obsProduto ='" + pro.getObsProduto()
                + "',dataVencimentoProduto ='" + pro.getDataVencimentoProduto()
                + "',percetualProduto ='" + pro.getPercetualProduto()
                + "'where idproduto = '" + pro.getIdProduto() + "';";

        conectar();

        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados do produto alterados com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o Produto.  Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }

    @Override
    public ArrayList<Produto> selecionarProdutos() {
        String sql = "SELECT * FROM Produto ORDER by nomeProduto";

        ResultSet rs;

        conectar();

        ArrayList<Produto> Produto = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Produto pro = new Produto();
                pro.setIdProduto(rs.getInt("idProduto"));
                pro.setNomeProduto(rs.getString("nomeProduto"));
                pro.setDataCadProduto(rs.getString("dataCadProduto"));
                pro.setUnidCompraProduto(rs.getString("unidCompraProduto"));
                pro.setUnidVendaProduto(rs.getString("unidVendaProduto"));
                pro.setPesoProduto(rs.getDouble("pesoProduto"));
                pro.setValorVendaProduto(rs.getDouble("valorVendaProduto"));
                pro.setDescricaoProduto(rs.getString("descricaoProduto"));
                pro.setIdTipoProduto(rs.getInt("idTipoProduto"));
                pro.setPercetualProduto(rs.getDouble("percetualProduto"));
                pro.setIdMarcaProduto(rs.getInt("idMarcaProduto"));
                pro.setObsProduto(rs.getString("ObsProduto"));
                pro.setCodigoBarrasProduto(rs.getInt("codigoBarraProduto"));
                pro.setDataVencimentoProduto(rs.getString("dataVencimentoProduto"));
                Produto.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o Produto  Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return Produto;
    }

    @Override
    public ArrayList< Produto> pesquisarProdutoNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList< Produto> selecionarProdutos(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarProduto(String nome) {
        String sql = "SELECT * FROM Produto where idProduto = '" + nome + "' or nomeProduto like '" + nome + "%' ORDER by nomeProduto";

        ResultSet rs;

        conectar();

        ArrayList<Produto> Produto = new ArrayList<>();

        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                Produto pro = new Produto();
                pro.setIdProduto(rs.getInt("idProduto"));
                pro.setNomeProduto(rs.getString("nomeProduto"));
                pro.setDataCadProduto(rs.getString("dataCadProduto"));
                pro.setUnidCompraProduto(rs.getString("unidCompraProduto"));
                pro.setUnidVendaProduto(rs.getString("unidVendaProduto"));
                pro.setPesoProduto(rs.getDouble("pesoProduto"));
                pro.setValorVendaProduto(rs.getDouble("valorVendaProduto"));
                pro.setDescricaoProduto(rs.getString("descricaoProduto"));
                pro.setIdTipoProduto(rs.getInt("idTipoProduto"));
                pro.setPercetualProduto(rs.getDouble("percetualProduto"));
                pro.setIdMarcaProduto(rs.getInt("idMarcaProduto"));
                pro.setObsProduto(rs.getString("ObsProduto"));
                pro.setCodigoBarrasProduto(rs.getInt("codigoBarraProduto"));
                pro.setDataVencimentoProduto(rs.getString("dataVencimentoProduto"));
                Produto.add(pro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar o Produto  Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

        return Produto;
    }

    @Override
    public int pegarIdProduto() {
        String sql = "SELECT max(idProduto) as id FROM Produto;";

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

    public double pegarEstoqueAtual(int codigo) {
        String sql = "SELECT SUM(quantEntrada) as qtd FROM entrada where idProdutoEntrada = '" + codigo + "';";
        String sql2 = "SELECT SUM(qtdSaida) as qtd FROM SAIDA where idProdutoSaida = '" + codigo + "';";
        ResultSet rs, rs2;
        double qtdEntrada = 0, qtdSaida = 0;
        conectar();
        try {
            rs = comando.executeQuery(sql);
            while (rs.next()) {
                qtdEntrada = rs.getDouble("qtd");
            }

            rs = comando.executeQuery(sql2);
            while (rs.next()) {
                qtdSaida = rs.getDouble("qtd");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        fechar();

        return (qtdEntrada - qtdSaida);
    }

    public void cadastrar(Entrada entrada) {
        String sql = "insert into entrada (idProdutoEntrada,quantEntrada,valorCompraEntrada,dataEntrada,idUsuarioEntrada) values ('" +
                entrada.getIdProdutoEntrada() + "','" + entrada.getQuantEntrada() + "','" + entrada.getValorCompraEntrada() +"','"+entrada.getDataEntrada()+"','"+entrada.getIdUsuarioEntrada()+"');";
        conectar();
        System.out.print(sql);
        try {
            comando.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Sucesso ao dar entrada no produto", "mensagem do sistema", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Entrada  Erro:" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);

        }

        fechar();

    }
}

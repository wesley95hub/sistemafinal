package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DAOConexao {
    protected Connection con;
    protected Statement comando;
    
    protected void conectar(){
        try {
            con = (Connection) ConFactory.conexao(ConFactory.MYSQL);
            comando = (Statement) con.createStatement();            
        } catch (ClassNotFoundException e){
            imprimeErro("Erro ao carregar o driver",e.getMessage());
        } catch (SQLException e){
            imprimeErro("Erro ao conectar", e.getMessage());
        }
    }
    protected void fechar(){
        try {
            comando.close();
            con.close();
        } catch (SQLException e){
            imprimeErro("Erro ao fechar conexão", e.getMessage());
        }
    }
    protected void imprimeErro(String msg, String msgErro){
        JOptionPane.showMessageDialog(null, msg + "\nErro:" + msgErro, "Erro Crítico", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
}

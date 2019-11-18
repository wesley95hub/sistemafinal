
package DAO;

import MODEL.Usuario;
import groovy.sql.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAOImpl extends DAOConexao {
    public Usuario validarUsuario(Usuario user){
        String sql = "SELECT * FROM USUARIO where cpfUsuario = '"+user.getCpf()+"';";
        conectar();
        ResultSet rs;
        Usuario usuario = new Usuario();
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                usuario.setCodigo(rs.getInt("idUsuario"));
                usuario.setCpf(rs.getString("SenhaUSuario"));
                usuario.setTentativaLogin(rs.getInt("tentativaLogin"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao validar o Usuário \n Erro" + ex.getMessage()+"\n Sql: "+sql, "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        fechar();
        return usuario;
    }
    
    public void bloquearUsuario(Usuario user){
        String sql = "UPDATE usuario set tentativaLogin='"+(user.getTentativaLogin()+1)+"' where idUsuario ='"+user.getCodigo()+"';";
        conectar();
        try {
            comando.executeUpdate(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a Usuario. \n Erro" + ex.getMessage(), "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
        }

        fechar();

    }
}
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConFactory {
    public static final int MYSQL = 0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/projeto";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection conexao(int banco) throws ClassNotFoundException, SQLException {
        switch (banco){
            case MYSQL:
                Class.forName(MySQLDriver);
                break;
                       
    }
        return DriverManager.getConnection(URL,USUARIO,SENHA);
    }
}

package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Victor Nascimento
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver"; // Driver usado.
    private static final String URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10240042"; // Usei uma servidor de MySQL Online sql10.freemysqlhosting.net:3306/sql10240042 gratuito permite ate 500mb de uso de disco e 1 banco de dados.
    private static final String USER = "sql10240042"; //meu loguin do serviço
    private static final String PASS = "3rpbFIgLgK"; // senha do serviço
    
    public static Connection getConnection(){
        try {
                Class.forName(DRIVER);
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException("erro na conexão getconnection", ex);
        }
    }
    
    public static void closeConnection(Connection com){
        if(com != null)
           try {
               com.close();
        } catch (SQLException ex) {
               System.err.print("erro: closseconnection COM");
        }  
    }
    public static void closeConnection(Connection com, PreparedStatement stmt){
       
       if(stmt != null)
           try {
               stmt.close();
        } catch (SQLException ex) {
           System.err.print("erro: closseconnection STMT");
        }
       closeConnection(com);
    }
    public static void closeConnection(Connection com, PreparedStatement stmt, ResultSet rs){
       
       if(rs != null)
           try {
               rs.close();
        } catch (SQLException ex) {
           System.err.print("erro: closseconnection RS");
        }
       closeConnection(com, stmt);
    }
    
}

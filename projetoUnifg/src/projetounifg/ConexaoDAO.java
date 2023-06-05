
package projetounifg;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDAO {

    public Connection conectBD() {
        
        Connection conexao = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/projetoUnifg?user=root&password=123";
            conexao = DriverManager.getConnection(url);
        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" +Erro.getMessage());
        }
        return conexao;
        
    }
}

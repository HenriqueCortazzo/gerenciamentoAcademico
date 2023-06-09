package userActions;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectBD() {

        Connection conexao = null;

        try {

            String url = "jdbc:mysql://localhost:3306/sistemacadastro?user=root&password=";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + Erro.getMessage());
        }
        return conexao;

    }
}

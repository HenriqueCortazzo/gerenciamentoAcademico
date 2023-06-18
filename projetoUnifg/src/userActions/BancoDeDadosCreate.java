package userActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BancoDeDadosCreate {

    String sql = "CREATE DATABASE `sistemacadastro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;";

    String sql3 = "CREATE TABLE `sistemaCadastro` ( `nome_aluno` varchar(200) DEFAULT NULL, `ra_Aluno` int(11) NOT NULL,`curso` varchar(45) NOT NULL,`data_Nascimento` varchar(45) NOT NULL,`tell` varchar(60) NOT NULL,`municipio` varchar(45) NOT NULL,`cpf` varchar(200) NOT NULL,`periodo` varchar(45) NOT NULL,`campus` varchar(45) NOT NULL,`uf` varchar(45) NOT NULL, `nota` varchar(45) DEFAULT NULL,`faltas` int(11) NOT NULL,`status` varchar(45) DEFAULT NULL, PRIMARY KEY (`ra_Aluno`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql4 = "CREATE TABLE `usuario` (`usuario_id` int(11) NOT NULL AUTO_INCREMENT,`usuario` varchar(200) NOT NULL,`senha` varchar(32) NOT NULL,PRIMARY KEY (`usuario_id`)) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql2 = "USE `sistemacadastro`";

    public void criarBancoDados() {
        Connection conn = new ConexaoDAO().conectBD();
        try {
            PreparedStatement preparar = conn.prepareStatement(sql);
            preparar.executeUpdate();
            preparar.executeUpdate(sql4);
            preparar.executeUpdate(sql2);
            preparar.executeUpdate(sql3);
            preparar.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}




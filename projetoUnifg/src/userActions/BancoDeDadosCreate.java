package userActions;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BancoDeDadosCreate {

    String sql = "CREATE DATABASE `sistemacadastro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;";

    String sql3 = "CREATE TABLE `sistemacadastro` (\n"
            + "  `nome_aluno` varchar(200) DEFAULT NULL,\n"
            + "  `ra_Aluno` int(11) NOT NULL,\n"
            + "  `curso` varchar(45) NOT NULL,\n"
            + "  `data_Nascimento` varchar(45) NOT NULL,\n"
            + "  `tell` varchar(60) NOT NULL,\n"
            + "  `municipio` varchar(45) NOT NULL,\n"
            + "  `cpf` varchar(200) NOT NULL,\n"
            + "  `periodo` varchar(45) NOT NULL,\n"
            + "  `campus` varchar(45) NOT NULL,\n"
            + "  `uf` varchar(45) NOT NULL,\n"
            + "  `nota` varchar(45) DEFAULT NULL,\n"
            + "  `faltas` int(11) NOT NULL,\n"
            + "  `status` varchar(45) DEFAULT NULL,\n"
            + "  PRIMARY KEY (`ra_Aluno`)\n"
            + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql4 = "CREATE TABLE `usuario` (\n"
            + "  `usuario_id` int(11) NOT NULL AUTO_INCREMENT,\n"
            + "  `usuario` varchar(200) NOT NULL,\n"
            + "  `senha` varchar(32) NOT NULL,\n"
            + "  PRIMARY KEY (`usuario_id`)\n"
            + ") ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql2 = "USE `sistemacadastros`";

    public void criarBancoDados() {
        com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) new ConexaoDAO().conectBD();
        try {
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.executeUpdate(sql);
            preparar.executeUpdate(sql4);
            preparar.executeUpdate(sql2);
            preparar.executeUpdate(sql3);
            preparar.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

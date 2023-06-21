package userActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BancoDeDadosCreate {

    String sql = "CREATE DATABASE IF NOT EXISTS `sistemacadastro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;";

    String sql3 = "CREATE TABLE IF NOT EXISTS `sistemacadastro`.`sistemaCadastro` (`nome_aluno` varchar(200) DEFAULT NULL,`ra_Aluno` varchar(45) NOT NULL,`curso` varchar(45) NOT NULL,`data_Nascimento` varchar(45) NOT NULL,`tell` varchar(60) NOT NULL,`municipio` varchar(45) NOT NULL,`cpf` varchar(200) NOT NULL,`periodo` varchar(45) NOT NULL,`campus` varchar(45) NOT NULL,`uf` varchar(45) NOT NULL,`nota` varchar(45) DEFAULT NULL,`faltas` int(11) DEFAULT NULL,`status` varchar(45) DEFAULT NULL,`idconta` int(11) DEFAULT NULL,PRIMARY KEY (`ra_Aluno`),KEY `FK_IDCONTA_idx` (`idconta`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql4 = "CREATE TABLE IF NOT EXISTS `sistemacadastro`.`usuario` (`usuario_Id` int(11) NOT NULL AUTO_INCREMENT,`usuario` varchar(200) NOT NULL,`senha` varchar(32) NOT NULL,PRIMARY KEY (`usuario_Id`)) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    String sql2 = "USE `sistemacadastro`";

    public void criarBancoDados() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", ""); Statement preparar = conn.createStatement()) {
            preparar.executeUpdate(sql);
            preparar.executeUpdate(sql2);
            preparar.executeUpdate(sql3);
            preparar.executeUpdate(sql4);
            preparar.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

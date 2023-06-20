/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userActions;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusWP
 */
public class usuarioCadastroDAO {

    Connection conn;

    public boolean UserVerificationExisting(String usuario) {
        conn = (Connection) new ConexaoDAO().conectBD();
        boolean usuarioExistente = false;

        String sql = "SELECT COUNT(*) FROM usuario WHERE usuario = ?";
        try {
            PreparedStatement verificar = (PreparedStatement) conn.prepareStatement(sql);
            verificar.setString(1, usuario);
            ResultSet resultSet = verificar.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                usuarioExistente = count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioExistente;
    }

    public int cadastrarUsuario(userActions.Usuario usuarioCadastroDAO) {
        conn = (Connection) new ConexaoDAO().conectBD();
        try {
            String sql = "INSERT INTO usuario (usuario, senha) VALUES (?, ?);";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.setString(1, usuarioCadastroDAO.getNome());
            preparar.setString(2, usuarioCadastroDAO.getSenha());
            preparar.setString(2, usuarioCadastroDAO.getConfSenha());

            int resultado = preparar.executeUpdate();
            return resultado;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioCadastroDAO" + erro);
        }
        return 0;
    }
}

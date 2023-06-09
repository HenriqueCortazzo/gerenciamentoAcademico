/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userActions;

import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author MatheusWP
 */
public class usuario_DAO {

    Connection conn;

    public ResultSet autenticarUsuario(userActions.Usuario usuario_DAO) {
        conn = (Connection) new ConexaoDAO().conectBD();
        try {
            String sql = "select * from usuario where usuario = ? and senha = ?";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.setString(1, usuario_DAO.getNome());
            preparar.setString(2, usuario_DAO.getSenha());

            ResultSet resultado = preparar.executeQuery();
            return resultado;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }

        return null;
    }
}

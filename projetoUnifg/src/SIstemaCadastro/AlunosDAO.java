/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstemaCadastro;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import userActions.ConexaoDAO;
import java.sql.ResultSet;
import SIstemaCadastro.Aluno;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author MatheusWP
 */
public class AlunosDAO {

    Connection conn;
    PreparedStatement preparar;
    ResultSet rs;
    ArrayList<Aluno> lista = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        conn = (Connection) new ConexaoDAO().conectBD();

        try {
            String sql = "INSERT INTO sistemaCadastro (nome_Aluno, ra_Aluno, curso, data_Nascimento, tell, municipio, cpf, periodo, campus, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.setString(1, aluno.getNome());
            preparar.setString(2, aluno.getRa());
            preparar.setString(3, aluno.getCurso());
            preparar.setString(4, aluno.getData());
            preparar.setString(5, aluno.getTelefone());
            preparar.setString(6, aluno.getMunicipio());
            preparar.setString(7, aluno.getCpf());
            preparar.setString(8, aluno.getPeriodo1());
            preparar.setString(9, aluno.getCampus());
            preparar.setString(10, aluno.getUf());

            int resultado = preparar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar aluno.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno: " + erro.getMessage());
        }
    }

    public ArrayList<Aluno> listarAluno() {
        conn = (Connection) new ConexaoDAO().conectBD();
        String sql = " SELECT * FROM sistemaCadastro";

        try {
            preparar = (PreparedStatement) conn.prepareStatement(sql);
            rs = preparar.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome_aluno"));
                aluno.setRa(rs.getString("ra_Aluno"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setData(rs.getString("data_nascimento"));
                aluno.setTelefone(rs.getString("tell"));
                aluno.setMunicipio(rs.getString("municipio"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setPeriodo1(rs.getString("periodo"));
                aluno.setCampus(rs.getString("campus"));
                aluno.setUf(rs.getString("uf"));

                lista.add(aluno);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarAlunos" + erro);
        }

        return lista;

    }

    public void editarDados(Aluno aluno) throws SQLException {
        conn = (Connection) new ConexaoDAO().conectBD();

        try {
            String sql = "UPDATE sistemaCadastro SET nome_Aluno=?, ra_Aluno=?, curso=?, data_Nascimento=?, tell=?, municipio=?, cpf=?, periodo=?, campus=?, uf=?";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);

            preparar.setString(1, aluno.getNome());
            preparar.setString(2, aluno.getRa());
            preparar.setString(3, aluno.getCurso());
            preparar.setString(4, aluno.getData());
            preparar.setString(5, aluno.getTelefone());
            preparar.setString(6, aluno.getMunicipio());
            preparar.setString(7, aluno.getCpf());
            preparar.setString(8, aluno.getPeriodo1());
            preparar.setString(9, aluno.getCampus());
            preparar.setString(10, aluno.getUf());

            int resultado = preparar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao alterar dados.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao editar aluno: " + erro.getMessage());
        }
    }

    public void excluirDados(Aluno aluno) {
        conn = (Connection) new ConexaoDAO().conectBD();

        try {
            String sql = "DELETE FROM sistemacadastro WHERE ra_Aluno = ?";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);

            preparar.setString(1, aluno.getRa());

            int resultado = preparar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao deletar dados.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao editar aluno: " + erro.getMessage());
        }
    }

    public void definirMedia(Aluno aluno) {
        conn = (Connection) new ConexaoDAO().conectBD();

        try {
            String sql = "UPDATE sistemaCadastro SET nota = ? WHERE ra_aluno = ?";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.setDouble(1, aluno.getNota());
            preparar.setString(2, aluno.getRa());

            String sql1 = "UPDATE sistemaCadastro SET status = ? WHERE ra_aluno = ?";
            PreparedStatement preparar1 = (PreparedStatement) conn.prepareStatement(sql1);
            preparar1.setString(1, aluno.getStatus());
            preparar1.setString(2, aluno.getRa());

            int resultado = preparar.executeUpdate();
            int resultado1 = preparar1.executeUpdate();

            if (resultado > 0 && resultado1 > 0) {
                JOptionPane.showMessageDialog(null, "Nota e status atribuídos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atribuir nota e status.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao atribuir nota e status: " + erro.getMessage());
        }
    }

    public void definirFaltas(Aluno aluno) {
        conn = (Connection) new ConexaoDAO().conectBD();

        try {

            String sql = "UPDATE sistemaCadastro SET faltas = ? WHERE ra_aluno = ?";
            PreparedStatement preparar = (PreparedStatement) conn.prepareStatement(sql);
            preparar.setInt(1, aluno.getFaltas());
            preparar.setString(2, aluno.getRa());

            int resultado = preparar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Faltas atribuídas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atribuir faltas.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao atribuir nota e status: " + erro.getMessage());
        }
    }

}

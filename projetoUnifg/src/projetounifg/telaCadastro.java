/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetounifg;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import userActions.Usuario;
import userActions.usuarioCadastroDAO;
import userActions.usuario_DAO;

/**
 *
 * @author MatheusWP
 */
public class telaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
    public telaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        termos = new javax.swing.JCheckBox();
        loginAut = new javax.swing.JButton();
        newAcess = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 225));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastre-se");
        jLabel3.setAlignmentX(0.5F);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Iremos iniciar em breve!");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Digite um nome de Usuário:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Digite uma senha:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Confirme a senha:");

        termos.setBackground(new java.awt.Color(25, 118, 225));
        termos.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        termos.setForeground(java.awt.Color.white);
        termos.setText("Aceito os Termos de condição");
        termos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termosActionPerformed(evt);
            }
        });

        loginAut.setBackground(java.awt.Color.white);
        loginAut.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        loginAut.setForeground(java.awt.Color.black);
        loginAut.setText("Realizar cadastro");
        loginAut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginAut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginAutMouseClicked(evt);
            }
        });
        loginAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAutActionPerformed(evt);
            }
        });
        loginAut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginAutKeyPressed(evt);
            }
        });

        newAcess.setBackground(java.awt.Color.white);
        newAcess.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        newAcess.setForeground(java.awt.Color.black);
        newAcess.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        newAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAcessActionPerformed(evt);
            }
        });
        newAcess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newAcessKeyPressed(evt);
            }
        });

        confirmPassword.setBackground(java.awt.Color.white);
        confirmPassword.setForeground(java.awt.Color.black);
        confirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordKeyPressed(evt);
            }
        });

        newPassword.setBackground(java.awt.Color.white);
        newPassword.setForeground(java.awt.Color.black);
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });
        newPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPasswordKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Já possui uma conta? Clique aqui");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(newAcess)
                            .addComponent(newPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(termos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(loginAut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(termos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginAut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(410, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginAutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginAutKeyPressed
//
    }//GEN-LAST:event_loginAutKeyPressed

    private void loginAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAutActionPerformed
        if (termos.isSelected()) {
            String usuario, senha, confSenha;

            usuario = newAcess.getText();
            senha = newPassword.getText();
            confSenha = confirmPassword.getText();

            if (usuario.length() > 5 && senha.length() > 5) {
                usuarioCadastroDAO CadastroUserDAO = new usuarioCadastroDAO();

                boolean usuarioExistente = CadastroUserDAO.UserVerificationExisting(usuario);

                if (usuarioExistente) {
                    JOptionPane.showMessageDialog(null, "Nome de Usuário já cadastrado. Por favor, escolha outro nome de usuário.");
                    newAcess.setText("");
                    newPassword.setText("");
                    confirmPassword.setText("");
                    newAcess.requestFocus();
                } else {
                    Usuario usuarioCadastroDAO = new Usuario();
                    usuarioCadastroDAO.setNome(usuario);
                    usuarioCadastroDAO.setSenha(senha);
                    usuarioCadastroDAO.setConfSenha(confSenha);

                    int resultadoDAO = CadastroUserDAO.cadastrarUsuario(usuarioCadastroDAO);

                    if (resultadoDAO > 0 && senha.equals(confSenha)) {
                        JOptionPane.showMessageDialog(null, "Informamos que ao aceitar os Termos de Condições as informações de usuário ficarão salvas em um banco de dados.");
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
                        paginaLogin telaLogin = new paginaLogin();
                        telaLogin.setVisible(true);
                        dispose();
                    } else {
                        newAcess.setText("");
                        newPassword.setText("");
                        confirmPassword.setText("");
                        newAcess.requestFocus();
                        JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "O nome de usuário e a senha devem ter pelo menos 6 caracteres");
                newAcess.setText("");
                newPassword.setText("");
                confirmPassword.setText("");
                newAcess.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário aceitar os Termos de Condições para continuar.");
        }


    }//GEN-LAST:event_loginAutActionPerformed

    private void loginAutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAutMouseClicked

    private void newAcessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newAcessKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            newPassword.requestFocus();
        }
    }//GEN-LAST:event_newAcessKeyPressed

    private void newAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAcessActionPerformed

    }//GEN-LAST:event_newAcessActionPerformed

    private void termosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termosActionPerformed

    }//GEN-LAST:event_termosActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed

    }//GEN-LAST:event_newPasswordActionPerformed

    private void newPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            confirmPassword.requestFocus();
        }
    }//GEN-LAST:event_newPasswordKeyPressed

    private void confirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (termos.isSelected()) {
                String usuario, senha, confSenha;

                usuario = newAcess.getText();
                senha = newPassword.getText();
                confSenha = confirmPassword.getText();

                if (usuario.length() > 5 && senha.length() > 5) {
                    usuarioCadastroDAO CadastroUserDAO = new usuarioCadastroDAO();

                    boolean usuarioExistente = CadastroUserDAO.UserVerificationExisting(usuario);

                    if (usuarioExistente) {
                        JOptionPane.showMessageDialog(null, "Nome de Usuário já cadastrado. Por favor, escolha outro nome de usuário.");
                        newAcess.setText("");
                        newPassword.setText("");
                        confirmPassword.setText("");
                        newAcess.requestFocus();
                    } else {
                        Usuario usuarioCadastroDAO = new Usuario();
                        usuarioCadastroDAO.setNome(usuario);
                        usuarioCadastroDAO.setSenha(senha);
                        usuarioCadastroDAO.setConfSenha(confSenha);

                        int resultadoDAO = CadastroUserDAO.cadastrarUsuario(usuarioCadastroDAO);

                        if (resultadoDAO > 0 && senha.equals(confSenha)) {
                            JOptionPane.showMessageDialog(null, "Informamos que ao aceitar os Termos de Condições as informações de usuário ficarão salvas em um banco de dados.");
                            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
                            paginaLogin telaLogin = new paginaLogin();
                            telaLogin.setVisible(true);
                            dispose();
                        } else {
                            newAcess.setText("");
                            newPassword.setText("");
                            confirmPassword.setText("");
                            newAcess.requestFocus();
                            JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O nome de usuário e a senha devem ter pelo menos 6 caracteres");
                    newAcess.setText("");
                    newPassword.setText("");
                    confirmPassword.setText("");
                    newAcess.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "É necessário aceitar os Termos de Condições para continuar.");
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new paginaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginAut;
    private javax.swing.JTextField newAcess;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JCheckBox termos;
    // End of variables declaration//GEN-END:variables
}

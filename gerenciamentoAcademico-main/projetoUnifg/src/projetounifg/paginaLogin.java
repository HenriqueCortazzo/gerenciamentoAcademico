/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetounifg;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusWP
 */
public class paginaLogin extends javax.swing.JFrame {

    /**
     * Creates new form paginaLogin
     */
    public paginaLogin() {
        initComponents();
        userAcess.setBackground(new java.awt.Color(0, 0, 0, 1));
        passwordAcess.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disabled1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rememberPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        loginAut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        userAcess = new javax.swing.JTextField();
        passwordAcess = new javax.swing.JPasswordField();

        disabled1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetounifg/icon/icons8_invisible_24px.png"))); // NOI18N
        disabled1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/projetounifg/icon/icons8_eye_24px.png"))); // NOI18N
        disabled1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disabled1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(25, 118, 225));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jLabel3.setAlignmentX(0.5F);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Usuário");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Olá! Vamos começar.");

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("________________________________________");

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("________________________________________");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Senha");

        rememberPassword.setBackground(new java.awt.Color(25, 118, 225));
        rememberPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        rememberPassword.setForeground(java.awt.Color.white);
        rememberPassword.setText("Relembrar senha");
        rememberPassword.setBorder(null);
        rememberPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rememberPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rememberPasswordMouseClicked(evt);
            }
        });
        rememberPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Esqueceu a senha?");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginAut.setBackground(java.awt.Color.white);
        loginAut.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        loginAut.setForeground(java.awt.Color.black);
        loginAut.setText("Fazer Login");
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

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Não tem uma conta? Cadastre-se ");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        userAcess.setBackground(new java.awt.Color(25, 118, 225));
        userAcess.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        userAcess.setForeground(java.awt.Color.white);
        userAcess.setToolTipText("");
        userAcess.setBorder(null);
        userAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAcessActionPerformed(evt);
            }
        });
        userAcess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userAcessKeyPressed(evt);
            }
        });

        passwordAcess.setBackground(new java.awt.Color(25, 118, 225));
        passwordAcess.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        passwordAcess.setForeground(java.awt.Color.white);
        passwordAcess.setToolTipText("");
        passwordAcess.setBorder(null);
        passwordAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordAcessActionPerformed(evt);
            }
        });
        passwordAcess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordAcessKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordAcess)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(loginAut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 49, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rememberPassword)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(userAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberPassword)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(loginAut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(201, Short.MAX_VALUE)
                    .addComponent(userAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(441, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disabled1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disabled1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_disabled1MouseClicked

    private void passwordAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordAcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordAcessActionPerformed

    private void userAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAcessActionPerformed

    private void loginAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAutActionPerformed

        if (userAcess.getText().equals("Matheus") && passwordAcess.getText().equals("admin")) {
            JOptionPane.showMessageDialog(null, "Seja bem vindo, " + userAcess.getText() + "! \nEstamos inciando o sistema");
            new NewJFrame().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado, tente novamente.");
            userAcess.setText("");
            passwordAcess.setText("");
            userAcess.requestFocus();
        }
    }//GEN-LAST:event_loginAutActionPerformed

    private void rememberPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberPasswordActionPerformed

    private void loginAutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAutMouseClicked

    private void rememberPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rememberPasswordMouseClicked
        if (rememberPassword.isSelected() && userAcess.getText().equals("Matheus") && passwordAcess.getText().equals("admin")) {
            JOptionPane.showMessageDialog(null, "Salvaremos seus dados.");
        } else {
            // precisa encontrar uma forma de desabilitar o botão.
            rememberPassword.isSelected();
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_rememberPasswordMouseClicked

    private void userAcessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userAcessKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passwordAcess.requestFocus();
        }
    }//GEN-LAST:event_userAcessKeyPressed

    private void passwordAcessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordAcessKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (userAcess.getText().equals("Matheus") && passwordAcess.getText().equals("admin")) {
                new NewJFrame().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado, tente novamente.");
                userAcess.setText("");
                passwordAcess.setText("");
                userAcess.requestFocus();
            }
        }
    }//GEN-LAST:event_passwordAcessKeyPressed

    private void loginAutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginAutKeyPressed
        if (rememberPassword.isSelected() && userAcess.getText().equals("admin") && passwordAcess.getText().equals("admin")) {
            new NewJFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_loginAutKeyPressed

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
            java.util.logging.Logger.getLogger(paginaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disabled1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginAut;
    private javax.swing.JPasswordField passwordAcess;
    private javax.swing.JCheckBox rememberPassword;
    private javax.swing.JTextField userAcess;
    // End of variables declaration//GEN-END:variables
}

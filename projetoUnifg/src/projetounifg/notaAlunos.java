/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetounifg;

import SIstemaCadastro.Aluno;
import SIstemaCadastro.AlunosDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetounifg.notas;

/**
 *
 * @author MatheusWP
 */
public class notaAlunos extends javax.swing.JFrame {

    /**
     * Creates new form notaAlunos
     */
    public notaAlunos() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gerarBoletim = new javax.swing.JButton();
        ra = new javax.swing.JTextField();
        nomeDoAluno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        resultadoMedia = new javax.swing.JTextField();
        gerarBoletim1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        nota4 = new javax.swing.JTextField();
        nota1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 225));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Notas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nome do Aluno");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("RA do Aluno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Nota 1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Nota 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Nota 3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Nota 4");

        gerarBoletim.setBackground(java.awt.Color.white);
        gerarBoletim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gerarBoletim.setForeground(java.awt.Color.black);
        gerarBoletim.setText("Gerar Boletim");
        gerarBoletim.setBorder(null);
        gerarBoletim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerarBoletim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarBoletimActionPerformed(evt);
            }
        });
        gerarBoletim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gerarBoletimKeyPressed(evt);
            }
        });

        ra.setBackground(java.awt.Color.white);
        ra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ra.setForeground(java.awt.Color.black);
        ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raActionPerformed(evt);
            }
        });

        nomeDoAluno.setBackground(java.awt.Color.white);
        nomeDoAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomeDoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoAlunoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Média final");

        resultadoMedia.setBackground(java.awt.Color.white);
        resultadoMedia.setForeground(java.awt.Color.black);

        gerarBoletim1.setBackground(java.awt.Color.white);
        gerarBoletim1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gerarBoletim1.setForeground(java.awt.Color.black);
        gerarBoletim1.setText("Emitir Boletim");
        gerarBoletim1.setBorder(null);
        gerarBoletim1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerarBoletim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarBoletim1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Status");

        status.setBackground(java.awt.Color.white);
        status.setForeground(java.awt.Color.black);

        nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2ActionPerformed(evt);
            }
        });
        nota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nota2KeyPressed(evt);
            }
        });

        nota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nota3KeyPressed(evt);
            }
        });

        nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota4ActionPerformed(evt);
            }
        });
        nota4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nota4KeyPressed(evt);
            }
        });

        nota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nota1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeDoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(resultadoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gerarBoletim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(gerarBoletim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(2, 2, 2)))
                        .addGap(0, 24, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultadoMedia)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gerarBoletim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gerarBoletim1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(409, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public void receberDados(notas modelo) {
        nomeDoAluno.setText(modelo.getNome());
        ra.setText(modelo.getRa());
    }

    public void listarDados() {
        try {
            AlunosDAO aluno = new AlunosDAO();
            NewJFrame tabela = new NewJFrame();
            DefaultTableModel model = (DefaultTableModel) tabela.tbAlunos.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista = (ArrayList<Aluno>) aluno.listarAluno();

            for (int num = 0; num < lista.size(); num++) {
                Aluno aluno1 = lista.get(num);
                Object[] alunos = {
                    aluno1.getNome(),
                    aluno1.getRa(),
                    aluno1.getCurso(),
                    aluno1.getData(),
                    aluno1.getTelefone(),
                    aluno1.getMunicipio(),
                    aluno1.getCpf(),
                    aluno1.getPeriodo1(),
                    aluno1.getCampus(),
                    aluno1.getUf(),
                    aluno1.getNota(),
                    aluno1.getFaltas(),
                    aluno1.getStatus(),};
                model.addRow(alunos);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ListarDados tela" + erro);
        }
    }

    private void definirMedia() {

        String ra = this.ra.getText();
        String resultado = resultadoMedia.getText();
        String status = this.status.getText();

        if (resultado.isEmpty() || ra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foi possível definir a média do aluno.\n Por favor, tente novamente.");
        } else {
            SIstemaCadastro.Aluno alunos = new Aluno();
            alunos.setRa(ra);
            alunos.setNota(Double.parseDouble(resultado));
            alunos.setStatus(status);
            SIstemaCadastro.AlunosDAO alunosDAO = new AlunosDAO();
            alunosDAO.definirMedia(alunos);
            JOptionPane.showMessageDialog(null, "Estamos te redirecionando para para página principal.");
            dispose();
            NewJFrame telaPrincipal = new NewJFrame();
            telaPrincipal.setVisible(true);
            listarDados();
        }
    }

    private void raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raActionPerformed

    private void nomeDoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoAlunoActionPerformed

    }//GEN-LAST:event_nomeDoAlunoActionPerformed

    private void gerarBoletimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarBoletimActionPerformed
        if (nota1.getText().equals("   ") || nota2.getText().equals("   ") || nota3.getText().equals("   ") || nota4.getText().equals("   ")) {
            JOptionPane.showMessageDialog(null, "Não foi possível calcular a média do aluno, tente novamente.");
        }
        notas method = new notas();
        double primeiraNota = Double.parseDouble(nota1.getText());
        double segundaNota = Double.parseDouble(nota2.getText());
        double terceiraNota = Double.parseDouble(nota3.getText());
        double quartaNota = Double.parseDouble(nota4.getText());
        double resultado = method.calcularNota(primeiraNota, segundaNota, terceiraNota, quartaNota);

        if (resultado >= 7) {
            String novoResultado = Double.toString(resultado);
            resultadoMedia.setText(novoResultado);
            status.setText("Aprovado");
        } else if (resultado < 5) {
            String novoResultado = Double.toString(resultado);
            resultadoMedia.setText(novoResultado);
            status.setText("Reprovado");
        } else if (resultado < 7 && resultado >= 5) {
            String novoResultado = Double.toString(resultado);
            resultadoMedia.setText(novoResultado);
            status.setText("Recuperação");
        }
    }//GEN-LAST:event_gerarBoletimActionPerformed

    private void gerarBoletim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarBoletim1ActionPerformed
        definirMedia();

    }//GEN-LAST:event_gerarBoletim1ActionPerformed

    private void nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2ActionPerformed

    private void nota1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nota2.requestFocus();
        }
    }//GEN-LAST:event_nota1KeyPressed

    private void nota2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nota3.requestFocus();
        }
    }//GEN-LAST:event_nota2KeyPressed

    private void nota3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nota4.requestFocus();
        }
    }//GEN-LAST:event_nota3KeyPressed

    private void nota4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gerarBoletim.requestFocus();
        }
    }//GEN-LAST:event_nota4KeyPressed

    private void nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota4ActionPerformed

    private void gerarBoletimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gerarBoletimKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gerarBoletimKeyPressed

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
            java.util.logging.Logger.getLogger(notaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notaAlunos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerarBoletim;
    private javax.swing.JButton gerarBoletim1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeDoAluno;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JTextField nota4;
    private javax.swing.JTextField ra;
    private javax.swing.JTextField resultadoMedia;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables

    private void recebernota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void gerarBoletimActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

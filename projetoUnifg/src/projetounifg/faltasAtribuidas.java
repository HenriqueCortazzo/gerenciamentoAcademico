/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetounifg;

import javax.swing.JOptionPane;

/**
 *
 * @author MatheusWP
 */
public class faltasAtribuidas {

    private String nome;
    private String ra;
    private String faltas;

    public int adicionarFaltas(int falta) {
        int todasFaltas = falta;
        int somaFaltas = todasFaltas++;
        return somaFaltas;
    }

    public int verFaltas(int falta) {
        int totalFaltas = falta;
        int zero = 0;
        if (falta >= 1) {
            JOptionPane.showMessageDialog(null, "Este aluno possui um total de " + totalFaltas + " faltas.");
        } else {
            JOptionPane.showMessageDialog(null, "O numero de faltas é igual á " + zero + ".");
        }
        
        
        return 0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the faltas
     */
    public String getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }
}

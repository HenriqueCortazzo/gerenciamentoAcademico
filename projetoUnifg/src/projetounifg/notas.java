package projetounifg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MatheusWP
 */
public class notas {

    private String nome;
    private String Ra;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public double calcularNota(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
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
     * @return the Ra
     */
    public String getRa() {
        return Ra;
    }

    /**
     * @param Ra the Ra to set
     */
    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the nota4
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * @param nota4 the nota4 to set
     */
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}

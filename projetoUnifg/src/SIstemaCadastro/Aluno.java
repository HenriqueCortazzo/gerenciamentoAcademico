/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstemaCadastro;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusWP
 */
public class Aluno {
    private int id;
    private String nome;
    private String ra;
    private String telefone;
    private String data;
    private String municipio;
    private String cpf;
    private String periodo1;
    private String periodo2;
    private String periodo3;
    private String curso;
    private String uf;
    private String campus;

    //constructor
//    public Aluno(String nome, String ra, String telefone, String data, String municipio, String cpf, String curso, boolean periodo1, boolean periodo2, boolean periodo3, String uf, String campus) {
//        this.nome = nome;
//        this.ra = ra;
//        this.telefone = telefone;
//        this.data = data;
//        this.municipio = municipio;
//        this.cpf = cpf;
//        this.curso = curso;
//        this.periodo1 = periodo1;
//        this.periodo2 = periodo2;
//        this.periodo3 = periodo3;
//        this.campus = campus;
//        this.uf = uf;
//
//    }

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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the periodo1
     */
    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the campus
     */
    public String getCampus() {
        return campus;
    }

    /**
     * @param campus the campus to set
     */
    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getPeriodo1() {
        return periodo1;
    }

    /**
     * @param periodo1 the periodo1 to set
     */
    public void setPeriodo1(String periodo1) {
        this.periodo1 = periodo1;
    }

    /**
     * @return the periodo2
     */
    public String getPeriodo2() {
        return periodo2;
    }

    /**
     * @param periodo2 the periodo2 to set
     */
    public void setPeriodo2(String periodo2) {
        this.periodo2 = periodo2;
    }

    /**
     * @return the periodo3
     */
    public String getPeriodo3() {
        return periodo3;
    }

    /**
     * @param periodo3 the periodo3 to set
     */
    public void setPeriodo3(String periodo3) {
        this.periodo3 = periodo3;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}

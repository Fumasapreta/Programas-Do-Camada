package com.mycompany.mavenproject1;

import java.util.Date;

public class Estudante {

    //(ano de ingresso +semetre + 5 digitos)
    private String codigoMatricula;

    // Dados Pessoais
    private String cpf;
    private String nomeCompleto;
    private Date dataNascimento;
    private char genero;
    private String enderecoEletronico;
    private String telefoneContato;
    private static String nivelEnsino;

    // Dados Institucionais
    private int anoIngresso;
    private int semestreIngresso;
    private String situacaoAcademica;

    public Estudante() {
        this.nomeCompleto = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        //Lógica para calcular idade
        return idade;

    }

    public String getNomeCompleto() {

        return nomeCompleto;
    }

    public void setNomeCompleto(String nome) {
        nomeCompleto = nome;
    }

    public void setMatricula(String codigo) {
        codigoMatricula = codigo;
    }

    public String getMatricula() {
        return "" + anoIngresso + semestreIngresso + codigoMatricula;
    }

}

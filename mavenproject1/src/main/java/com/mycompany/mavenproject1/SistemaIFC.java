package com.mycompany.mavenproject1;
import java.util.Date;

public class SistemaIFC {
    public static void main(String[] args) {
        Estudante camada = new Estudante ();
        Estudante vinicius = new Estudante ();
        Estudante joao = new Estudante ();
        
        camada.setNomeCompleto("camada");
        vinicius.setNomeCompleto("vinicius");
        joao.setNomeCompleto("joao");
        
        System.out.println(camada.getNomeCompleto());
        System.out.println(vinicius.getNomeCompleto());
        System.out.println(joao.getNomeCompleto());
    }
}
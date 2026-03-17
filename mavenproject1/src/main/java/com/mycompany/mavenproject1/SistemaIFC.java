package com.mycompany.mavenproject1;
import java.util.Date;

public class SistemaIFC {
    public static void main(String[] args) {
        Estudante camada = new Estudante ();
        Estudante vinicius = new Estudante ();
        Estudante joao = new Estudante ();
        
        camada.setNome("camada");
        vinicius.setNome("vinicius");
        joao.setNome("joao");
        
        System.out.println(camada.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(joao.getNome());
    }
}
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
        
        
        
        public Estudante(){
            this.nome = "Nobody";
        }
        
      public int obterIdade(Date hoje){
         int idade = 0;
         
          //Lógica para calcular idade
            return idade;   
           
  }
      public static String getNome (){
     
          return nome;
      }     
      
      public static void setNome(String _nome){
          nome = _nome;
      }
      public void setMatricula(String _digitos) {
              digito = _digito;
      }
      public String getMatricula() {
              return anoIngresso+semestre=digitos;
      }  


}

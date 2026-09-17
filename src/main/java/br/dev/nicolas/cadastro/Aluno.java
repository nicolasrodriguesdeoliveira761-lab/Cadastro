package br.dev.nicolas.cadastro;

/**
 * Classe para representar o objeto Aluno
 * dentro do sistema de cadastro de alunos.
 * 
 * @author sesi2dib
 */
public class Aluno {
    
//----------------\\
    int id;
    String nome;
    int dia;
    int mes;
    int ano;
//----------------\\
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
    public int calcularIdade() {
        
        return 2026 - this.ano;
        
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
    
}

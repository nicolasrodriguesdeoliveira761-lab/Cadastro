package br.dev.nicolas.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class Cadastro {
    
    
    
    public static void main3(String[] args) {
        
        Aluno a1 = new Aluno();
        
        a1.id = 100;
        a1.nome = "Nicolas";
        a1.telefone = 5445;
        a1.dia = 13;
        a1.mes = 1;
        a1.ano = 2010;
        
        System.out.println(a1.toString());
        
        Aluno a2 = new Aluno(200, "Nicolas Rodrigues", 5445, 13, 1, 2010);
        System.out.print(a2.toString());
            
    }
    
    
    public static void main(String[] args) {
        
        
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);
        
        // Entrando os critérios da tabela...
        
        while (true) {
        
            Aluno novoAluno = new Aluno();
            

            System.out.printf("Informe o ID: ");
            novoAluno.id = tecladoNumero.nextInt();
            
            if (novoAluno.id == 0) {
                break;
            }
            
            System.out.printf("Informe o Nome: ");
            novoAluno.nome = tecladoTexto.nextLine();
            
            System.out.printf("Informe o Telefone: ");
            novoAluno.telefone = tecladoNumero.nextLong();
            
            System.out.printf("Informe o seu dia de nascimento: ");
            novoAluno.dia = tecladoNumero.nextInt();
            
            System.out.printf("Informe o seu mês de nascimento: ");
            novoAluno.mes = tecladoNumero.nextInt();
            
            System.out.printf("Informe o seu ano de nascimento: ");
            novoAluno.ano = tecladoNumero.nextInt();
            
            listaAlunos.add(novoAluno);
            
        }
        
        //                  1234567890 | 12345678901234567890 | 123456789012 | dd/mm/aaaa | 1234 
        System.out.printf("+-----------+----------------------+--------------+--------------------+-------+\n");
        System.out.printf("|    ID     |         Nome         |   Telefone   | Data de nascimento | Idade |\n");
        System.out.printf("+-----------+----------------------+--------------+--------------------+-------+\n");
        
        for(Aluno aux : listaAlunos) {
            System.out.println(aux.toString());
        }
        
        System.out.println("Fim do programa");
        
        }
    }


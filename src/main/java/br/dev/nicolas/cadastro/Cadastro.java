package br.dev.nicolas.cadastro;

import java.util.Scanner;
import java.util.Scanner;

public class Cadastro {
    
    public static final int MAX = 1;
    
    public static void main(String[] args) {
        
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);
        
        int[] ID = new int[MAX];
        String[] Nome = new String[MAX];
        long[] Telefone = new long[MAX];
        int[] Dia = new int[MAX];
        int[] Mes = new int[MAX];
        int[] Ano = new int[MAX];
        int[] Idade = new int[MAX];
        
        // Entrando os critérios da tabela...
        
        for (int i = 0; i < ID.length; i++) {

            System.out.printf("Informe o ID: ");
            ID[i] = tecladoNumero.nextInt();
            
            System.out.printf("Informe o Nome: ");
            Nome[i] = tecladoTexto.nextLine();
            
            System.out.printf("Informe o Telefone: ");
            Telefone[i] = tecladoNumero.nextLong();
            
            System.out.printf("Informe o seu dia de nascimento: ");
            Dia[i] = tecladoNumero.nextInt();
            
            System.out.printf("Informe o seu mês de nascimento: ");
            Mes[i] = tecladoNumero.nextInt();
            
            System.out.printf("Informe o seu ano de nascimento: ");
            Ano[i] = tecladoNumero.nextInt();
            
        }
        
        //                  1234567890 | 12345678901234567890 | 123456789012 | dd/mm/aaaa | 1234 
        System.out.printf("+-----------+----------------------+--------------+--------------------+-------+\n");
        System.out.printf("|    ID     |         Nome         |   Telefone   | Data de nascimento | Idade |\n");
        System.out.printf("+-----------+----------------------+--------------+--------------------+-------+\n");
        
        for (int i = 0; i < ID.length; i++) {
        
        System.out.printf("|   %10d    |          %-20s       |     %12d     |   %02d/%02d/%04d   | %02d  |\n",
        
            ID[i],
            Nome[i],
            Telefone[i],
            Dia[i],
            Mes[i],
            Ano[i],
            2026 - Ano[i] );
            
   
        }
        
        }
    }


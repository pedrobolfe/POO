/*
Classe impressão de texto: "Main.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

import java.util.Scanner;

public class Main {//inicio da classe Atv02
    public static void main(String[] args) {//inicio do método main
        int  A, B, C; //declaração das variáveis A, B e C como inteiro

        Scanner leitor = new Scanner(System.in);    // declaração da variavel que armazena a entrada de dados

        System.out.print("Informe um inteiro: ");   //mensagem de comando 
        B = leitor.nextInt();    //variavel onde a resposta do comando deve ser armazenada

        leitor.close();  //fecha a variavel de armazenamento de dados
        
        C = 9; //iniciando a variável C
        
        A = B * C; // produto de B e C armazenados na variável A
        
        System.out.print("O produto de A por B: " + B + " e por C: " + C + " é igual a: " + A);//mostra na tela o resultado 
    } //fim do método main
}//fim da classe Atv02 
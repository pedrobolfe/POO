# Atividade 01

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

```
/*
Classe impressão de texto: "Main.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

/*Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos.
Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.
*/

import java.util.Scanner;
// Declaracao da classe Main
public class Soma
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    double soma = 0; // declarando e inicializando soma como 0
	    double x = 1; // // declarando e inicializando x como 1
	    
	    Scanner leitor = new Scanner(System.in); // scanner para armazenar as entradas
	    while (x != 0){ // loop while enquanto x for diferente de 0
	        try { // try para desconsiderar erros
    	        	System.out.print("(digite um numero, 0 para parar).:"); // print 
    	        	x = leitor.nextDouble(); // x vai para o proximo valor do leitor
    	        	soma+=x; // soma recebe x
	        } catch (Exception e) {	
                	leitor.nextLine(); // leitor pula para a proxima string
                	continue; 
            	}
	    }
	    System.out.println("A soma e: " + soma);
	}// fim do método main
}// fim da classe Main

/*
Classe impressão de texto: "Prova.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

/*
a) Exiba os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada, mas não foi inicializada. Exiba apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o método System.out.println () para exibir o caractere de nova linha, e utilize o método System.out.print ('\t') para exibir o caractere de tabulação.]

b) Repita a parte (a) utilizando uma instrução for
*/ 

// Declaracao da classe Main
public class Prova
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    // Usando while
        System.out.println("-------------------------------------------------");
        System.out.println("Usando laço while");
        int i; // declarando uma variavel inteira "i"
        i = 0;  // inicializando i

        while(i < 20){  // enquanto i for menor que 20
            i++;    // somando 1 a cada repetição do while
            if (i%5 == 0){  // se i for multiplo de 5
                System.out.println(i); // printa i e pula uma linha
            }
            else{ // se i nao for multiplo de 5
                System.out.print(i + "\t"); // faz um print de i e faz tabulação  
            }
        }
        // Usando for
        System.out.println("-------------------------------------------------");
        System.out.println("Usando laço for"); 
        
        for (var x= 1; x <= 20; x++){ // declarando e inicializando uma var x; verificando se é menor ou igual a 20; incrementando x
            if (x%5 == 0){  // se x for multiplo de 5
                System.out.println(x); // printa x e pula uma linha
            }
            else{ // se i nao for multiplo de 5
                System.out.print(x + "\t"); // faz um print de x e faz tabulação  
            }
        }
   
	}// fim do método main
}// fim da classe Codigo_base

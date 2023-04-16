# Atividade 06

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

/*
Classe impressão de texto: "nome_do_programa.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
import java.util.Scanner;

// Declaracao da classe Main
public class Deposito
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    double dep_mensal;
	    float mont_desejavel;
	
        Scanner leitor = new Scanner(System.in);
        System.out.print("Deposito Mensal: ");

        dep_mensal = leitor.nextDouble(); // dep_mensal vai para o proximo valor do leitor
        System.out.print("Montante Desejavel: ");
        mont_desejavel = leitor.nextFloat();

        int cont = 0; // contador para saber qnts meses serao necessarios
        while (dep_mensal < mont_desejavel) {
            dep_mensal += (dep_mensal * 0.5);
            cont +=1;
        }
        System.out.println("Serao necessarios " + cont + " meses para alcancar o montante desejavel");
	}// fim do método main
}// fim da classe Codigo_base

/*
Classe impressão de texto: "balancotrimestral.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

// Declaracao da classe Main
public class BalancoTrimestral
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    double gastosJaneiro = 30000.00;    // declarando e iniciando a var gastos de janeiro 
        double gastosFevereiro = 33030.77;  // declarando e iniciando a var gastos de fevereiro 
        double gastosMarco = 23899.01;     // declarando e iniciando a var gastos de marco 

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // somando todos os gastos

        System.out.println(gastosTrimestre);    // print de todos os gastos 
	}// fim do método main
}// fim da classe Codigo_base

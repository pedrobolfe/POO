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
	    double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        String mediaMensal = "Valor da média mensal = " + gastosTrimestre / 3;

        System.out.println(gastosTrimestre);
        System.out.println(mediaMensal);
	}// fim do método main
}// fim da classe Codigo_base

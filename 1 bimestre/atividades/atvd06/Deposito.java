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
	    double dep_mensal;  //declarando a  var dep_mensal que e o deposito mensal
	    float mont_desejavel; // declarando a var mont_desejavel que e o montante desejavel
	
        Scanner leitor = new Scanner(System.in);    // scanner leitor para a entrada de dados

        System.out.print("Deposito Mensal: "); // print para pedir o dep_mensal
        dep_mensal = leitor.nextDouble(); // dep_mensal pega primeiro valor do leitor

        System.out.print("Montante Desejavel: "); // print para pedir o montante desejavel
        mont_desejavel = leitor.nextFloat(); // montante desejavelpega o proximo valor do leitor

        int cont = 0; // contador para saber qnts meses serao necessarios
        while (dep_mensal < mont_desejavel) { // inicio do loop while ate o deposito mensal ser maior que o montante desejavel
            dep_mensal += (dep_mensal * 0.5); // calculando o juros
            cont +=1; // aumentando o contador para calcular os meses
        } // fim loop while
        System.out.println("Serao necessarios " + cont + " meses para alcancar o montante desejavel"); // saida de dados para informar a qnt de meses necessarios
	}// fim do método main
}// fim da classe Codigo_base

/*
Classe impressão de texto: "Main.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
import java.util.Scanner;
import java.util.Arrays;

// Declaracao da classe Main
public class Main
{// Início da classe Main
    
	final static boolean classes[] = new boolean[10]; // declaração e inicialização de um array para a primeira classe
	// Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    // Codigo
		int tipo_classe; // declaração de uma var do tipo inteiro
		Scanner leitor = new Scanner(System.in);    // declaração da variavel que armazena a entrada de dados
		
		for (int m=0;m<10;m++){ // laço for para pedir as passagens 
			System.out.print("Digite 1 para Primeira Classe e digite 2 para Classe Econômica: "); // print para pedir um numero
			tipo_classe = leitor.nextInt();// usando o metodo nextInt para "pegar" o proximo inteiro do user
			verifica(tipo_classe); // chamando uma 
		}
		
		System.out.println("Primeira Classe: ");
		for (int j = 0; j < 10; j++){
			System.out.print(classes[j] + "; ");
			if (j == 4){
				System.out.println("\nClasse Economica:");
			}
			// System.out.print(classes[j] + "; ");
		}
		
		System.out.println("\nPrograma finalizado");
	}// fim do método main

	public static void verifica(int tipo_classe){
		Scanner leitor = new Scanner(System.in);    // declaração da variavel que armazena a entrada de dados
		int i = 0, p = 5;
		String yes_no;

		if (tipo_classe == 1){
			while (i != 10){
				
				if (i == 5 && classes[i] == true){
					System.out.println("Todas as poltronas da primeira classe estão ocupadas, deseja ir para a classe economica?(Y/N). ");
					yes_no = leitor.nextLine();
					if (yes_no == "Y"){
						if (classes[i] != false){
							classes[i] = true;
							System.out.println("======================================================");
							System.out.println(" Seu assento é o número " + (i) + " da classe economica.");
							System.out.println("======================================================");
							break;
						} else {
							continue;
						}
					} else {
						System.out.println("O próximo voo parte em 3 horas.");
						break;
					}
				} else if (classes[i] == false){
					System.out.println("======================================================");
					System.out.println(" Seu assento é o número " + (i) + " da primeira classe.");
					System.out.println("======================================================");
					classes[i] = true;
					
					break;
				} else {
					i++;
				}
			}
		}
		if (tipo_classe == 2){
			while (p != 10){
				if (p == 10 && classes[10] == true){
					System.out.println("Todas as poltronas da classe economica estão ocupadas, deseja ir para a primeira classe?(Y/N). ");
					yes_no = leitor.nextLine();
					if (yes_no == "Y"){
						if (classes[p] != false){
							classes[p] = true;
							System.out.println("======================================================");
							System.out.println(" Seu assento é o número " + (p) + " da primeira classe.");
							System.out.println("======================================================");
							break;
						} else {
							continue;
						}
					} else {
						System.out.println("O próximo voo parte em 3 horas.");
						break;
					}
				}
				if (classes[p] == false){
					classes[p] = true;
					System.out.println("======================================================");
					System.out.println(" Seu assento é o número " + (p) + " da classe economica.");
					System.out.println("======================================================");
					System.out.println("========== " + classes[p] + " === " + p+ "   ===================");
					break;
				} else {
					p++;
				}
			}
		}
	}			
}// fim da classe Main

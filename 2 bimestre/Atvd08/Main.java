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
		
		System.out.println("Primeira Classe: "); // saida de dados
		for (int j = 0; j < 10; j++){ // inicio for
			System.out.print(classes[j] + "; "); // mostrando as poltronas disponiveis e ocupadas
			if (j == 4){
				System.out.println("\nClasse Economica:"); // saida de dados
			} // fim if 
		} // fim for
		
		System.out.println("\nPrograma finalizado"); // fim do programa, exibindo essa msg
	}// fim do método main

	public static void verifica(int tipo_classe){
		Scanner leitor = new Scanner(System.in);    // declaração da variavel que armazena a entrada de dados
		int i = 0, p = 5; // declarando e inicializando dois contadores
		String yes_no; // declaração de uma variavel para saber a resposta do cliente

		if (tipo_classe == 1){ // inicio if
			while (i != 10){ // começo while
				if (i == 6){ // inicio if
					System.out.println("Todas as poltronas da primeira classe estão ocupadas, deseja ir para a classe economica?(Y/N). "); // exibindo essa msg
					yes_no = leitor.nextLine();
					if (yes_no == "Y"){ // inicio if
						if (classes[i] != false){ // inicio if
							classes[i] = true;
							System.out.println("======================================================"); // mostrando a poltrona e tipo de classe do cliente
							System.out.println(" Seu assento é o número " + (i) + " da classe economica.");
							System.out.println("======================================================");
							break; // fim while
						} else { // fim do if e inicio do else 
							continue; //continua o while
						}
					} else { // fim do if e inicio do else 
						System.out.println("O próximo voo parte em 3 horas.");
						break; // fim whiule
					} // fim do else
				} else if (classes[i] == false){ // compara se a posicao esta livre
					System.out.println("======================================================"); // mostrando a poltrona e tipo de classe do cliente
					System.out.println(" Seu assento é o número " + (i) + " da primeira classe.");
					System.out.println("======================================================");
					classes[i] = true; // deixa a poltona ocupada
					
					break; // fim while
				} else { // fim do if e inicio do else 
					i++; // incrementando 1 no contador
				} // fim do else
			} // fim laço while
		}
		if (tipo_classe == 2){ // inicio if
			while (p != 11){ // inicio laço while
				if (p == 10){ // inicio if
					System.out.println("Todas as poltronas da classe economica estão ocupadas, deseja ir para a primeira classe?(Y/N). "); // exibindo essa msg
					yes_no = leitor.nextLine(); // pegando a resposta do cliente
					if (yes_no == "Y"){ // inicio if
						if (classes[p] != false){ // inicio if
							classes[p] = true; // array na p cira true, deixando a poltrona indisponivel
							System.out.println("======================================================"); // mostrando a poltrona e tipo de classe do cliente
							System.out.println(" Seu assento é o número " + (p) + " da primeira classe.");
							System.out.println("======================================================");
							break; // fim laço while 
						} else { // fim do if e inicio do else 
							continue; // continua o whiule
						} // fim while
					} else { // fim do if e inicio do else 
						System.out.println("O próximo voo parte em 3 horas."); // informa o voo
						break; // fim laço while
					} // fim while
				} // fim do if
				if (classes[p] == false){ // compara se a posicao esta livre
					classes[p] = true; // array na p fica true, deixa a poltrona indisponivel
					System.out.println("======================================================"); // mostrando a poltrona e tipo de classe
					System.out.println(" Seu assento é o número " + (p) + " da classe economica.");
					System.out.println("======================================================");
					// System.out.println("========== " + classes[p] + " === " + p+ "   ===================");
					break; // fim laço while
				} else { // fim else
					p++; // incrementando o contador +1
				} // fim else
			} // fim while
		}// fim if
	} // do metodo verifica			
}// fim da classe Main

# Atividade 08

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).
O sistema deve exibir as seguintes alternativas: 

- Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica .  Se o usuário digitar 1, o sistema deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, o sistema deve atribuir um assento na classe econômica (poltronas 6 a 10). 

- O sistema deve ainda exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

- Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 

- Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. 

- À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

- O sistema nunca deve atribuir uma poltrona que já foi reservada. 

- Quando a classe econômica estiver lotada, o sistema deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "O próximo voo parte em 3 horas".

- O link para acesso ao notebook desta atividade já está disponível na raiz do repositório da disciplina no GitHub (bellincanta/2023INT-POO).

```


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

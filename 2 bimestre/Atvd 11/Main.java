/*
Classe impressão de texto: "Main.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

// Declaracao da classe Main
public class Main
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	      Emprestimo E1 = new Emprestimo(); //objeto Emprestimo, chamado E1
        Emprestimo E2 = new Emprestimo(); //objeto Emprestimo, chamado E2

        E1.valorTotal = 1000.00; // atribuindo valor ao valorTotal do objeto E1
        E1.taxaJuros = 2.00; // atribuindo valor a taxaJuros do objeto E1
        E1.numeroParcelas = 4; // atribuindo valor ao numero de Parcelas do objeto E1
        
        E2.valorTotal = 20000.00; // atribuindo valor ao valorTotal do objeto E2
        E2.taxaJuros = 5.00; // atribuindo valor a taxaJuros do objeto E2
        E2.numeroParcelas = 16; // atribuindo valor ao numero de Parcelas do objeto E2

        // declara var double para as parcelas dos emprestimos
        double proximaParcelaE1; 
        double proximaParcelaE2;

        while(proximaParcelaE1 > 0 && proximaParcelaE2 > 0){ // loop while os objetos do emprestimo forem maior que 0, se for -1 e pq acabou as parcelas
            proximaParcelaE1 = E1.proximaParcela();
            proximaParcelaE2 = E2.proximaParcela();

            System.out.println("Empresimo 1 = " + proximaParcelaE1 + "\t || Emprestimo 2 = " + proximaParcelaE2); // exibe em paralelo as parcelas dos emprestimos
        } // fim loop while
	}// fim do método main
}// fim da classe Main

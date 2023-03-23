/*
Classe impressão de texto: "nome_do_programa.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/


import java.io.IOException; // importacao da classe para tratar erro

// Declaracao da classe Main
public class EntradaNaoFormatada
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args) throws IOException { // clausula throws permite que um erro seja descartado, mesmo que ele ocorra e inicio do metodo main
        System.out.println("Entrada Nao Formaada!");    // mensagem inicial
        System.out.println("Pressione um caracter:");   // mensagem de orientacao
        int i = System.in.read();   // le um caracter como inteiro
        System.out.println("ASCII = " + i); // exibe o valor lido
        }// fim do método main
}// fim da classe PrimeiroProgramaJava
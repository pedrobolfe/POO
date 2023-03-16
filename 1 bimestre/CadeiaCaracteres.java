/*
Classe impressão de texto: "CadeiaCaracteres.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

// Declaracao da classe Main
public class CadeiaCaracteres
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    String nome = "Pedro", 
            sobrenome = "Schroeder"; // o java" so ve q um comando terminou quando aparece ';'

        String nome_complemento = nome + sobrenome;

        System.out.println("Nome complemento: " + nome_complemento); // '+' serve para concatenar
        System.out.println("Tamanho String: " + nome_complemento.length());// length serve para calcular o tamanho da string
        System.out.println("Igual a Pedro 2: " + nome_complemento.equals("Pedro 2")); // equals e tipo o == do python
        system.out.println("Igual a PEDRO SCHROEDER: " + nome_complemento.equalsIgnoreCase("PEDRO SCHROEDER"));
            
	}// fim do método main
}// fim da classe PrimeiroProgramaJava
/*
Classe impressão de texto: "Media.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

import javax.swing.JOptionPane;

// Declaracao da classe Main
public class MediasNotas{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    String aux; // declarando uma var auxiliar
	    float nota1, nota2, notaTrab; // declarando as variaveis para armazenar as notas
		// Usando a classe JOptionPane para entrada de dados, receba a nota de duas provas e de um trabalho.
	    aux = JOptionPane.showInputDialog("Digite a nota da primeira prova: "); 
	    nota1 = Float.parseFloat(aux); 
        
	    aux = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
        nota2 = Float.parseFloat(aux);
	        
	    aux = JOptionPane.showInputDialog("Digite a nota do trabalho: "); 
	    notaTrab = Float.parseFloat(aux);   

	    double media = ((nota1 + nota2 + notaTrab)/3);	// calculando a media das notas 
	    JOptionPane.showMessageDialog(null, "Media = " + media); //Mostrando a média usando o showMessageDialog da classe JOptionPane

	}// fim do método main
}// fim da classe Codigo_base

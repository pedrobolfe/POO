/*
Classe impressão de texto: "Media.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

import javax.swing.JOptionPane;

// Declaracao da classe Media
public class Media
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    String aux;
	    float nota1, nota2, notaTrab;
	    try {
	        aux = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
	        nota1 = Float.parseFloat(aux);
	        
	        aux = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
	        nota2 = Float.parseFloat(aux);
	        
	        aux = JOptionPane.showInputDialog("Digite a nota do trabalho: ");
	        notaTrab = Float.parseFloat(aux);
	        
	        
	        double media = ((nota1 + nota2 + notaTrab)/3);
	        JOptionPane.showMessageDialog(null, "Media = " + media);
	    } catch (NumberFormatException erro){
	        JOptionPane.showMessageDialog(null, "erro na conversao, digite apenas numeros" + erro.toString());
	    }
	    System.exit(0);
	    
	}// fim do método main
}// fim da classe Codigo_base


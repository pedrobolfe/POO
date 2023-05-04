# Atividade 07

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array
            de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média
            aritmética das notas.
```
/*
Classe impressão de texto: "Notas.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

import javax.swing.JOptionPane;

public class Notas{  // Início da classe Notas
	public static void main(String[] args) {
        Float media = 0f; // uma variavel para calcular a media
		String aux; // variavel auxliar
        int notas[] = new int[5]; // declaração e alocação de um array
        String notas_ordem = "";
        
        for (int i = 0; i < 5; i++){ // inicio do loop for, usando loop for para repetir 5 vezes a classe JOptionPane para pedir as notas da prova
            aux = JOptionPane.showInputDialog("Entre com a nota da " + (i+1) + " prova:"); // caixas de dialogo para pedir as notas
            //conversao dos dados para float e armazenando o dado no vetor
            notas[i] = Integer.parseInt(aux); // inserindo as notas em um uma lista
            media += notas[i];  // media vai receber a soma da nota de todas as provas
        } //fim do loop for 

        // Deixando o array das notas em ordem decrescente
        for (int i = 1; i < notas.length; i++) { // inicio lop for
            for (int j = 0; j < i; j++) {
                if (notas[i] > notas[j]) {
                    int tmp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tmp;
                }
            }
        } // fim loop for

        for (int num : notas) { // inicio do loop for 
			notas_ordem += num + "; ";  // colocando na string o numero e mais um ";" para "separar" os numeros
		} // fim do loop for

        JOptionPane.showMessageDialog(null, "Notas = " + notas_ordem); // exibindo as notas em ordem decrescente em um caixa de dialogo usando a classe JOptionPane 
        JOptionPane.showMessageDialog(null, "Media = " + media/5); // exibindo a media das notas em uma caixa de dialogo usando a classe JOptionPane 
	}// fim do método main
}// fim da classe Notas

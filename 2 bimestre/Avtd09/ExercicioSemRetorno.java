/*
Classe impressão de texto: "ExercicioSemRetorno.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

import java.util.ArrayList;

//inicio da classe ExercicioSemRetorno
public class ExercicioSemRetorno{  
    // inicio do método imprimirNumeros
    public void imprimirNumeros(int[] list_elem){ // inicializando um array com parametro do método
        String aux = ""; // criando e inicializando uma var auxiliar

        for (int i : list_elem){ // i ira percorrer o array list_elem
            aux += i + " "; // adicionando a var aux o elemento i + um espaco " " 
        } //fim loop for

        System.out.println(aux); // exibindo os elementos da lista separados por " "
    } //fim do método imprimirNumeros

    //inicio do método somaNumeros
    public void somaNumeros(int[] list_elem){ //inicializando os parametros do método
        int soma = 0; // var para receber a soma do array

        for (int i : list_elem) { // i ira percorrer o array list_elem
            soma += i; // soma ira receber i
        }//fim do loop for
        
        System.out.println(soma); // exibe a soma de todos elementos do array
    }//fim do método somaNumeros

    public static void main(String [] args) { //incio do método main
        ExercicioSemRetorno x = new ExercicioSemRetorno();

        int[] numeros = {12, 3, 16, 1, 23, 45, 7, 19, 18, 31}; // criando e inicializando um array com 10 elementos

        x.imprimirNumeros(numeros);   //chama o método imprimirNumeros e utiliza o array como parametro
        x.somaNumeros(numeros); //chama o método somaNumeros e utiliza o array como parametro

    }//fim do método main
} //fim da classe ExercicioSemRetorno

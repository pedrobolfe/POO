# Atividade 09

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta:
Você foi contratado para desenvolver um programa em Java que realiza operações com números inteiros. Para isso, você precisa implementar métodos sem retorno que executam tarefas específicas. 

Implemente o método imprimirNumeros, que recebe um array com 10 inteiros como parâmetro e exibe os números na tela, separados por um espaço. O método não deve retornar nenhum valor.

Implemente o método somaNumeros, que recebe um array com 10 inteiros como parâmetro, calcula a soma de todos os números do array e exibe o resultado na tela. O método não deve retornar nenhum valor 

No método main, um array de números inteiros é criado e inicializado. Você deve chamar o método imprimirNumeros passando o array como argumento. Em seguida, chame o método somaNumeros para calcular a soma dos números e exibir o resultado. Por fim, chame novamente o método imprimirNumeros para exibir o array atualizado após a soma.

Observações:
* Os métodos imprimirNumeros e somaNumeros devem ser implementados dentro da classe ExercicioSemRetorno.

* Utilize estruturas de repetição e operações matemáticas para calcular a soma dos números.

```
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
    public void imprimirNumeros(int[] list_elem1){ // inicializando um array com parametro do método
        String aux = ""; // criando e inicializando uma var auxiliar

        for (int i : list_elem1){ // i ira percorrer o array list_elem
            aux += i + " "; // adicionando a var aux o elemento i + um espaco " " 
        } //fim loop for

        System.out.println(aux); // exibindo os elementos da lista separados por " "
    } //fim do método imprimirNumeros

    //inicio do método somaNumeros:::: 
    public void somaNumeros(int[] list_elem1, int[] list_elem2){ //inicializando os parametros do método
        // declarando variaveis para 
        int soma = 0; // var para receber a soma do array
        int[] list_elem3 = new int[10]; // criando um array de 10 elementos
        int cont;
        for (int i = 0; i <= 9; i++) { // i ira percorrer o array list_elem
            cont = list_elem1[i] + list_elem2[i]; // fazendo a soma dos array
            soma += cont;// soma ira receber a soma dos elementos
            list_elem3[i] = cont; // colocando em um array a soma dos array
        }//fim do loop for
        
        System.out.println(soma); // exibe a soma de todos elementos do array

        String aux = ""; // criando e inicializando uma var auxiliar
        for (int i : list_elem3){ // i ira percorrer o array list_elem
            aux += i + " "; // adicionando a var aux o elemento i + um espaco " " 
        } //fim loop for
        
        imprimirNumeros(list_elem3);   // chama o metodo de imprimir numeros
    }//fim do método somaNumeros

    public static void main(String [] args) { //incio do método main
        ExercicioSemRetorno x = new ExercicioSemRetorno();

        int[] a = {12, 3, 16, 1, 23, 45, 7, 19, 18, 31}; // criando e inicializando um array com 10 elementos
        int[] b = {65, 13, 1, 8, 12, 9, 23, 2, 15, 6}; // criando e inicializando um array com com 10 elementos

        x.imprimirNumeros(a);   //chama o método imprimirNumeros e utiliza o array como parametro
        x.somaNumeros(a, b); //chama o método somaNumeros e utiliza o array como parametro
    }//fim do método main
} //fim da classe ExercicioSemRetorno

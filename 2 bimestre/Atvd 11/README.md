# Atividade 11

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta:
Você foi contratado para desenvolver um programa que gerencie empréstimos financeiros. Sua tarefa é implementar a classe Emprestimo em Java, que representa cada empréstimo realizado. Cada objeto da classe Emprestimo será responsável por calcular e armazenar as parcelas correspondentes ao empréstimo.

A classe Emprestimo deve ser construída com os seguintes atributos: valorTotal (representando o valor total do empréstimo), taxaJuros (indicando o percentual de juros mensal) e numeroParcelas (representando a quantidade de parcelas do empréstimo).

Além disso, a classe deve possuir um método chamado proximaParcela(), que não recebe parâmetros e retorna o valor da próxima parcela a ser paga. Cada vez que esse método é invocado, ele deve retornar o valor correspondente à próxima parcela. Caso não haja mais parcelas a serem pagas, o método deve retornar -1.

Seu programa deve criar dois objetos Emprestimo, chamados E1 e E2, com valores diferentes para valorTotal, taxaJuros e numeroParcelas. Após a criação dos objetos, seu programa deve exibir as parcelas dos empréstimos em paralelo, ou seja, a primeira parcela de E1 deve ser exibida junto com a primeira parcela de E2, a segunda parcela de E1 com a segunda parcela de E2 e assim por diante. O programa deve continuar exibindo as parcelas enquanto houver parcelas restantes em pelo menos um dos empréstimos.

Você deve implementar a solução em Java, criando a classe Emprestimo com o construtor e o método descritos, além de utilizar um loop e as chamadas adequadas para exibir as parcelas dos empréstimos em paralelo.

Emprestimo.java
```
/*
Classe impressão de texto: "Emprestimo.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

public class Emprestimo{ // inicio classe Emprestimo
    public double valorTotal; // atributo publico do valor total a pagar
    public double taxaJuros; // atributo publico da taxa de juros
    public int numeroParcelas; // atributo publico de numero de parcelas

    public double proximaParcela(){ // inicio metodo proximaParcela 
        if (numeroParcelas > 0){ // se o numero de parcelas for maior de zero o programa ira calcular o valor das parcelas com juros e retornar o valor
            double valParcela = (valorTotal * taxaJuros) / numeroParcelas; // calcular o valor das parcelas com juros
            double val = (valorTotal/numeroParcelas) + valParcela; // calcular o valor para pagar em cada parcela

            numeroParcelas--; // diminui uma parcela
            return val; // retorna o valor a pagar da parcela
        } else { // inicio else
            return -1; // retorna -1 caso o numero de parcelas for 0
        } // fim else
    } // fim metodo proximaParcela
} // fim classe Emprestimo

```


Main.java
```

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
        E2.taxaJuros = 5.00; // atribuindo valor a taxaJuros do objeto E1
        E2.numeroParcelas = 16; // atribuindo valor ao numero de Parcelas do objeto E1

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

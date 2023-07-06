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

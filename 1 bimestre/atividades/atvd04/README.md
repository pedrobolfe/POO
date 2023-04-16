# Atividade 04 e 05

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do
primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo os seguintes passos:

a) Crie uma classe chamada BalancoTrimestral com o método main;
b) No método principal, declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro;
c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;
e) Exiba a variável gastosTrimestre.

```
/*
Classe impressão de texto: "balancotrimestral.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

// Declaracao da classe Main
public class BalancoTrimestral
{// Início da classe Main
    // Declaracao do método main que inicia a execução do programa
	public static void main(String[] args){// início do método main
	    double gastosJaneiro = 30000.00;    // declarando e iniciando a var gastos de janeiro 
        double gastosFevereiro = 33030.77;  // declarando e iniciando a var gastos de fevereiro 
        double gastosMarco = 23899.01;     // declarando e iniciando a var gastos de marco 

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // somando todos os gastos

        String mediaMensal = "Valor da média mensal = " + gastosTrimestre / 3; // calculando a media dos gastos mensais

        System.out.println(gastosTrimestre);    // print de todos os gastos 
        System.out.println(mediaMensal); // print da media dos gastos mensais
	}// fim do método main
}// fim da classe Codigo_base

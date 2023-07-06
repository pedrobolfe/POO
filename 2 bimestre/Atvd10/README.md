# Atividade 10

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta: 
- Crie uma classe chamada "Pessoa" com os seguintes atributos privados: "nome" (do tipo String), "idade" (do tipo int) e "altura" (do tipo double). Em seguida, implemente métodos públicos para acessar e modificar esses atributos, respeitando o princípio de encapsulamento.

- Crie uma classe para testar o funcionamento da classe "Pessoa".


Pessoa.java
```
/*
Classe impressão de texto: "Pessoa.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/

private class Pessoa { //inicio da classe Pessoa
    private String nome; // atribui valor de string para nome do tipo private 
    private int idade; // atribui valor de inteiro para idade do tipo private
    private float altura; // atribui valor de float para altura do tipo private
    
    // metodos para acessar e alterar o atributo nome
    public String getNome() { // inicio metodo getNome para acessar o atributo nome
        return nome; // retorna o atributo nome
    } //fim da classe getNome
    
    public void setNome(String nome) { // inicio metodo getNome para altera o valor do atributo nome
        this.nome = nome; // coloca o atributo da classe para receber o valor recebido como parametro
    } //fim da classe setNome
    
    // metodos para acessar e alterar o atributo idade
    public int getIdade() { // inicio metodo  getIdade para acessar o atributo idade
        return idade; // retorna o atributo idade
    } //fim da classe getIdade
    
    public void setIdade(int idade) {  // inicio metodo getIdade para alterar o valor do atributo idade
        this.idade = idade; // coloca o atributo da classe para receber o valor recebido como parametro
    } //fim da classe setIdade
    
    // metodos para acessar e alterar o atributo altura
    public double getAltura() { // inicio metodo getAltura para acessar o atributo altura
        return altura; // retorna o atributo altura
    } //fim da classe getAltura
    
    public void setAltura(double altura) {  // inicio metodo getAltura para altera o valor do atributo altura
        this.altura = altura; // coloca o atributo da classe para receber o valor recebido como parametro
    }//fim da classe setAltura
}//fim da classe Pessoa
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

public class Main{ // inicio da classe Teste
    public static void main(String[] args) { //inicio do método main
        Pessoa pessoa = new Pessoa(); //cria uma nova instancia para a classe
        
        pessoa.setNome("Pdrinho H"); //atribui valor a variavel nome
        pessoa.setIdade(17); //atribui valor a variavel idade
        pessoa.setAltura(1.72); //atribui valor a variavel altura
        
        System.out.println("Nome: " + pessoa.getNome()); //print do nome chamando a classe getNome
        System.out.println("Idade: " + pessoa.getIdade()); //print da idade chamando a classe getIdade
        System.out.println("Altura: " + pessoa.getAltura()); //print da altura chamando a classe getAltura
    }//fim do metodo main
}//fim da classe Main

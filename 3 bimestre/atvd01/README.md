# Atividade 01 do 3 bim

* Aluno: Pedro Henrique Schroeder Bolfe
* Turma: 3° Info 
* Proposta:

1 - Crie as classes Mamíferos e Aves com seus respectivos atributos e métodos;

2 - Crie as classes Cachorros e Pássaros que herdam de Mamíferos e Aves, respectivamente;

3 - Implemente os construtores para cada classe para inicializar os atributos nome e idade;

4 - Crie um método para cada classe que exibe informações específicas do animal;

5 - Crie um programa principal (main) para instanciar objetos das classes Cachorros e Pássaros e teste os métodos implementados.


Arquivo Main.java
```

public class Main { //inicio da classe Main
    public static void main(String[] args) { //inicio do metodo main
        // cachorros
        Cachorro mamifero1 = new Cachorro("doguinho", 4, "viralata"); //adiciona uma nova variavel a superclasse Cachorro
        mamifero1.exibirInformacoes();  //chama o metodo  exibirInformacoes
        mamifero1.emitirSom();  //chama o metodo emitirSom
        mamifero1.mover();  //chama o metodo  mover
        mamifero1.abanarRabo();  //chama o metodo  abanarRabo
        System.out.println(""); //print vazio para pular uma linha

        // passaros
        Passaro ave1 = new Passaro("sebastiao (papagaio)", 7, "verde"); //adiciona uma nova variavel a superclasse Passaro
        ave1.exibirInformacoes(); //chama o metodo exibirInformacoes
        ave1.emitirSom(); //chama o metodo  emitirSom
        ave1.voar(); //chama o metodo  voar
        ave1.construirNinho(); //chama o metodo  construirNinho
        System.out.println(""); //print vazio para pular uma linha

    }//fim do metodo Main
}//fim da classe Main

```

Arquivo Mamiferos.java
```

public class Mamiferos{ //inicio da classe Mamiferos
    public String nome; //cria o atributo publico
    public int idade; //cria o atributo privado: idade

    public Mamiferos(String nome, int idade) { //inicio da superclasse Mamiferos
        this.nome = nome; // referencia o atributo nome fora da superclasse
        this.idade = idade; // referencia o atributo idade fora da superclasse
    } //fim da superclasse Mamiferos

    public void emitirSom() { //inicio do metodo emitirSom
        System.out.println(" 'barulho' "); //print
    } //fim do metodo emitirSom

    public void mover() { //inicio do metodo mover
        System.out.println(nome + " esta se movendo"); //print
    } //fim do metodo mover 

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        // print nome e idade do mamifero
        System.out.println("Nome: " + nome); 
        System.out.println("Idade: " + idade); 
    }//fim do metodo exibirinformaçoes
}//fim da classe Mamiferos

```

Arquivo Ave.java
```

class Ave{ //inicio da classe AVe
    public String nome; //cria o atributo publico
    public int idade; //cria o atributo publico

    public Ave(String nome, int idade) { //inicio da superclasse Aves
        this.nome = nome; //referencia o atributo nome fora da superclasse
        this.idade = idade; //referencia o atributo idade fora da superclasse
    } //fim da superclasse Aves

    public void emitirSom() { //inicio do metodo emitirSom
        System.out.println(" 'barulho' "); //print teste
    }//fim do metodo emitirSom

    public void voar() {//inicio do metodo voar
        System.out.println(nome  + " esta voando"); //print teste
    } //fim do metodo voar

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        System.out.println("Nome: " + nome); //print do nome da ave
        System.out.println("Idade: " + idade); ///print da idade da ave
    }//fim do metodo exibirinformaçoes
    
} //fim da classe Ave
```

Arquivo Cachorro.java
```
class Cachorro extends Mamiferos { //inicio da subclasse cachorro de Mamiferos
    public String raca; //cria a string privada raca

    public Cachorro(String nome, int idade, String raca) { //inicio da subclasse Cachorro
        super(nome, idade);  //acessa nome e idade
        this.raca = raca; //referencia o atributo raca fora da superclasse
    } //fim da subclasse cachorro

    public void abanarRabo() { //inicio do metodo abanarRabo
        System.out.println("dog abanou o rabo"); //print teste
    } //fim do metodo abanarRabo

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        // print das informacoes da classe mamiferos e subclasse dog
        System.out.println("Nome: " + nome + "\n" + "Raça: " + raca + "\n" + "Idade: " + idade);
    }//fim do metodo exibirInformacoes
} //fim da subclasse cachorro

```

Arquivo Passaro.java
```

class Passaro extends Ave { //inicio da subclasse Passaro de Ave
    public String cor; //cria o atributo privado: cor

    public Passaro(String nome, int idade, String cor) { //inicio da superclasse Passaro
        super(nome, idade); //acessa nome e idade
        this.cor = cor; //referencia o atributo cor fora da superclasse
    } // fim da superClasse Passaro

    public void construirNinho() { //inicio do metodo contruirNinho
        System.out.println("Passaro esta construindo seu ninho"); //print
    } //fim do metodo contruirNinho

    public void exibirInformacoes() { //inicio do metodo exibirInformacoes
        // print das informacoes da classe aves e subclasse passaro
        System.out.println("Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Idade: " + idade);
    }// fim do metodo exibirInformacoes
} // fim da subclasse Passaro

```

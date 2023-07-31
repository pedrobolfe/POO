/*
Classe impressão de texto: "Cachorro.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
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

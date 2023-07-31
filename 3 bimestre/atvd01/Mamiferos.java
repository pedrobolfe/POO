public class Mamiferos{ //inicio da classe Mamiferos
    public String nome; //cria o atributo publico
    public int idade; //cria o atributo publico

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

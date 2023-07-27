public class Mamiferos{
    public String nome;
    public int idade;

    //metodo construtor da classe
    public Mamiferos(String nomee, int idade){
        this.nome = nomee;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void emitirSom(){}

    public void mover(){}


}

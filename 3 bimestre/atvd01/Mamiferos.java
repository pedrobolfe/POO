public class Mamiferos{
    private String nome;
    private int idade;

    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        // codigo
    }
    public void mover() {
        System.out.println("sla");
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

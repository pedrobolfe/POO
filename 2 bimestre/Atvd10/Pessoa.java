/*
Classe impressão de texto: "Main.java"
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

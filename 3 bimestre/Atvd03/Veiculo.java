/*
Classe impressão de texto: "Veiculo.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
public class Veiculo { // inicio classe Veiculo
    // declarando os atributos privados da classe Veiculo
    private String marca; 
    private String modelo;
    private int ano;
    
    // Metodo Construtor
    public Veiculo(String marca, String modelo, int ano) {
        // referenciando os atributos
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // Método getter e setter da Marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método getter e setter do Modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método getter e setter do Ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    // Metodo para exibir detalhes do veiculo
    public void exibirDetalhes() {//inicio metodo exbirDetalhes
        // prints para mostrar os atributos da classe Veiculo
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }// fim metodo exibirDetalhes
}// fim classe Veiculo

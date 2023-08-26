/*
Classe impressão de texto: "Moto.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
public class Moto extends Veiculo {//inicio classe moto herdando os atributos da classe base Veiculo
    // atributo provado da classe Moto
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        // chamando o construtor da Classe base (Veiculo)
        super(marca, modelo, ano);
        //faz referencia ao atributo cilindradas
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {// inicio metodo getCilindradas
        return cilindradas;
    }//fim metodo getCilindradas
    
     @Override
    public void exibirDetalhes() { //incio da classe exibirDetalhes
        super.exibirDetalhes(); // Chama o método da classe base 
        System.out.println("Cilindradas: " + cilindradas); //printa as cilindradas
    } // fim metodo exibirDetalhes
}//fim classe moto

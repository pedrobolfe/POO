public class Carro extends Veiculo { // inicio classe Carro, herdando atributos da classe Veiculo
    // declarando o atributo privado da classe Carro
    private int numeroDePortas;
    
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        // chamando o construtor da Classe base (Veiculo)
        super(marca, modelo, ano); 
        //faz referencia ao atributo numeroDePortas
        this.numeroDePortas = numeroDePortas; 
    }
    
    public int getNumeroDePortas() { // inicio metodo getNumeroPortas
        return numeroDePortas;
    }//fim metodo getNumeroPortas
    
    @Override
    public void exibirDetalhes() { //inicio da metodo exibirDetalhes
        super.exibirDetalhes(); // Chama o método da classe base
        System.out.println("Número de Portas: " + numeroDePortas); // printa o numero de portas
    }// fim metodo exibirDetalhes
}//fim classe Veiculo
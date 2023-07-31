class Cachorro extends Mamiferos {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void abanarRabo() {
        // codigo
    }
    
    public void exibirInformacoes() {
        System.out.println("Raça: " + raca);
    }
}

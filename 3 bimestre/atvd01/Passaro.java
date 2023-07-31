class Passaro extends Ave {
    private String cor;

    public Passaro(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public void construirNinho() {
        // codigo
    }
    
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
    }
}

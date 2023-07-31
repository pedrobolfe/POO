class Passaro extends Ave { //inicio da subclasse Passaro de Ave
    public String cor; //cria o atributo privado: cor

    public Passaro(String nome, int idade, String cor) { //inicio da superclasse Passaro
        super(nome, idade); //acessa nome e idade
        this.cor = cor; //referencia o atributo cor fora da superclasse
    }

    public void construirNinho() { //inicio do metodo contruirNinho
        System.out.println("Passaro esta construindo seu ninho"); //print
    } //fim do metodo contruirNinho

    public void exibirInformacoes() { //inicio do metodo exibirInformacoes
        // print das informacoes da classe aves e subclasse passaro
        System.out.println("Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Idade: " + idade);
    }// fim do metodo exibirInformacoes
} // fim da subclasse Passaro

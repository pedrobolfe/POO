public class Main { //inicio da classe Main
    public static void main(String[] args) { //inicio do metodo main
        // cachorros
        Cachorro mamifero1 = new Cachorro("doguinho", 4, "viralata"); //adiciona uma nova variavel a superclasse Cachorro
        mamifero1.exibirInformacoes();  //chama o metodo  exibirInformacoes
        mamifero1.emitirSom();  //chama o metodo emitirSom
        mamifero1.mover();  //chama o metodo  mover
        mamifero1.abanarRabo();  //chama o metodo  abanarRabo
        System.out.println(""); //print vazio para pular uma linha

        // passaros
        Passaro ave1 = new Passaro("sebastiao (papagaio)", 7, "verde"); //adiciona uma nova variavel a superclasse Passaro
        ave1.exibirInformacoes(); //chama o metodo exibirInformacoes
        ave1.emitirSom(); //chama o metodo  emitirSom
        ave1.voar(); //chama o metodo  voar
        ave1.construirNinho(); //chama o metodo  construirNinho
        System.out.println(""); //print vazio para pular uma linha

    }//fim do metodo Main
}//fim da classe Main

/*
Classe impressão de texto: "TesteVeiculos.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluno: Pedro Henrique Schroeder Bolfe
*/
public class TesteVeiculos {// inicio da classe testeVeiculos
    public static void main(String[] args) { // inicio matodo main
        Carro carro = new Carro("Volkswagen", "Fusca", 1998, 2); //cria as novas instancias da classe Carro
        carro.exibirDetalhes();// chamando o metodo exibirdetalhes para mostrar os atributos da classe Veiculo

        Carro carro2 = new Carro("Porsche", "Taycan", 2023, 4); //cria as novas instancias da classe Carro
        carro2.exibirDetalhes();// chamando o metodo exibirdetalhes para mostrar os atributos da classe Veiculo
        
        Moto moto = new Moto("BMW", "R 1200 GS", 2019, 1170);//cria as novas instancias da classe Moto
        moto.exibirDetalhes();// chamando o metodo exibirdetalhes para mostrar os atributos da classe Veiculo

        Moto moto2 = new Moto("Honda", "CB 500F", 2020, 500);//cria as novas instancias da classe Moto
        moto2.exibirDetalhes();// chamando o metodo exibirdetalhes para mostrar os atributos da classe Veiculo
    }//fim do metodo main
}//fim da classe TesteVeiculos

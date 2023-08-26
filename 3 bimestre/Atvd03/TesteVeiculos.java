public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Fusca", 1998, 2);
    
        carro.exibirDetalhes();

        Carro carro2 = new Carro("Porsche", "Taycan", 2023, 4);
        carro2.exibirDetalhes();
        
        Moto moto = new Moto("BMW", "R 1200 GS", 2019, 1170);
        moto.exibirDetalhes();

        Moto moto2 = new Moto("Honda", "CB 500F", 2020, 500);
        moto2.exibirDetalhes();
    }
}
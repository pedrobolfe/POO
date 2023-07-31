import Mamiferos.Cachorro;
import Ave.Passaro;

public class Main {
    public static void main(String[] args) {
        // cachorros
        Cachorro cachorro1 = new Cachorro("doguin", 5, "vira-lata");
        cachorro1.emitirSom();
        cachorro1.mover();
        cachorro1.abanarRabo();
        cachorro1.exibirInformacoes();
        System.out.println('');

        // passaros
        Passaro passaro1 = new Passaro("sebastião", 3, "papaguaio");
        passaro1.emitirSom();
        passaro1.voar();
        passaro1.construirNinho();
        passaro1.exibirInformacoes();
        System.out.println('');
    }
}

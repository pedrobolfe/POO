import mamiferos.Cachorros;
import aves.Passaros;

public class Main {
    public static void main(String[] args) {
        // cachorros
        Cachorros cachorro1 = new Cachorros("doguin", 5, "vira-lata");
        cachorro1.emitirSom();
        cachorro1.mover();
        cachorro1.abanarRabo();
        cachorro1.exibirInformacoes();
        System.out.println('');

        // passaros
        Passaros passaro1 = new Passaros("sebastião", 3, "papaguaio");
        passaro1.emitirSom();
        passaro1.voar();
        passaro1.construirNinho();
        passaro1.exibirInformacoes();
        System.out.println('');
    }
}

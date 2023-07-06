public class Emprestimo{
    public double valorTotal;
    public double taxaJuros;
    public int numeroParcelas;


    public double proximaParcela(){
        if (numeroParcelas > 0){
            double valParcela = valorTotal / numeroParcelas; // valor das parcelas
            double val = valParcela + (valParcela*taxaJuros);

            numeroParcelas--;
            return val;
        } else {
            return -1;
        }
    }
}

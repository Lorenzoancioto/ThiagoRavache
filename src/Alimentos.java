public class Alimentos extends Produto{

    public Alimentos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        double descontoFinal = porcentagem < 10 ? 10 : porcentagem;
        return preco - (preco * descontoFinal/100);
    }
}

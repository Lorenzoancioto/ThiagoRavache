public class Eletrodomesticos extends Produto{

    public Eletrodomesticos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        double descontoFinal = porcentagem < 15 ? 15 : porcentagem;
        return preco - (preco * descontoFinal/100);
    }
}

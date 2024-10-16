public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        carro.acelerar();
        carro.frear();

        moto.frear();
        moto.acelerar();
        moto.cair();
    }
}

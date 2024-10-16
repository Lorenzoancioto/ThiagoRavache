class Moto implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Acelerando a moto");
    }

    @Override
    public void frear(){
        System.out.println("A moto está freando");
    }

    public void cair(){
        System.out.println("O motoqueiro é burro e bateu a moto");
    }

}

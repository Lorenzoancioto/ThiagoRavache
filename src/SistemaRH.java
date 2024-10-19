public class SistemaRH {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("joao", 17);
        Gerente gerente = new Gerente( "Lorenzo", 2500);

        System.out.println(gerente.calcularSalario());
        System.out.println(gerente.descreverResponsabilidades());

        System.out.println(dev.calcularSalario());
        System.out.println(dev.descreverResponsabilidades());
    }
}

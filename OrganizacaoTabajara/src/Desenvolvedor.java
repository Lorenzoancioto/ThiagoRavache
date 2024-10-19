public class Desenvolvedor extends Funcionario{

    protected int salario;
    public Desenvolvedor(String nome, int salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularSalario(){
        return salario;
    }

    @Override
    public String descreverResponsabilidades(){
        return  " O desenvolvedor " + this.nome + " possui as seguintes resposabilidades: desenvolver os software's dos projetos da empresa ";
    }
}

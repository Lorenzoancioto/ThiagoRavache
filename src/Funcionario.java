abstract class Funcionario implements IFuncionario{
     protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

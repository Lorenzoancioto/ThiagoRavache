public class Main {
    public static void main(String[] args) {
        FuncionarioAdm gerente = new Gerente();
        gerente.gerenciarEquipes();

        FuncionarioOperacional operario = new Operario();
        operario.realizarAtividade();
    }
}

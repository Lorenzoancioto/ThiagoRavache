public class Main{
    public static void main(String[] args) {
        Livro livro = new Livro("Java para iniciantes", "Jose da Silva");
        RepositorioLivro repositorio = new RepositorioLivro();
        repositorio.salvar(livro);
    }
}

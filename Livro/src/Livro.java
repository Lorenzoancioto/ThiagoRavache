public class Livro {
    private String titulo;
    private String autor;
    public Livro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
}

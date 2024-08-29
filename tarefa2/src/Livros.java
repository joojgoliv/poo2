
public class Livros {
    private String titulo;
    private String autor;
    private int ano;
    public Livros (String t, String aut, int a) {
        titulo = t;
        autor = aut;
        ano = a;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + "Ano: "+ano+ "\n";
    }

}
public class Video {
    private String titulo;
    private String autor;
    private String genero;
    private int duracao;
    private int ano;

    public Video (String t, String o, String gen, int dur, int a) {
        titulo = t;
        autor = o;
        genero = gen;
        duracao = dur;
        ano = a;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero + ", Duração: " + duracao + ", Ano: " + ano +"\n";
    }
}

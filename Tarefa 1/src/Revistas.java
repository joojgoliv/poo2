
class Revistas {
    private String titulo;
    private String org;
    private int vol;
    private int nro;
    private int ano;

    public Revistas (String t, String o, int v, int n, int a) {
        titulo = t;
        org = o;
        vol = v;
        nro = n;
        ano = a;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + org + ", Volume" + vol + ", Nro:" + nro + "Ano: "+ano+ "\n";
    }
}
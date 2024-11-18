public class Livro {
    private String titulo;
    private int anoPublicacao;
    private String resumoDaObra;

    public Livro(String titulo, int anoPublicacao, String resumoDaObra) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.resumoDaObra = resumoDaObra;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public int getAnoPublicacaot() {
        return this.anoPublicacao;
    }
    public String getResumoDaObra() {
        return this.resumoDaObra;
    }


}

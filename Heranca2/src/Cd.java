
public class Cd extends Titulo {

    //título, ano, tempo de duração, comentários, artista e quantidade de faixas;
    private double duracao;
    private String comentarios, artista;
    private int qtdFaixas;

    public Cd(String nome, int ano, String artista, int qtdFaixas, double duracao, String comentarios) {
        super(nome, ano);
        this.duracao = duracao;
        this.comentarios = comentarios;
        this.artista = artista;
        this.qtdFaixas = qtdFaixas;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdFaixas() {
        return qtdFaixas;
    }

    public void setQtdFaixas(int qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }

    /*public String  retornaNome(){
        return getArtista();
    }*/
}

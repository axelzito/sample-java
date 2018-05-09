

public class Jogo extends Titulo {

    // título, ano, tempo de duração, comentários, número de jogadores e plataforma
    private double duracao;
    private String comentarios, plataforma;
    private int numJogadores;

    public Jogo (String nome, int ano, String plataforma, int numJogadores, double duracao, String comentarios) {

        super(nome, ano);
        this.duracao = duracao;
        this.comentarios = comentarios;
        this.plataforma = plataforma;
        this.numJogadores = numJogadores;
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

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public void setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
    }
}



public class Filme extends Titulo {

    //título, ano, tempo de duração, comentários e diretor
    private String comentarios, diretor;
    private double duracao;

    public Filme(String nome, int ano, double duracao, String diretor, String comentarios) {
        super(nome, ano);
        this.comentarios = comentarios;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}

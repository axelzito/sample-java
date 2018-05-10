import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme extends Titulo {

    //título, ano, tempo de duração, comentários e diretor
    private String comentarios, diretor;
    private int duracao;

    //SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");

    public Filme(String nome, int ano, int duracao, String diretor, String comentarios) {
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void mostrarDados() {
        System.out.println("Diretor: " + diretor + " Duração " + duracao + " minutos Comentarios: " + comentarios);
    }
}

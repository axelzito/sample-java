package Zoo;

public class Animal {

    private String nome;
    private int idade;
    private Habilidades som;

    public Animal(String nome, int idade, Habilidades som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Habilidades getSom() {
        return som;
    }

    public void setSom(Habilidades som) {
        this.som = som;
    }

    public void emiteSom(){

    }
}

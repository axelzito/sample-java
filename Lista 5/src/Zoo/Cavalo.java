package Zoo;

public class Cavalo extends Animal {

    private Habilidades corre;

    public Cavalo(String nome, int idade, Habilidades som, Habilidades corre) {
        super(nome, idade, som);
        this.corre = corre;
    }

    public Habilidades getCorre() {
        return corre;
    }

    public void setCorre(Habilidades corre) {
        this.corre = corre;
    }

    public void emiteSom() {
        System.out.println("Iiahiheihirh");
    }
}

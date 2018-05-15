package Zoo;

public class Cachorro extends Animal {

    private Habilidades corre;

    public Cachorro(String nome, int idade, Habilidades som, Habilidades corre) {
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
        System.out.println("Auauau");
    }
}

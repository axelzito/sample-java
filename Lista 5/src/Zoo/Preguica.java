package Zoo;

public class Preguica extends Animal {

    private Habilidades sobeArvore;

    public Preguica(String nome, int idade, Habilidades som) {
        super(nome, idade, som);
    }

    public Preguica(String nome, int idade, Habilidades som, Habilidades sobeArvore) {
        super(nome, idade, som);
        this.sobeArvore = sobeArvore;
    }

    public Habilidades getSobeArvore() {
        return sobeArvore;
    }

    public void setSobeArvore(Habilidades sobeArvore) {
        this.sobeArvore = sobeArvore;
    }

    public void emiteSom() {
        System.out.println("ZzZzzZzzZ...");
    }
}

package Zoo;

public class TesteAnimal {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Luna", 1, Habilidades.emitirSom, Habilidades.correr);
        Cavalo h1 = new Cavalo("Bola de Fogo", 3, Habilidades.emitirSom, Habilidades.correr);
        Preguica p1 = new Preguica("Mayte", 25, Habilidades.emitirSom, Habilidades.subirArvore);

        c1.emiteSom();
        h1.emiteSom();
        p1.emiteSom();

        Veterinario v1 = new Veterinario();

        System.out.println("\nConsultorio Veterinario:");
        v1.examinar(c1);
        v1.examinar(h1);
        v1.examinar(p1);

        Zoologico z1 = new Zoologico();
        Animal[] jaula = new Animal[] {c1, h1, p1};

        System.out.println("\nZoologico:");
        z1.zoo(jaula);
    }
}

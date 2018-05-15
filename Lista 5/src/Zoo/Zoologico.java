package Zoo;

public class Zoologico {

    /*
    Crie uma classe Zoológico, com 10 jaulas (utilize um array). Coloque em cada jaula
um animal diferente. Percorra cada jaula e emita o som. Se o tipo de animal possuir o
comportamento, faça-o correr.
     */

    private Animal[] jaulas;

    public Zoologico(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

    public Animal[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

    public void zoo(Animal[] jaulas){

        for(int i =0; i < jaulas.length; i++){
            if(jaulas[i] instanceof Cachorro){
                jaulas[i].emiteSom();
                System.out.println("movimento: " + Habilidades.correr);
            } else if(jaulas[i] instanceof Cavalo){
                jaulas[i].emiteSom();
                System.out.println("movimento: " + Habilidades.correr);
            } else if(jaulas[i] instanceof Preguica){
                jaulas[i].emiteSom();
                System.out.println("movimento: " + Habilidades.subirArvore);
            }
        }
    }
}

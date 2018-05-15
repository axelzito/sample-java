package Zoo;

public class Veterinario {

    /*
    Implemente uma classe Veterinário que contenha um método examinar() cujo
parâmetro de entrada seja um Zoo.Animal. Quando o animal for examinado ele deve emitir
um som. Passe os 3 animais como parâmetro.
     */

    public void examinar(Animal a){

        if(a instanceof Cachorro){
            System.out.println("Examinando, fale algo animalzinho:");
            a.emiteSom();
        } else if(a instanceof Cavalo){
            System.out.println("Examinando, fale algo animalzinho:");
            a.emiteSom();
        } else if(a instanceof Preguica){
            System.out.println("Examinando, fale algo animalzinho:");
            a.emiteSom();
        }
    }
}

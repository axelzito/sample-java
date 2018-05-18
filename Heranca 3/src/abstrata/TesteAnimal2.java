package abstrata;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class TesteAnimal2 {

    public static void main (String[] args) {

        Animal[] animais = new Animal[15];

        Sapo s1 = new Sapo();
        animais[0] = s1;
        Sapo s2 = new Sapo();
        animais[1] = s2;
        Sapo s3 = new Sapo();
        animais[2] = s3;
        Sapo s4 = new Sapo();
        animais[3] = s4;
        Sapo s5 = new Sapo();
        animais[4] = s5;

        Cachorro c1 = new Cachorro();
        animais[5] = c1;
        Cachorro c2 = new Cachorro();
        animais[6] = c2;
        Cachorro c3 = new Cachorro();
        animais[7] = c3;
        Cachorro c4 = new Cachorro();
        animais[8] = c4;
        Cachorro c5 = new Cachorro();
        animais[9] = c5;

        Boi b1 = new Boi();
        animais[10] = b1;
        Boi b2 = new Boi();
        animais[11] = b2;
        Boi b3 = new Boi();
        animais[12] = b3;
        Boi b4 = new Boi();
        animais[13] = b4;
        Boi b5 = new Boi();
        animais[14] = b5;

        //Animal a = new Animal();

        for (int i=0; i < animais.length; i++){
            System.out.println(animais[i].som());
        }
    }
}

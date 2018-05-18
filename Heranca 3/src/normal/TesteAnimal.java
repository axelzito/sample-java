/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class TesteAnimal {

    /*
    5. Crie uma quinta classe: TestaAnimais. Esta classe deverá conter o código que testa as classes identificadas acima. Quando executada, esta classe deverá:
6.1. Criar um array de 15 componentes. Cada componente do array deverá ser uma referência para um objeto da classe Animal. Entenda objeto da classe Animal como sendo
todo e qualquer objeto que pode se comportar como uma instância desta classe. Por exemplo, toda instância de uma subclasse de Animal pode se comportar como um objeto da classe Animal.
6.2. Crie uma instância de cada um dos animais, ou seja, uma instância de Sapo, uma de Cachorro e outra de Boi. Deposite a referência correspondente em uma posição do array criado
 pelo item anterior. Ou seja, todas as instâncias criadas serão referenciadas, cada uma delas, por um dos componentes do array.
6.3. Crie um laço que percorra os elementos do array e para cada um deles envie a mensagem polimórfica som. Ou seja, cada referência armazenada no array designa um objeto para o qual será
enviada a mensagem som.
     */

    public static void main (String[] args) {

        Animal[] animais = new Animal[15];

        for(int i=0; i<animais.length; i++){
            animais[i] = new Animal();
        }

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

        Animal a = new Animal();

        for (int i=0; i < animais.length; i++){
            System.out.println(a.som() + animais[i].som());
        }
    }
}

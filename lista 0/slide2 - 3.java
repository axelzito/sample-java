import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Criar um programa que leia um valor decimal e retorne esse valor
            arredondado usando os três métodos de arredondamento da classe Math*/

        Scanner leitor = new Scanner(System.in);
        double a;
        a = leitor.nextDouble();
        double resultado = Math.round(a);
        System.out.println(resultado);

        resultado = Math.ceil(a);
        System.out.println(resultado);

        resultado = Math.floor(a);
        System.out.println(resultado);

        //leitor.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Criar um programa que leia 2 valores e mostre a soma, a subtração, a multiplicação
            e a divisão entre eles. (A+B, A-B, A*B, A/B) */

        double res, a, b;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        a = leitor.nextDouble();

        System.out.print("Insira o segundo valor: ");
        b = leitor.nextDouble();

        res = a + b;
        System.out.println("\nA soma de " + a + " e " + b + " é: " + res + ".");

        res = a - b;
        System.out.println("\nA subtração de " + a + " e " + b + " é: " + res + ".");

        res = a * b;
        System.out.println("\nA multiplicação de " + a + " e " + b + " é: " + res + ".");

        res = a / b;
        System.out.println("\nA divisão de " + a + " e " + b + " é: " + res + ".");

        //leitor.close();
    }
}
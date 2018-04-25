import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Criar um programa que leia um número e retorne o seu quadrado e a sua raiz.

        int a;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        a = leitor.nextInt();

        System.out.println("\nO quadrado de " + a + " é: " + Math.pow(a, 2));
        System.out.print("A raiz quadrada de " + a + " é: " + Math.sqrt(a));

        //leitor.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Criar um programa que leia um nome e retorne a quantidade de letras desse nome e o nome em maiúsculo*/

        Scanner leitor = new Scanner(System.in);
        String a;
        System.out.print("Insira uma palavra: ");
        a = leitor.next();

        System.out.println("\nA palavra a tem " + a.length() + " letras.");
        System.out.println("A palavra " + a + " com as todas as letras maiusculas: " + a.toUpperCase() + ".");

        leitor.close();
    }
}
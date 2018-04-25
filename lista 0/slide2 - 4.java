import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Criar um programa que leia dois números e retorne o maior e o menor

        Scanner leitor = new Scanner(System.in);
        double a, b;
        System.out.print("Insira o primeiro numero: ");
        a = leitor.nextDouble();
        System.out.print("Insira o segundo numero: ");
        b = leitor.nextDouble();
        System.out.print("\n");

        if(a>b){
            System.out.print("O numero " + a + " é maior que o " + b + ".");
        } else {
            System.out.print("O numero " + b + " é maior que o " + a + ".");
        }

        //leitor.close();
    }
}
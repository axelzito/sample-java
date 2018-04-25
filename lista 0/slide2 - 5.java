import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Criar um programa que retorne um número aleatório de 0 a 100.

        Random gerador = new Random();

        System.out.println("Um numero inteiro aleatorio entre 0 e 100: " + gerador.nextInt(100));
        System.out.print("Um numero real aleatorio entre 0 e 100: " + gerador.nextDouble() * 90);

        //leitor.close();
    }
}
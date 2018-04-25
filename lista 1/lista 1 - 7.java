import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* Faça um programa que leia um vetor de nove elementos inteiros, calcule e mostre os números
        ímpares e suas respectivas posições. */

        int[] vet = new int[9];
        Random gerador = new Random();

        for (int i = 1; i < 9; i++){
            vet[i] = gerador.nextInt(100);
        }

        System.out.print("Os numeros impares são: ");
        for (int i = 0; i < 9; i++){
            if(vet[i] % 2 != 0) {
                System.out.print(vet[i] + ", ");
            }
        }

        System.out.print("\nSuas respectivas posições são: ");
        for (int i = 0; i < 9; i++){
            if(vet[i] % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
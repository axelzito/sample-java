import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Construa um programa que leia um vetor de nove posições e a partir deste vetor, preencha uma
        matriz 3x3 com os mesmos valores. O preenchimento da matriz deve ser por linha. Ao final, imprima
        o vetor e a matriz gerada. */

        int[] vet = new int[9];
        int[][] mat = new int[3][3];
        Random gerador = new Random();

        for (int i = 0; i < 9; i++) {
            vet[i] = gerador.nextInt(100);
        }

        System.out.print("O vetor é: ");
        for (int i = 0; i < 9; i++) {
            if (i != 8) {
                System.out.print(vet[i] + ", ");
            } else {
                System.out.print(vet[i] + ".");
            }
        }

        System.out.print("\nA matriz gerada pelo vetor será:\n");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                mat[i][j] = vet[3*i + j];
                System.out.print("[" + mat[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }
}
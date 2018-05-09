
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Construa um programa que leia duas matrizes de mesma dimensão, efetue a soma das mesmas e
            imprima a matriz soma no final.*/

        int x = 0, y = 0;

        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira as dimensões das matrizes.\nx: ");
        x = leitor.nextInt();
        System.out.print("y: ");
        y = leitor.nextInt();

        int[][] mat1 = new int[x][y];
        int[][] mat2 = new int[x][y];
        int[][] res = new int[x][y];

        //preenche matriz 1 com aleatorios
        System.out.print("\nMatriz 1:\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat1[i][j] = gerador.nextInt(100);
                System.out.print("[" + mat1[i][j] + "] ");
            }
            System.out.print("\n");
        }

        //preenche matriz 2 com aleatorios
        System.out.print("\nMatriz 2:\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat2[i][j] = gerador.nextInt(100);
                System.out.print("[" + mat2[i][j] + "] ");
            }
            System.out.print("\n");
        }

        //calcula a soma das matriz 1 e 2
        System.out.print("\nA soma das matrizes 1 e 2 será:\n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print("[" + res[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }
}
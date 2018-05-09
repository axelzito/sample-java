
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Elabore um programa que leia uma matriz A de dimensão 5 x 7 de inteiros e verifique qual é seu
        maior elemento e imprima-o juntamente com sua posição na matriz (linha e coluna).*/
        
        Random gerador = new Random();
 
        int[][] mat = new int[5][7];

        //preenche matriz com aleatorios
        System.out.print("\nMatriz:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                mat[i][j] = gerador.nextInt(50);
                System.out.print("[" + mat[i][j] + "] ");
            }
            System.out.print("\n");
        }

        int maior = 0, aux1 = 0, aux2 = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    aux1 = i+1;
                    aux2 = j+1;
                }
            }
        }

        System.out.print("\nO maior elemento é o: " + maior + "\nNa posição: [" + aux1 + "][" + aux2 + "].\n");
    }
}
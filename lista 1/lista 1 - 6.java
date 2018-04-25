import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Construa um programa que gere um vetor de 50 elementos reais, da seguinte forma: a primeira e a
        última posições com o valor 100 e as demais posições do vetor preenchidas com a soma do
        quadrado do índice do elemento anterior e a raiz quadrada do índice do elemento seguinte. Ao final
        imprima o vetor gerado. Os elementos serão: 100, 022 , 123 , 224 ,..., 100. */

        double[] vet = new double[50];

        for (int i = 1; i < 49; i++){
            vet[i] = ((Math.pow(i-1, 2)) + (Math.sqrt(i+1)));
        }

        vet[0] = 100;
        vet[49] = 100;

        for (int i = 0; i < 50; i++){
            if(i != 49) {
                System.out.print(vet[i] + ", ");
            } else {
                System.out.print(vet[i] + ".");
            }
        }
    }
}
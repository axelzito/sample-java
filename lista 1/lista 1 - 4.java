import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        /* A condição física de uma pessoa pode ser medida com base no cálculo do índice de Massa Corporal
        (IMC). O mesmo é calculado dividindo-se o peso desta pessoa pelo quadrado da altura. Escreva um
        programa que leia o peso em kg e a altura de uma pessoa em m, calcule e mostre o IMC.. */

        double peso, altura, imc=0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o seu peso: ");
        peso = leitor.nextDouble();

        System.out.print("Insira a sua altura: ");
        altura = leitor.nextDouble();

        imc = (peso / (Math.pow(altura, 2)));

        System.out.print("O seu IMC é: " + imc);
    }
}
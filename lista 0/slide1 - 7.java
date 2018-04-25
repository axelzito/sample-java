import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        //Criar um programa que calcule a fórmula de bhaskara e retorne X1 e X2;

        int a, b, c;
        double x1 = 0, x2 = 0, delta = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre o valor de a: ");
        a = leitor.nextInt();

        System.out.println("Entre o valor de b: ");
        b = leitor.nextInt();

        System.out.println("Entre o valor de c: ");
        c = leitor.nextInt();

        delta = (b*b) - (4*a*c);
        //System.out.print("delta: " + delta);
        x1 = (((b*(-1))+(Math.sqrt(delta))) / (2*a));
        x2 = (((b*(-1))-(Math.sqrt(delta))) / (2*a));

        System.out.println("O valor de x1 é: " + x1);
        System.out.print("O valor de x2 é: " + x2);
    }
}

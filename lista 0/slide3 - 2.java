import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Calcule a media final seguindo a formula do slide. */

        Scanner leitor = new Scanner(System.in);
        double p1, p2, p3, nt, nf;
        System.out.print("Entre com a nota P1: ");
        p1 = leitor.nextDouble();
        System.out.print("Entre com a nota P2: ");
        p2 = leitor.nextDouble();
        System.out.print("Entre com a nota P3: ");
        p3 = leitor.nextDouble();
        System.out.print("Entre com a nota NT: ");
        nt = leitor.nextDouble();

        nf =  ((((p1*0.2) + (p2*0.3) + (p3*0.5)) * 0.85) + (nt * 0.15));

        System.out.println("\nA nota final é: " + nf);

        leitor.close();
    }
} 
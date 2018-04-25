import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Faça um algoritmo que receba o consumo de energia de uma residencia e o valor do kwh,
        dê o consumo considerando desconto de 10%. */

        Scanner leitor = new Scanner(System.in);
        double consumo, valor, x, y;
        System.out.print("Entre o consumo: ");
        consumo = leitor.nextDouble();
        System.out.print("Entre o valor do kw/h: ");
        valor = leitor.nextDouble();
        x = consumo * valor;
        y = (x * 0.1);
        x = x - y;
        System.out.println("\nO valor da conta de luz com 10% de desconto será: R$ " + x);

        leitor.close();
    }
}
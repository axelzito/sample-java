import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        /* Implemente um programa que realize uma das 4 operaçoes (+), (-), (/) e (*) entre duas variáveis, por
            meio da escolha do usuário. */

        double a, b, res=0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do primeiro numero: ");
        a = leitor.nextDouble();

        System.out.print("Insira o valor do segundo numero: ");
        b = leitor.nextDouble();

        System.out.print("Escolha uma operação matematica:\n+ para soma\n- para subtração\n* para multiplicação\n/ para divisão\n");

        String c;
        c = leitor.next();

        switch (c){
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }

        System.out.print("O resultado de " + a + " " + c + " " + b + " é: " + res);
    }
}
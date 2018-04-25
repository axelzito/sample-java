import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Faça um algoritmo para vefiricar se um ano é bissexto, sabendo que o ano
            bissexto é divisevel por 4, não é por 100 ou é por 400. */

        Scanner leitor = new Scanner(System.in);
        int ano;
        System.out.print("Insira um ano: ");
        ano = leitor.nextInt();
        //System.out.print("\nano%4: " + ano%4 + "\nano%100: " + ano%100 + "\nano%400: " + ano%400);
        
		if((((ano % 4) == 0) && ((ano % 100) != 0)) || ((ano % 400) == 0)){
            System.out.print("\nO ano " + ano + " é bissexto.\n");
        } else {
            System.out.print("\nO ano " + ano + " não é bissexto.\n");
        }
    }
}
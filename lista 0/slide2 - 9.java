import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criar um programa que leia um cpf e valide.

        System.out.print("Entre o numero do CPF: ");
        Scanner leitor = new Scanner(System.in);
        String CPF;
        CPF = leitor.next();

        //char dig10, dig11;
        int dig10, dig11;
        int aux=0, j=10, k=11, num, n1=0, n2=0;

        for(int i=0; i<9; i++){
            num = (int)(CPF.charAt(i) - 48);
            aux = num * j;
            n1 += aux;
            j--;
        }

        dig10 = 11 - (n1 % 11);
        aux = 0;

        for(int i=0; i<10; i++){
            num = (int)(CPF.charAt(i) - 48);
            aux = num * k;
            n2 += aux;
            k--;
        }

        dig11 = 11 - (n2 % 11);

        //System.out.print("cpf10: " + (CPF.charAt(9) - 48) + "\ncpf11: " + (CPF.charAt(10) - 48));
        //System.out.print("\n\ndig10: " + dig10 + "\ndig11: " + dig11);

        if ((dig10 == CPF.charAt(9)-48) && (dig11 == CPF.charAt(10)-48)){
            System.out.print("\nO CPF " + CPF + " é VALIDO!");
        } else {
            System.out.print("\nO CPF " + CPF + " é INVALIDO!");
        }
    }
}
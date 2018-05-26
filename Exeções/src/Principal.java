
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int a = 0, b = 0, res = 0;

        /*
        System.out.print("Insira o numero a: ");
        a = leitor.nextInt();
        System.out.print("Insira o numero b: ");
        b = leitor.nextInt();

        System.out.println("O valor da soma é: " + c.soma(a,b));

        boolean continuar = true;

        do{
            try {
                System.out.print("Insira o numero a: ");
                a = leitor.nextInt();
                System.out.print("Insira o numero b: ");
                b = leitor.nextInt();

                System.out.println("O valor da soma é: " + c.divisao(a,b));
                continuar = false;
            } catch (ArithmeticException ae){
                System.out.println("Não é possivel dividir por zero");
            } catch (InputMismatchException ime){
                System.out.print("Valor invalido, informe outro: ");
                leitor.nextLine();
            }
        } while (continuar);
        */

        try{
            System.out.print("Digite o valor de a: ");
            a = leitor.nextInt();
            System.out.print("Digite o valor de b: ");
            b = leitor.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada invalida!!");
        }

        if(a < 0){
            throw new NumeroNegativo("O valor de 'a' e negativo.");
        }
        if(b < 0){
            throw new NumeroNegativo("O valor de 'b' e negativo.");
        }

        Calculadora c = new Calculadora(a, b);
        res = c.soma();
        System.out.println("Soma = " + res);
        res = c.subtracao();
        System.out.println("Subtracao = " + res);
        res = c.multiplicacao();
        System.out.println("Multiplicacao = " + res);
        try {
            res = c.divisao();
            System.out.println("Divisao = " + res);
        } catch (ArithmeticException ae) {
            System.out.println("Nao e possivel dividir por zero");
        }
    }
}

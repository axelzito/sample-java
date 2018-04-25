import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Elabore um programa pra imprimir a soma dos numeros impares de 1 a 100*/

        int soma = 0;
        for(int i = 1; i<101; i++){
            if(i % 2 != 0){
                soma += i;
                if(i!=99) {
                    System.out.print(i + ", ");
                } else{
                    System.out.print(i + ".");
                }
            }
        }
        System.out.println("\n\nA soma dos numeros impares de 1 a 100 é: " + soma);
    }
}
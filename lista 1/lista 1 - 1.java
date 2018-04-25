import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        /* Crie um programa que receba por janela JOptionPane o valor de um produto e um código de aumento.
        Calcule o novo valor e por fim, acrescente a este, um imposto. */

        String aux, aux2;
        aux = JOptionPane.showInputDialog("Qual o valor do produto?");
        double valor = Integer.parseInt(aux);

        aux2 = JOptionPane.showInputDialog("Qual o codigo de aumento?");
        int codigo = Integer.parseInt(aux2);

        //System.out.print("O valor é: " + valor + "\naumento: " + codigo);

        switch (codigo) {
            case 1:
                valor = valor + (valor*0.1);
                break;
            case 2:
                valor = valor + (valor*0.25);
                break;
            case 3:
                valor = valor + (valor*0.30);
                break;
            case 4:
                valor = valor + (valor*0.50);
                break;
            default:
                System.out.println("Não é um codigo valido!!!");
        }

        System.out.println("Valor do produto com o ajuste do codigo R$ " + valor);

        if(valor >= 1000 && valor <= 5000){
            valor = valor + (valor*0.001);
        } else if(valor > 5000 && valor <= 10000){
            valor = valor + (valor*0.002);
        } else if(valor > 10000){
            valor = valor + (valor*0.003);
        }

        System.out.println("Valor do final do produto com imposto é R$ " + valor);
    }
}
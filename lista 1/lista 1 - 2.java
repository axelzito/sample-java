import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        /* Crie um programa para cálculo do salário líquido em que três valores devem ser informados pelo
        usuário em janelas de entrada: a quantidade de horas trabalhadas, o salário hora e o número de
        dependentes. O programa deve mostrar em janela de saída com as seguintes informações : */

        String aux, aux2, aux3;
        aux = JOptionPane.showInputDialog("Quantidade de horas trabalhadas");
        double qntHora = Integer.parseInt(aux);

        aux2 = JOptionPane.showInputDialog("Salario da hora");
        double salarioHora = Integer.parseInt(aux2);

        aux3 = JOptionPane.showInputDialog("Numero de dependentes");
        int dependentes = Integer.parseInt(aux3);
        
        double salarioBruto = qntHora * salarioHora + (50*dependentes);
        double inss=0, ir=0;

        if(salarioBruto <= 1000){
            inss = salarioBruto * (8.5/100);
        } else if(salarioBruto > 1000.01){
            inss = salarioBruto * (9/100);
        }

        if(salarioBruto <= 500){
            ir = 0;
        } else if(salarioBruto > 500.01 && salarioBruto <= 1000){
            ir = salarioBruto * (5/100);
        } else if(salarioBruto > 1000.01){
            ir = salarioBruto * (7/100);
        }

        double salarioLiquido = salarioBruto - inss - ir;

        JOptionPane.showMessageDialog(null, "Seu salario liquido é R$ " + salarioLiquido);
    }
}
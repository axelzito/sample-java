import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Numa determinada região, o imposto sobre propriedade é calculado a partir de duas informações, a
        área total do terreno (m2) e a área construída do terreno (m2). O imposto é cobrado da seguinte
        maneira: */

        double areaTotal, areaConstruida, imposto = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o tamanho total da area em m²: ");
        areaTotal = leitor.nextDouble();

        System.out.print("Insira o tamanho da area construida em m²: ");
        areaConstruida = leitor.nextDouble();

        areaTotal = areaTotal * 3.80;
        areaConstruida = areaConstruida * 5;
        
        imposto = areaConstruida + areaTotal;

        System.out.print("O valor total do imposto a ser pago é R$ " + imposto);
    }
}
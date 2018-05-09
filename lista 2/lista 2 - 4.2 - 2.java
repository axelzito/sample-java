import java.util.Random;
import java.util.Scanner;

//main da class Funcionario do exercicio anterior (4.2 - 1)
public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Axel";
        f1.salario = 100.00;
        f1.recebeAumento(50);
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salario atual: R$ " + f1.salario);
        System.out.println("Ganho anual: R$ " + f1.calculaGanhoAnual());
    }
}

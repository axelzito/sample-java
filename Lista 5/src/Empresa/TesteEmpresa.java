package Empresa;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TesteEmpresa {

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("###,##0.00");
        double total = 0;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioEnsinoBasico("Ronaldo", 1, "Real Madrid", new Vendedor()));
        funcionarios.add(new FuncionarioEnsinoBasico("Ronaldo", 2, "Real Madrid", new Vendedor()));
        funcionarios.add(new FuncionarioEnsinoBasico("Ronaldo", 3, "Real Madrid", new Vendedor()));
        funcionarios.add(new FuncionarioEnsinoBasico("Ronaldo", 4, "Real Madrid", new Vendedor()));

        funcionarios.add(new FuncionarioEnsinoMedio("Messi", 5, "Barcelona", new Supervisor()));
        funcionarios.add(new FuncionarioEnsinoMedio("Messi", 6, "Barcelona", new Supervisor()));
        funcionarios.add(new FuncionarioEnsinoMedio("Messi", 7, "Barcelona", new Supervisor()));
        funcionarios.add(new FuncionarioEnsinoMedio("Messi", 8, "Barcelona", new Supervisor()));

        funcionarios.add(new FuncionarioGraduado("Torres", 9, "Atletico de Madrid", new Gerente()));
        funcionarios.add(new FuncionarioGraduado("Torres", 10, "Atletico de Madrid", new Gerente()));

        /*
        System.out.println("Renda: " + eb1.calculaRenda());
        System.out.println("Renda: " + eb2.calculaRenda());
        System.out.println("Renda: " + eb3.calculaRenda());
        System.out.println("Renda: " + eb4.calculaRenda());

        System.out.println("Renda: " + em1.calculaRenda());
        System.out.println("Renda: " + em2.calculaRenda());
        System.out.println("Renda: " + em3.calculaRenda());
        System.out.println("Renda: " + em4.calculaRenda());

        System.out.println("Renda: " + g1.calculaRenda());
        System.out.println("Renda: " + g2.calculaRenda());
        */

        for (int i = 0; i <funcionarios.size(); i++){
            total += funcionarios.get(i).calculaRenda();
            System.out.println(funcionarios.get(i).toString());
        }

        System.out.println("\nA folha de pagamento da empresa é: R$ " + df.format(total));
    }
}

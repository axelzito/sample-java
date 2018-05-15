package Empresa;

public class TesteEmpresa {

    public static void main(String[] args){

        //Funcionario[] funcionarios;

        FuncionarioEnsinoBasico eb1 = new FuncionarioEnsinoBasico("Ronaldo", 1, "Real Madrid");
        FuncionarioEnsinoBasico eb2 = new FuncionarioEnsinoBasico("Ronaldo", 1, "Real Madrid");
        FuncionarioEnsinoBasico eb3 = new FuncionarioEnsinoBasico("Ronaldo", 1, "Real Madrid");
        FuncionarioEnsinoBasico eb4 = new FuncionarioEnsinoBasico("Ronaldo", 1, "Real Madrid");

        FuncionarioEnsinoMedio em1 = new FuncionarioEnsinoMedio("Messi", 2, "Barcelona");
        FuncionarioEnsinoMedio em2 = new FuncionarioEnsinoMedio("Messi", 2, "Barcelona");
        FuncionarioEnsinoMedio em3 = new FuncionarioEnsinoMedio("Messi", 2, "Barcelona");
        FuncionarioEnsinoMedio em4 = new FuncionarioEnsinoMedio("Messi", 2, "Barcelona");

        FuncionarioGraduado g1 = new FuncionarioGraduado("Torres", 3, "Atletico de Madrid");
        FuncionarioGraduado g2 = new FuncionarioGraduado("Torres", 3, "Atletico de Madrid");

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
    }
}

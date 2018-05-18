import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        /* instanciar 10 funcionários sendo 2 horistas, 4 administradores, 3 comissionados e 1 gerente;
            Armazenar os funcionários em um vetor;
            Percorrer o vetor mostrando os dados dos funcionários e quanto cada um ganha por mês.*/

        DecimalFormat df = new DecimalFormat("###,##0.00");
        Lista e = new Lista();
        Empresa emp = new Empresa("Atletico de Madrid");

        Horista h1 = new Horista("Saul", "Ñiguez", 100, 150, 100);
        Horista h2 = new Horista("Diego", "Costa", 100, 50, 100);
        Funcionario f1 = new Funcionario("Diego", "Godin", 50000);
        Funcionario f2 = new Funcionario("Jose Maria", "Gimenez", 50000);
        Funcionario f3 = new Funcionario("Filipe", "Luis", 50000);
        Funcionario f4 = new Funcionario("Lucas", "Hernandez", 50000);
        Comissionado c1 = new Comissionado("Antonie", "Griezmann", 50000, 10000);
        Comissionado c2 = new Comissionado("Jan", "Oblak", 50000, 10000);
        Comissionado c3 = new Comissionado("Kevin", "Gameiro", 50000, 10000);
        Chefe boss = new Chefe("Cholo", "Simeone", 100000, 20000);

        e.add(h1);
        e.add(h2);
        e.add(f1);
        e.add(f2);
        e.add(f3);
        e.add(f4);
        e.add(c1);
        e.add(c2);
        e.add(c3);
        e.add(boss);

        System.out.print("\nEmpresa: " + emp.getNome() + "\n\nLista de funcionarios:\n");

        e.listaFuncionarios();

        System.out.println("\nA quantidade de comissionados é " + e.qtdComissionado());
        System.out.println("A quantidade de horistas é " + e.qtdHorista());
        System.out.println("\nA folha de pagamento sera R$ " + df.format(e.calculaFolha()));
    }
}

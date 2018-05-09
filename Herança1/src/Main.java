import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* instanciar 10 funcionários sendo 2 horistas, 4 administradores, 3 comissionados e 1 gerente;
            Armazenar os funcionários em um vetor;
            Percorrer o vetor mostrando os dados dos funcionários e quanto cada um ganha por mês.*/

        DecimalFormat df = new DecimalFormat("###,##0.00");
        Empresa e = new Empresa("Atletico de Madrid");

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

        ArrayList<Pessoa> jugadores = e.listaPessoas();
        System.out.print("\nEmpresa: " + e.getNome() + "\n\nLista de funcionarios:\n");

        for(int i = 0; i < jugadores.size(); i++){
            System.out.println("Nome: " + jugadores.get(i).getNome() + " " + jugadores.get(i).getSobrenome() + "\nSalario: R$ " + df.format(jugadores.get(i).calculaRenda()) + "\n");  //getNome, getRenda
        }

        System.out.print("Valor da folha de pagamento da empresa " + e.getNome() + " é R$ " + df.format(e.calculaFolha()) + "\n");
    }
}

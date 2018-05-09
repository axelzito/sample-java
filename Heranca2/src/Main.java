import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* Criar 10 filmes, cds e jogos, atribuindo os valores através de construtores ou através de métodos sets.
            Armazenar os itens criados em um vetor.
            Percorrer o vetor mostrando os dados dos itens armazenados (dados comuns + dados específicos de cada item)
            Quando for jogo, mostrar separadamente a plataforma.*/

        DecimalFormat df = new DecimalFormat("###,##0.00");
        //Empresa e = new Empresa("Atletico de Madrid");
        Loja l = new Loja("Wanda Nara Metropolitano");

        Cd c1 = new Cd("After Laugther", 2017, "Paramore", 14, 150, "Muito bom");

        Filme f1 = new Filme("Star Wars", 1971, 130, "George Lucas", "very good(muito bom em ingles");

        Jogo j1 = new Jogo("GTA V", 2010, "PC/PS/Xbox", 20, 200, "the best in the world");

        l.add(c1);
        l.add(f1);
        l.add(j1);

        /*
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
        */
        ArrayList<Titulo> jugadores = l.listaPessoas();
        System.out.print("\nEmpresa: " + l.getNome() + "\n\nLista de funcionarios:\n");

        Titulo t = new Cd("Riot!", 2010, "Paramore", 14, 150, "");
        System.out.print("artista: " + ((Cd) t).getArtista() + "\n");

        for(int i = 0; i < jugadores.size(); i++){
            System.out.println("Nome: " + jugadores.get(i).getNome() + " " + jugadores.get(i).getAno());  //getNome, getRenda
        }

        //System.out.print("Valor da folha de pagamento da empresa " + e.getNome() + " é R$ " + df.format(e.calculaFolha()) + "\n");
    }
}

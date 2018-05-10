
public class Main {

    public static void main(String[] args) {

        /* Criar 10 filmes, cds e jogos, atribuindo os valores através de construtores ou através de métodos sets.
            Armazenar os itens criados em um vetor.
            Percorrer o vetor mostrando os dados dos itens armazenados (dados comuns + dados específicos de cada item)
            Quando for jogo, mostrar separadamente a plataforma.*/

        Titulo midias[] = new Titulo[10];
        Filme f1 = new Filme("Star Wars Episodio IV", 1980, 169, "George Lucas", "qq ta acontecendo?");
        midias[0] = f1;
        Cd c1 = new Cd("All We Know Is Falling", 2005, "Paramore", 15,140,"bom");
        midias[1] = c1;
        Cd c2 = new Cd("Riot!", 2007, "Paramore", 15,150,"thats what you get when you etc");
        midias[2] = c2;
        Cd c3 = new Cd("Brand New Eyes", 2009, "Paramore", 16,160,"the only exception(?)");
        midias[3] = c3;
        Cd c4 = new Cd("Paramore: Self-tituled", 2011, "Paramore", 15,150,"aint fun living in the real world");
        midias[4] = c4;
        Cd c5 = new Cd("After Laughter", 2016, "Paramore", 15,150,"I bet everybody here is fake happy too");
        midias[5] = c5;
        Jogo j1 = new Jogo("Minecraft", 2010, "PC", 20, 999, "Quadrado");
        midias[6] = j1;
        Jogo j2 = new Jogo("Grand Theft Auto V", 2013, "PC", 20, 999, "Magnifico");
        midias[7] = j2;
        Jogo j3 = new Jogo("Crash Bandicoot", 1996, "PS1", 1, 100, "Raposa louca");
        midias[8] = j3;
        Jogo j4 = new Jogo("Winning Eleven 2002", 2002, "PS1", 2, 99, "Melhor jogo de futebol ja feito");
        midias[9] = j4;

        for (int i = 0; i < midias.length; i++) {
            midias[i].mostrarDadosComuns();
            midias[i].mostrarDados();
        }
    }
}

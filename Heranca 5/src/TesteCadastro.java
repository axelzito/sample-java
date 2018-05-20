
public class TesteCadastro {

    public static void main(String[] args){

        CadastroPessoas p = new CadastroPessoas();

        Cliente c1 = new Cliente("Hayley", new Data(01, 02,1922), 12);
        Funcionario f1 = new Funcionario("Williams", new Data(01, 02,1954),2000);
        Comissionado co1 = new Comissionado("Axel", new Data(15, 03, 1996), 1000, 2000);
        Horista h1 = new Horista("Torres", new Data(26, 03, 1987), 500, 60, 25);
        Gerente g1 = new Gerente("Paramore", new Data(01, 02,1936), 15000, "Musica");

        p.cadastraPessoas(c1);
        p.cadastraPessoas(f1);
        p.cadastraPessoas(co1);
        p.cadastraPessoas(h1);
        p.cadastraPessoas(g1);

        p.imprimeCadastro();
    }
}

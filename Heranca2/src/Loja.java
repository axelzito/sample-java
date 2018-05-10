/*import java.util.ArrayList;

public class Loja {

    private String nome;
    ArrayList <Titulo> titulos;
    ArrayList <Cd> cds;
    ArrayList <Filme> filmes;
    ArrayList <Jogo> jogos;

    public Loja(String nome){

        this.nome = nome;
        titulos = new ArrayList<Titulo>();
        cds = new ArrayList<Cd>();
        filmes = new ArrayList<Filme>();
        jogos = new ArrayList<Jogo>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void add(Titulo titulo){
        titulos.add(titulo);
        //cds.add(titulo);


    }

    String lista(Titulo t) {
        for(int i = 0; i < titulos.size(); i++) {
            if(titulos.get(i) == t){
                return titulos.get(i).getNome();
            }
        }
        return null;
    }

    public ArrayList<Titulo> listaPessoas() {
        return this.titulos;
    }
}
*/
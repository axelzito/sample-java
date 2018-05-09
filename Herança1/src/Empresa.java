import java.util.ArrayList;

public class Empresa {

    private String nome;
    ArrayList <Pessoa> pessoas;

    public Empresa(String nome){

        this.nome = nome;
        pessoas = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaFolha () {

        double folha = 0.0;

        for(int i = 0; i < pessoas.size(); i++) {
            folha += pessoas.get(i).calculaRenda();
        }

        return folha;
    }

    void add(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    String lista(Pessoa p) {
        for(int i = 0; i < pessoas.size(); i++) {
            if(pessoas.get(i) == p){
                return pessoas.get(i).getNome() + " " + pessoas.get(i).getSobrenome();
            }
        }
        return null;
    }

    public ArrayList<Pessoa> listaPessoas() {
        return this.pessoas;
    }
}

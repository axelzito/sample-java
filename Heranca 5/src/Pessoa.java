/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public abstract class Pessoa {

    private String nome;
    private Data nascimento;

    protected Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void imprimeDados(){
        //System.out.println("Nome: " + getNome() + " Data nascimento: " + getNascimento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
}

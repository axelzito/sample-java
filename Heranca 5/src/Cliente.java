/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Cliente extends Pessoa {

    private int codigo;

    protected Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + getNome() + " Data nascimento: " + this.getNascimento().getDia() + "/" + this.getNascimento().getMes() + "/" + this.getNascimento().getAno() + " Codigo: " + codigo);
    }
}

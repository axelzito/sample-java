import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class CadastroPessoas {

    private int qtdAtual = 0;
    private LinkedList <Pessoa> pessoas;

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public CadastroPessoas(){
        pessoas = new LinkedList<Pessoa>();
    }

    public void cadastraPessoas(Pessoa pessoa){
        pessoas.add(pessoa);
        qtdAtual++;
    }

    public void imprimeCadastro(){
        String pessoa = null;
        Iterator i = pessoas.iterator();

        Pessoa p;

        while (i.hasNext()) {
            p = (Pessoa) i.next();

            p.imprimeDados();
        }
    }
}

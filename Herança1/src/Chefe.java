

public class Chefe extends Pessoa {

    private double gratificacao;

    public Chefe(String nome, String sobrenome, double salarioFixo, double gratificacao) {
        super(nome, sobrenome, salarioFixo);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(int gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double calculaRenda(){

        return getSalarioFixo() + getGratificacao();
    }
}

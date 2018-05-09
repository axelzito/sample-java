

public class Comissionado extends Pessoa {

    private double comissao;

    public Comissionado(String nome, String sobrenome, double salarioFixo, double comissao) {
        super(nome, sobrenome, salarioFixo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaRenda(){

        return getSalarioFixo() + getComissao();
    }
}

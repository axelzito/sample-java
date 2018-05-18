

public class Comissionado extends Pessoa {

    private double comissao;
    private String cargo = "Comissionado";

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

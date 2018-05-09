

public class Horista extends Pessoa {

    private int qtdHoras;
    private double valorHora;

    public Horista(String nome, String sobrenome, double salarioFixo, int qtdHoras, double valorHora) {
        super(nome, sobrenome, salarioFixo);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }


    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calculaRenda(){

        return getSalarioFixo() + (getQtdHoras() * getValorHora());
    }
}

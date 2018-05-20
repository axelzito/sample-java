/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Horista extends Funcionario {

    private double valorHora;
    private int qtdHoras;

    protected Horista(String nome, Data nascimento, double salario, int qtdHoras, double valorHora) {
        super(nome, nascimento, salario);
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void imprimeDados(){

        System.out.println("Nome: " + getNome() + " Data nascimento: " + this.getNascimento().getDia() + "/" + this.getNascimento().getMes() + "/" + this.getNascimento().getAno() + " Salario: R$ " + df.format(calculaSalario()) + " Imposto: R$ " + df.format(calculaImposto()));
    }

    public double calculaImposto(){

        double imposto = 0;

        imposto = getSalario() * 0.01;

        return  imposto;
    }

    public double calculaSalario(){

        double salarioTotal = 0;

        salarioTotal = getSalario() + (qtdHoras * valorHora);

        return salarioTotal;
    }
}

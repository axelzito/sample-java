import java.text.DecimalFormat;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Comissionado extends Funcionario {

    DecimalFormat df = new DecimalFormat("###,##0.00");
    private double comissao;

    protected Comissionado(String nome, Data nascimento, double salario, double comissao) {
        super(nome, nascimento, salario);
        this.comissao = comissao;
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

        salarioTotal = getSalario() + comissao;

        return salarioTotal;
    }
}

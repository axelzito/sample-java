import java.text.DecimalFormat;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Funcionario extends Pessoa {

    DecimalFormat df = new DecimalFormat("###,##0.00");
    private double salario;

    protected Funcionario(String nome, Data nascimento, double salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimeDados(){

        System.out.println("Nome: " + getNome() + " Data nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno() + " Salario: R$ " + df.format(getSalario()) + " Imposto: R$ " + df.format(calculaImposto()));
    }

    public double calculaImposto(){

        double imposto = 0;

        imposto = getSalario() * 0.03;

        return  imposto;
    }
}

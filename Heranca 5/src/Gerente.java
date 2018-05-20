import java.text.DecimalFormat;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Gerente extends Funcionario {

    private String area;
    DecimalFormat df = new DecimalFormat("###,##0.00");

    protected Gerente(String nome, Data nascimento, double salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    public void imprimeDados(){

        System.out.println("Nome: " + getNome() + " Data nascimento: " + this.getNascimento().getDia() + "/" + this.getNascimento().getMes() + "/" + this.getNascimento().getAno() + " Area: " + area + " Salario: R$ " + df.format(getSalario()) + " Imposto: R$ " + df.format(calculaImposto()));
    }

    public double calculaImposto(){

        double imposto = 0;

        imposto = getSalario() * 0.05;

        return  imposto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

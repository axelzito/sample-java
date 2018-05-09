

public class Funcionario extends Pessoa {

    public double calculaRenda(){

        return getSalarioFixo();
    }

    public Funcionario (String nome, String sobrenome, double salarioFixo) {

        super(nome, sobrenome, salarioFixo);
    }
}

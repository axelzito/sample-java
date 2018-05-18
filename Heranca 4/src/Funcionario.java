

public class Funcionario extends Pessoa {

    private String cargo = "Funcionario";

    public double calculaRenda(){

        return getSalarioFixo();
    }

    public Funcionario (String nome, String sobrenome, double salarioFixo) {

        super(nome, sobrenome, salarioFixo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

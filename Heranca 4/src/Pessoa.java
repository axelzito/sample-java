
public class Pessoa {

    private String nome, sobrenome;
    private Double salarioFixo;
    private String cargo;

    public Pessoa(String nome, String sobrenome, double salarioFixo) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calculaRenda(){

        //double aux;

        //aux = Horista.qtdHoras
        return salarioFixo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

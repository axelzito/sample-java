public class Funcionario {

    /* Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
		(double), a data de entrada no banco (String) e seu RG (String). Você deve criar alguns métodos de acordo com sua necessidade.
		Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento.
		Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo
		o valor do salário multiplicado por 12..
		A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funcionário
		faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz. */

    private String nome, dptm, dataEntrada, rg;
    private Double salario, aumento, ganhoAnual;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDptm() {
        return dptm;
    }

    public void setDptm(String dptm) {
        this.dptm = dptm;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calculaGanhoAnual() {
        return ganhoAnual = salario*12;
    }

    public double recebeAumento(double aumento){
        return salario = salario + aumento;
    }
}
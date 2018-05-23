package Empresa;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String nomeEscola;

    public FuncionarioEnsinoBasico(String nome, int id, String nomeEscola, Comissao comissao) {
        super(nome, id, comissao);
        this.nomeEscola = nomeEscola;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    @Override
    public double calculaRenda() {
        return super.calculaRenda() + (super.calculaRenda()*0.10) + comissao.getComissao();
    }
}

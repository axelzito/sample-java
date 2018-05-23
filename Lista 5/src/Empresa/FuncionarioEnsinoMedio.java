package Empresa;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {


    public FuncionarioEnsinoMedio(String nome, int id, String nomeEscola, Comissao comissao) {
        super(nome, id, nomeEscola, comissao);
    }

    @Override
    public double calculaRenda() {
        return super.calculaRenda() + (super.calculaRenda()*0.50) + comissao.getComissao();
    }
}

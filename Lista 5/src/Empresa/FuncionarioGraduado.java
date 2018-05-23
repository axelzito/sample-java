package Empresa;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {

    public FuncionarioGraduado(String nome, int id, String nomeEscola, Comissao comissao) {
        super(nome, id, nomeEscola, comissao);
    }

    @Override
    public double calculaRenda() {
        return super.calculaRenda() + (super.calculaRenda()) + comissao.getComissao();
    }
}

package Empresa;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {

    public FuncionarioGraduado(String nome, int id, String nomeEscola) {
        super(nome, id, nomeEscola);
    }

    @Override
    public double calculaRenda() {
        return super.calculaRenda() + (super.calculaRenda());
    }
}

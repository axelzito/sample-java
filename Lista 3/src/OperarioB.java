// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 6 lista 3

public class OperarioB extends Operario {

    /*
B - os que fazem de 11 até 35 peças por mês
O pessoal da categoria B recebe salário
mínimo e mais 5% do salário mínimo por peça, acima das 10 iniciais.
     */
    public OperarioB(int id, int numPecas, String sexo) {
        super(id, numPecas, sexo);
    }

    public double calculaSalario(){
        double adicional = 0.0;

        if (this.getNumPecas() > 10 && this.getNumPecas() <= 35) {
            int excedente = this.getNumPecas() - 10;
            adicional = excedente * (0.05*getSalarioMinimo());
        }
        return getSalarioMinimo() + adicional;
    }
}

// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 6 lista 3

public class OperarioC extends Operario {

    /*
    C - os que fazem mais de 35 peças por mês
    O pessoal da categoria C recebe salário mínimo e mais 9% do salário mínimo por peça, acima das 35 iniciais.
    */

    public OperarioC(int id, int numPecas, String sexo) {
        super(id, numPecas, sexo);
    }

    public double calculaSalario(){
        double adicional = 0.0;
        double salario = this.getSalarioMinimo();
        if (this.getNumPecas() > 35) {
            int excedente = this.getNumPecas() - 35;
            adicional = excedente * (0.09*salario);
        }
        return salario + adicional;
    }
}

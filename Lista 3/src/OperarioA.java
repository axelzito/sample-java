// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 6 lista 3

public class OperarioA extends Operario {

    /*
    A - os que fazem até 10 peças por mês
O pessoal da categoria A recebe salário mínimo.
     */

    public OperarioA(int id, int numPecas, String sexo) {
        super(id, numPecas, sexo);
    }

    public double calculaSalario(){

        return getSalarioMinimo();
    }
}

// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Main questão 6 lista 3

import java.text.DecimalFormat;
import java.util.List;

public class MainOperario {

    public static void main(String[] args){

        /*
        Calcule e escreva:
- o salário de cada operário;
- o total da folha de pagamento do mês;
- o número total de peças fabricadas no mês;
- a média de peças fabricadas pelos homens da categoria A;
- a média de peças fabricadas pelas mulheres da categoria C;
- a matrícula do(a) operário(a) com maior salário.
         */

        DecimalFormat df = new DecimalFormat("###,##0.00");

        List<Operario> operarios = null;
        
        OperarioC op1 = new OperarioC(1, 50, "Masculino");
        operarios.add(op1);
        //double salario = ((OperarioC) op1).calculaSalario(), aux = 0;
        //System.out.print("Salario: R$ " + df.format(salario));
        double aux = 0;

        for (int i = 0; i < operarios.size(); i++) {
            double salario = operarios.get(i).calculaSalario();
            System.out.println("Matricula: " + operarios.get(i).getId() + " - Sexo:" + operarios.get(i).getSexo()
                    + " - Salário: " + df.format(salario));
            aux += salario;
        }

    }
}

// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Main questão 5 lista 3

public class MainLoja {

    public static void main (String[] args) {

        double salarioMinimo = 954.00;
        Loja vendedor1 = new Loja(1, 50, 32, salarioMinimo);
        Loja vendedor2 = new Loja(2, 5, 3, salarioMinimo);
        Loja vendedor3 = new Loja(3, 19, 29, salarioMinimo);

        vendedor1.calculaComissao();
        vendedor1.mostraSalario();
        System.out.println();
        vendedor2.calculaComissao();
        vendedor2.mostraSalario();
        System.out.println();
        vendedor3.calculaComissao();
        vendedor3.mostraSalario();
    }
}

// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Main questão 1 lista 3

public class MainComplexo {

    public static void main (String[] args) {
        Complexo abc = new Complexo (4.5, 6.7);
        Complexo def = new Complexo (7.8, -9.1);
        Complexo zero = new Complexo();
        System.out.println (abc); // imprime o numero (4.5, 6.7)
        System.out.println (def); // imprime o numero (7.8, -9.1)
        System.out.println (Complexo.somar (abc, def)); // imprime a soma, que eh (12.3, -2.4)
        System.out.println (Complexo.subtrair (abc, def)); // imprime a soma, que eh (-3.3, 15.8)
    }
}

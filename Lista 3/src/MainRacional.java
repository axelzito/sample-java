// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Main questão 2 lista 3

public class MainRacional {

    public static void main (String[] args) {
        Racional a = new Racional (32, 16);
        Racional b = new Racional (8,4);
        //Racional zero = new Racional();
        System.out.println (a);
        System.out.println (b);
        System.out.println (Racional.somar (a, b));
        System.out.println (Racional.subtrair (a, b));
        System.out.println (Racional.multiplicar (a, b));
        System.out.println (Racional.dividir (a, b));
    }
}

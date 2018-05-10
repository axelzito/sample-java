// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 2 lista 3

public class Racional {

    private int numerador, denominador;

    public Racional (int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional () {
        this.numerador = 0;
        this.denominador = 0;
    }


    public static Racional somar (Racional x, Racional y) {
        return new Racional (x.numerador + y.numerador, x.denominador + y.denominador);
    }

    public static Racional subtrair (Racional x, Racional y) {
        return new Racional (x.numerador - y.numerador, x.denominador - y.denominador);
    }

    public static Racional multiplicar (Racional x, Racional y) {
        return new Racional (x.numerador * y.numerador, x.denominador * y.denominador);
    }

    public static Racional dividir (Racional x, Racional y) {
        return new Racional (x.numerador / y.numerador, x.denominador / y.denominador);
    }

    public String toString() {
        return "(" + numerador + " / " + denominador + ")";
    }
}



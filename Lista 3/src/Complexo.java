// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 1 lista 3

import static java.lang.Math.sqrt;

public class Complexo {

    /* parteReal + parteImaginária * i
        onde i é sqrt(-1) */

    private double parteReal, parteImaginaria;
    private double i = sqrt(-1);

    public Complexo (double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complexo () {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    // forneca um metodo para somar 2 numeros Complex
    public static Complexo somar (Complexo x, Complexo y) {
        return new Complexo (x.parteReal + y.parteReal, x.parteImaginaria + y.parteImaginaria);
    }
    // forneca um metodo para subtrair 2 numeros Complex
    public static Complexo subtrair (Complexo x, Complexo y) {
        return new Complexo (x.parteReal - y.parteReal, x.parteImaginaria - y.parteImaginaria);
    }
    // forneca um metodo para imprimir numeros Complex na forma (a,b)
    public String toString() {
        return "(" + parteReal + ", " + parteImaginaria + ")";
    }
}



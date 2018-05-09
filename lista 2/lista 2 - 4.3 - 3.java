public class Fibonacci {
 
	/* Escreva o método recursivo novamente, usando apenas uma linha. Para isso, pesquise sobre o operador
		condicional ternário. (ternary operator) */

 static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
 
    public static void main(String[] args) {
	
        for (int i = 0; i < 10; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
 
    }
}
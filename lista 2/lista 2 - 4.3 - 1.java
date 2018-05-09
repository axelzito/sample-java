public class Fibonacci {
 
    /* Este método calculaFibonacci não pode ter nenhum laço, só pode chamar ele mesmo como método.
		Pense nele como uma função, que usa a própria função para calcular o resultado. */
	
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
 
    public static void main(String[] args) {   
	      
	for (int i = 0; i < 10; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
 
    }
}
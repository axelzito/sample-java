public class Main {

    public static void main(String[] args) {

        //Criar um programa que liste o fatorial dos números de 1 a 10;
        int fat = 1;

        for(int i=1; i<11; i++) {
            fat *= i;
            System.out.println("O fatorial de " + i + " é: " + fat);
        }
    }
}
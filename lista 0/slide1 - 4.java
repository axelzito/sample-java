public class Main {

    public static void main(String[] args) {

        //Criar um programa que liste os números impares de 1 a 50;
        int x = 0;

        for(int i=1; i<51; i++) {
            x = i%2;
            if(x != 0) {
                System.out.print(i);
                if (i < 49) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
            }
        }
    }
}

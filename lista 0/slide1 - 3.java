 public class Main {

    public static void main(String[] args) {

        ////Criar um programa que liste o quadrado dos números de 1 a 20;;
        int x = 0;

        for(int i=1; i<21; i++) {
            x = i*i;
            System.out.print(x);
            if(i<20){
                System.out.print(", ");
            }else{
                System.out.print(".");
            }
        }
    }
}
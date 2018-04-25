public class Main {

    public static void main(String[] args) {

        ////Criar um programa que liste números de 1 a 20;

        for(int i=1; i<21; i++) {
            System.out.print(i);
            if(i<20){
                System.out.print(", ");
            }else{
                System.out.print(".");
            }
        }
    }
}

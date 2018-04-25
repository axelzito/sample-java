public class Main {

    public static void main(String[] args) {

        //Criar um programa que dados 3 valores, mostra o maior e o menor;

        int a, b, c;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira 3 numeros diferentes e te direi qual o maior e qual o menor\n");

        System.out.print("Insira o primeiro valor: ");
        a = leitor.nextInt();
        System.out.print("Insira o segundo valor: ");
        b = leitor.nextInt();
        System.out.print("Insira o terceiro valor: ");
        c = leitor.nextInt();
        System.out.print("\n");

        if(a>b && a>c){
            System.out.print("O maior valor é: " + a);
        }else if(b>a && b>c){
            System.out.print("O maior valor é: " + b);
        }else if(c>a && c>b){
            System.out.print("O maior valor é: " + c);
        }

        if(a<b && a<c){
            System.out.print("\nO menor valor é: " + a);
        }else if(b<a && b<c){
            System.out.print("\nO menor valor é: " + b);
        }else if(c<a && c<b){
            System.out.print("\nO menor valor é: " + c);
        }
        
    }
}


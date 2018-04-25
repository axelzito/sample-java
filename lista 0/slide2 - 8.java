import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         /*Criar um programa que entre com o nome e o número de telefone e valide
    os dados. Os nomes só podem ter caracteres alfabéticos e o telefone só numéricos*/

        Scanner leitor = new Scanner(System.in);
        String telefone;
        String nome;
        System.out.print("Insira o nome: ");
        nome = leitor.next();
        System.out.print("Insira o telefone: ");
        telefone = leitor.next();
        System.out.print("\n");

        for(int i = 0; i < nome.length(); i++){
            if(Character.isDigit(nome.charAt(i))) {
                System.out.println("Deu ruim!!! Não é um nome valido.");
                break;
            }
        }

        for(int i = 0; i < telefone.length(); i++){
            if(!Character.isDigit(telefone.charAt(i))){
                System.out.println("Deu ruim!!! Não é um telefone valido.");
                break;
            }
        }
        //leitor.close();
    }
}
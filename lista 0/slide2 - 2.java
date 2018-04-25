import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Criar um programa que leia um nome e use todos os métodos mostrados na teoria*/

        Scanner leitor = new Scanner(System.in);
        String s;
        System.out.print("Insira uma palavra: ");

        s = leitor.next();

        System.out.println(s.equals("Paramore")); // true
        System.out.println(s.length()); // 8
        System.out.println(s.charAt(2)); // s
        System.out.println(s.substring(2,4)); // st
        System.out.println(s.toUpperCase()); // TESTANDO
        System.out.println(s.toLowerCase()); // testando
        System.out.println(s.trim()); // Testando
        System.out.println(s.replace("ara","")); // Textando
        s = "Fábrica de brinquedos";
        System.out.println(s.indexOf("br")); // 2
        System.out.println(s.lastIndexOf("br")); // 11
        System.out.println(s.equals("br")); // false
        System.out.println(s.equalsIgnoreCase("br")); //false

        leitor.close();
    }
}
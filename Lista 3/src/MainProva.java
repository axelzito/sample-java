// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 7 lista 3

import java.util.Scanner;

public class MainProva {

    public static void main(String[] args){
        String[] gabarito = new String[10];
        Scanner leitor = new Scanner(System.in);

        Candidato c1 = new Candidato(10, "Axel", "9999999");

        System.out.println("Infome o gabarito da prova");
        for (int i = 0; i < 10; i++) {
            System.out.println("Resposta da questão #" + i);
            gabarito[i] = leitor.next();
        }

        System.out.println();
        String[] respostas = new String[10];
        //respostas = ["b","a", "b","a", "b","a", "b","a", "b","a"];
    }
}

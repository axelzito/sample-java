import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Em uma empresa existem tabelas com os gastos mensais. Para fechar o primeiro
        trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000
        reais, em Fevereiro, 23000 reais e em Março, 17000 reais, faça um programa que calcule
        e imprima o gasto total no trimestre. Siga esses passos:
        a) Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
        b) Dentro do main, declare uma variável inteira chamada gastosJaneiro e inicialize-a;
        c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os valores definidos;
        d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis:
        e) Imprima a variável gastosTrimestre.
        f) Adicione código (sem alterar as linhas que já existem) para imprimir a média
        mensal de gasto, criando uma variável mediaMensal junto com uma mensagem. Para
        isso, concatene a String com o valor, usando "Valor da média mensal = "+ mediaMensal.*/

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("O gasto do trimestre foi de R$ " + gastosTrimestre);

        double mediaMenal = gastosTrimestre / 3;
        System.out.println("O gasto medio mensal do trimestre foi de R$ " + mediaMenal);
    }
}
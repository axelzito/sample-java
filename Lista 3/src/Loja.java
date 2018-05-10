// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Main questão 5 lista 3

import java.text.DecimalFormat;

public class Loja {

    DecimalFormat df = new DecimalFormat("###,##0.00");
    private int id, qtdVendidaPlana, qtdVendidaComum;
    private double comissao, salario, inss, ir;

    public Loja(int id, int qtdVendidaPlana, int qtdVendidaComum, double salario) {
        this.id = id;
        this.qtdVendidaPlana = qtdVendidaPlana;
        this.qtdVendidaComum = qtdVendidaComum;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdVendidaPlana() {
        return qtdVendidaPlana;
    }

    public void setQtdVendidaPlana(int qtdVendidaPlana) {
        this.qtdVendidaPlana = qtdVendidaPlana;
    }

    public int getQtdVendidaComum() {
        return qtdVendidaComum;
    }

    public void setQtdVendidaComum(int qtdVendidaComum) {
        this.qtdVendidaComum = qtdVendidaComum;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculaComissao(){

        double comissaoComum = 0.0, comissaoPlana = 0.0;

        if (qtdVendidaComum >= 20) {
            comissaoComum = qtdVendidaComum * 30;
        } else if (qtdVendidaComum < 20) {
            comissaoComum =  qtdVendidaComum * 20;
        }

        if (qtdVendidaPlana >= 10) {
            comissaoPlana = qtdVendidaPlana * 50;
        } else if (qtdVendidaPlana < 10) {
            comissaoPlana =  qtdVendidaPlana * 30;
        }

        comissao = comissaoComum + comissaoPlana;
    }

    public void mostraSalario(){
        double salarioLiquido = 0.0, salarioBruto = salario + comissao;
        inss = (salarioBruto*0.08);
        System.out.println("Desconto INSS: R$" + df.format(inss));

        System.out.println("Salário bruto sem desconto: R$ " + df.format(salario + comissao));
        System.out.println("Salário bruto com desconto do INSS: R$ " + df.format(salarioBruto - inss));

        ir = 0.0;

        if((salarioBruto - inss) >= 700) {
            ir = (salarioBruto - inss) * 0.05;
            salarioLiquido = salarioBruto - inss - ir;
            System.out.println("Salário liquido com todos os descontos (INSS e IR): " + df.format(salarioLiquido));
        }
    }
}

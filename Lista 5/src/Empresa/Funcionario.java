package Empresa;

import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private int id;
    private double rendaBasica = 1000;
    public Comissao comissao;
    //private DecimalFormat df = new DecimalFormat("###,##0.00");


    public Funcionario(String nome, int id, Comissao comissao) {
        this.nome = nome;
        this.id = id;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calculaRenda(){

        return getRendaBasica();
    }

    public String toString(){
        return "Nome: " + getNome() + "\nComissao: R$ " + (comissao.getComissao() + "\nSalario total: R$ " + (calculaRenda()));
    }
}

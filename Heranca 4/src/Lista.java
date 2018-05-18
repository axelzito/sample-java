
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

public class Lista {

    /*
    calcular o total da folha de pagamentos; calcular a quantidade de Horistas; calcular a quantidade de Comissionados;
    retornar um relatório contendo os nomes do funcionários com seus respectivos cargos e salários
     */

    DecimalFormat df = new DecimalFormat("###,##0.00");
    private LinkedList<Pessoa> pessoas;
    private int comissionado = 0, horista = 0;

    public Lista () {
        pessoas = new LinkedList<Pessoa>();
    }

    void add(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void listaFuncionarios(){

        String pessoa = null;
        Iterator i = pessoas.iterator();

        Pessoa p;

        while (i.hasNext()) {
            p = (Pessoa) i.next();
            if (p instanceof Comissionado) {
                System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " Cargo: " + p.getCargo() + "\nSalario: R$ " + df.format(p.calculaRenda()));
                comissionado++;
            } else if (p instanceof Chefe) {
                System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " Cargo: " + p.getCargo() + "\nSalario: R$ " + df.format(p.calculaRenda()));
            } else if (p instanceof Funcionario) {
                System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " Cargo: " + p.getCargo() + "\nSalario: R$ " + df.format(p.calculaRenda()));
            } else if (p instanceof Horista) {
                System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " Cargo: " + p.getCargo() + "\nSalario: R$ " + df.format(p.calculaRenda()));
                horista++;
            }
            //System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " Cargo: " + p.getCargo() + "\nSalario: R$ " + df.format(p.calculaRenda()));
        }
    }

    public double calculaFolha(){

        double folha = 0.0;

        for(int i = 0; i < pessoas.size(); i++) {
            folha += pessoas.get(i).calculaRenda();
        }

        return folha;
    }

    public int qtdHorista(){

        return horista;
    }

    public int qtdComissionado(){

        return comissionado;
    }
}

// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 6 lista 3

public class Operario {
    /*
    - a matrícula do operário;
- o número de peças fabricadas por mês;
- o sexo do operário.
     */

    private int id, numPecas;
    private String sexo;
    private double salarioMinimo = 968.31;

    public Operario(int id, int numPecas, String sexo) {
        this.id = id;
        this.numPecas = numPecas;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPecas() {
        return numPecas;
    }

    public void setNumPecas(int numPecas) {
        this.numPecas = numPecas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double calculaSalario(){
        return this.salarioMinimo;
    }

}

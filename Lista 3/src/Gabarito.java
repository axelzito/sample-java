// Autor: Axel Miguez   email: axel.ataides@gmail.com
// Classe questão 7 lista 3

public class Gabarito {


    private String[] respostas;
    private int inscricao;


    public Gabarito(String[] respostas, int inscricao) {
        this.respostas = respostas;
        this.inscricao = inscricao;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
}

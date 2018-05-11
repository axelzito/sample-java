

public class Candidato {

    /*
    Faça um programa orientado a objetos (em Java) para corrigir provas de múltipla escolha.
Cada prova tem 10 questões, cada questão valendo um ponto. O primeiro conjunto de dados
a ser lido refere-se aos candidatos: número de inscrição, nome e telefone. Outro conjunto de
dados a ser lido será o gabarito para a correção da prova e, finalmente, as respostas dos
candidatos acompanhadas de seus números de inscrição.
     */

    private int inscricao;
    private String nome, telefone;

    public Candidato(int inscricao, String nome, String telefone) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

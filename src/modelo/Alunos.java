
package modelo;

public class Alunos {
    private String nome;
    private int ra;
    private static int contador = 1;

    public Alunos(String nome) {
        this.nome = nome;
        this.ra = contador++;


    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){this.nome = nome;}
    public int getRa() {
        return ra;
    }

    @Override
    public String toString() {;
        return "Nome: " + nome + "RA: " + ra;
    }




}

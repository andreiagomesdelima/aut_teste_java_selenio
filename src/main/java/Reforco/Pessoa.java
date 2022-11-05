package Reforco;

public class Pessoa {
    Profissao profissao = new Profissao();

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void status(){
        profissao.setProfissao("QA");

    }

}

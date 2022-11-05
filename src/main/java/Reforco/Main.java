package Reforco;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.status();

        pessoa.setNome("Andreia");

        System.out.println(pessoa.getNome());

    }
}

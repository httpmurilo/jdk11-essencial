package io.murilo.estruturadedados.ArmazenamentoSequencial;

public class Programa {
    public static void main(String[] args) {
        var a1 = new Aluno("Murilo");
        var a2 = new Aluno("Matheus");

        Vetor lista = new Vetor();

        System.out.println("Totl de aluno: " + lista.tamanho());
        lista.adicionarAluno(a1);
        lista.adicionarAluno(a2);

        System.out.println("Totl de aluno: " + lista.tamanho());

        System.out.println(lista);
        System.out.println(lista.existeAluno(a1));
        System.out.println(lista.existeAluno(a2));
        System.out.println(lista.pegarPosicao(0));
        System.out.println(lista.pegarPosicao(1));

        var a3 = new Aluno("Murilo Ed");
        lista.adicionarAluno(1, a3);
        System.out.println(lista);


    }
}

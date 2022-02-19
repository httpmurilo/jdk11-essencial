package io.murilo.estruturadedados.ArmazenamentoSequencial;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];

    public void adicionarAluno(Aluno aluno) {
        //TODO receber um aluno
    }

    public Aluno pegarPosicao(int posicao) {
        return this.alunos[posicao];
    }

    public void removerAluno(int posicao) {
        this.alunos[posicao] = null;
    }

    public boolean existeAluno(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }
}

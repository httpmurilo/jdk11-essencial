package io.murilo.estruturadedados.ArmazenamentoSequencial;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];

    private  Integer TOTAL = 0;

    public void adicionarAluno(int posicao, Aluno aluno) {
        //adiciona o aluno na posicao, o aluno que ja está na posicao sobe uma posicao
        for(int i = TOTAL -1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;

    }

    public void adicionarAluno(Aluno aluno) {
//        for (int i=0; i< alunos.length; i++) {
//            if(alunos[i] == null) {
//                alunos[i] = aluno;
//                break;
//            }
//        }
        this.alunos[TOTAL] = aluno;
        TOTAL = TOTAL + 1;
    }

    public Aluno pegarPosicao(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < TOTAL;
    }

    public void removerAluno(int posicao) {
        for(int i = posicao; i< this.TOTAL; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        TOTAL --;
    }

    public boolean existeAluno(Aluno aluno) {
        for (Aluno value : alunos) {
            if (aluno.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return TOTAL;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }
}

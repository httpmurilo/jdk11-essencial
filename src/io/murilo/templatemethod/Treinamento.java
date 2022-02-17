package io.murilo.templatemethod;

public abstract class Treinamento {
    void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    protected abstract void preparoFisico();

    protected abstract void jogoTreino();

    protected abstract void treinoTatico();
}

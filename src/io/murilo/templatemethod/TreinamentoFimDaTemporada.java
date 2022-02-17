package io.murilo.templatemethod;

public class TreinamentoFimDaTemporada extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino");
    }
}

package io.murilo.estruturadedados.linkedList;

/**
 *
 * Classe que representa uma célula (container) onde
 * teremos o objeto (valor) e uma celula que sera
 * a ligação para o proximo
 */
public class Celula {
    //cada elemento do array [0][1] é uma celula nesse cenario
    private Object elemento;
    private Celula proximo;

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    private Celula anterior;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula (Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento) {
        this(elemento, null);
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

}

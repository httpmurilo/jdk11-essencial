package io.murilo.estruturadedados.linkedList;

public class ListaLigada {

    private Celula ultima = null;
    private Celula primeira = null;
    private Integer total = 0;

    /**
     * Metodo que adiciona um elemento no começo da lista
     * @param elemento
     */
    public void adicionarNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, this.primeira);
        this.primeira = nova;

        if(this.total == 0) {
            //se o total for 0 significa que não tem elementos, então primeiro e ultimo tem o mesmo objeto
            this.ultima = this.primeira;
        }

        this.total = this.total + 1;
    }

    /**
     * Metodo que adiciona um elemento no final da lista
     * @param elemento
     */
    public void adicionar(Object elemento) {

        if(this.total == 0) {
            //se a lista esta vazia, adiciona no começo
            this.adicionarNoComeco(elemento);
        } else  {
            // aponta para o novo elemento, e move a proxima para null
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.total = this.total + 1;
        }
    }

    /**
     * Metodo que adiciona um elemento no meio da lista de acordo com a posição
     * @param posicao
     * @param elemento
     */
    public void adicionar(int posicao, Object elemento) {
        //resolve o problema da primeira e a ultima posicao
        if(posicao == 0) {
            this.adicionarNoComeco(elemento);
        } else if (posicao == this.total) {
            this.adicionar(elemento);
        }
        //se caso não for a ultima ou primeira posição

        Celula anterior = this.pegarCelula(posicao -  1);
        Celula nova = new Celula(elemento, anterior.getProximo());
        anterior.setProximo(nova);
        this.total = this.total + 1;

    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    private Celula pegarCelula(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw  new IllegalArgumentException("Posicao inexistente");
        }
        Celula atual = this.primeira;

        for(int i=0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public Object obter(int posicao) {
        return this.pegarCelula(posicao).getElemento();
    }

    public void remover(int posicao) {
    }

    public void removerDoComeço(int posicao) {
        if(this.total ==0) {
            throw new IllegalArgumentException("Lista vazia");
        }

        this.primeira = this.primeira.getProximo();
        this.total = total  - 1;

        if(this.total == 0) {
            this.ultima = null;
        }
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contemElemento(Object obj) {
        return false;
    }

    @Override
    public String toString() {
       if(total == 0) {
           return "[]";
       }
       Celula atual = primeira;
       StringBuilder builder = new StringBuilder("[");

       for(int i=0; i < total; i++) {
           builder.append(atual.getElemento());
           builder.append(",");

           atual = atual.getProximo();
       }
       builder.append("]");
       return builder.toString();
    }
}

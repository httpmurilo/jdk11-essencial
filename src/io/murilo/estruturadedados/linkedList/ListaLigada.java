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
//        metodo que atende somente o cenário da lista encadeada, não atende o cenário de listas duplamentes encadeadas
//        Celula nova = new Celula(elemento, this.primeira);
//        this.primeira = nova;
//
//        if(this.total == 0) {
//            //se o total for 0 significa que não tem elementos, então primeiro e ultimo tem o mesmo objeto
//            this.ultima = this.primeira;
//        }
//
//        this.total = this.total + 1;

        if(this.total == 0) {
            // a gente so tem uma celula, então ela vai ser a primeira e a ultima
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            //instancia uma nva celula
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
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
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
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

        Celula proxima = anterior.getProximo();

        Celula nova = new Celula(elemento, anterior.getProximo());

        anterior.setProximo(nova);
        nova.setAnterior(anterior);
        proxima.setAnterior(nova);
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
        //se so tiver um elemento
        if(posicao == 0 ) {
            this.removerDoComeço();
            //se for o ultimo elemento
        } else if (posicao == this.total -1) {
            this.removerDoFim();
        } else {
            //se for um elemento do meio
            Celula anterior = this.pegarCelula(posicao -1);
            Celula atual = anterior.getProximo();
            Celula proximo = atual.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);

            this.total = this.total -1;

        }
    }

    public void removerDoFim() {
        if(this.total == 1) {
            this.removerDoComeço();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.total = this.total - 1;
        }
    }

    public void removerDoComeço() {
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
        Celula atual = this.primeira;

        while(atual != null) {
           if(atual.getElemento().equals(obj)) {
               return true;
           }
           atual = atual.getProximo();
        }
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

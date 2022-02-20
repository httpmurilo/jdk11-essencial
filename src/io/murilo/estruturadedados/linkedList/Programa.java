package io.murilo.estruturadedados.linkedList;

public class Programa {
    public static void main(String[] args) {
        var lista = new ListaLigada();

        lista.adicionar("Murilo");
        System.out.println(lista);

        lista.adicionar("Maria");
        System.out.println(lista);

        lista.adicionarNoComeco("Artur");
        System.out.println(lista);

        lista.adicionar(1,"Xuxa");
        System.out.println(lista);

        System.out.println("Pegando elemento");
        Object ret = lista.obter(1);
        System.out.println(ret);

        System.out.println("Total");
        System.out.println(lista.tamanho());

    }
}

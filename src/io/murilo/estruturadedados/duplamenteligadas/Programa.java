package io.murilo.estruturadedados.duplamenteligadas;

import io.murilo.estruturadedados.linkedList.ListaLigada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adicionar("Angelina");

        System.out.println(lista);

        lista.adicionar("Artur");

        System.out.println(lista);

        lista.remover(0);
        System.out.println("Remove o primeiro elemento");
        System.out.println(lista);

        System.out.println(lista.contemElemento("Artur"));
    }
}

package io.murilo.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        nomes.add("Murilo");
        nomes.add("Paulo");
        nomes.add("Artur");

        nomes.forEach(System.out::println);
    }
}

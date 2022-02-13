package io.murilo.vetores;

import javax.swing.*;
import java.util.Arrays;

public class Programa14 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i <5 ;i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

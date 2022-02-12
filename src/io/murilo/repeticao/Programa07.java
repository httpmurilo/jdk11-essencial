package io.murilo.repeticao;

import javax.swing.*;
import java.util.Scanner;

//While
public class Programa07 {
    public static void main(String[] args) {

        int idade =1;

        Scanner teclado = new Scanner(System.in);

        //checka o valor antes de executar o bloco
        while(idade > 0) {
            System.out.println("informe o seu nome");
            var nome = teclado.nextLine();

            System.out.println("informe a sua idade");
            idade = Integer.parseInt(teclado.nextLine());
            JOptionPane.showMessageDialog(null, "A pessoa tem "+ idade +  "anos " + " e o nome é " + nome);
        }


        teclado.close();
    }
}

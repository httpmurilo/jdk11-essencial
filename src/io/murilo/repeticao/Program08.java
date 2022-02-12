package io.murilo.repeticao;

import javax.swing.*;
import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int idade;
            //Primeira executa o bloco e depois checka
            do {
                idade = 10;
                System.out.println("informe o seu nome");
                var nome = teclado.nextLine();

                System.out.println("informe a sua idade");
                idade = Integer.parseInt(teclado.nextLine());
                JOptionPane.showMessageDialog(null, "A pessoa tem "+ idade +  "anos " + " e o nome é " + nome);
            } while (idade >0);
                teclado.close();
        }
}

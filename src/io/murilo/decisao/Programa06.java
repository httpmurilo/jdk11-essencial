package io.murilo.decisao;

import javax.swing.*;

public class Programa06 {
    public static void main(String[] args) {
        String numeroInformado = JOptionPane.showInputDialog("Informe um numero");
        switch (Integer.parseInt(numeroInformado)) {
            case 0:
                JOptionPane.showMessageDialog(null,"O numero é 0");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O numero é 3");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O numero é 5");
                break;
            default:
                JOptionPane.showMessageDialog(null,"O numero é " + numeroInformado);
                break;
        }

    }
}

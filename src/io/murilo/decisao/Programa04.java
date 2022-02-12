package io.murilo.decisao;

import javax.swing.*;

public class Programa04 {

    public static void main(String[] args) {

        String numeroInformado = JOptionPane.showInputDialog("Informe um numero");
        var numero = Integer.parseInt(numeroInformado);

        if(numero > 5) {
            JOptionPane.showMessageDialog(null,"Sim o numero " + numero + "é maior do que 5");
        } else if(numero == 5){
            JOptionPane.showMessageDialog(null, "O numero é 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nao, o numero " + numero + "não é maior do que 5");
        }
    }
}

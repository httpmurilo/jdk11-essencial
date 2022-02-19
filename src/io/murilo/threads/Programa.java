package io.murilo.threads;

public class Programa {

    public static void main(String[] args) {
        var barra = new BarraDeProgresso();

        Thread t1 = new Thread(barra);
        t1.start();


        var relatorio = new Relatorio();

        Thread t2 = new Thread(relatorio);
        t2.start();


    }
}

package io.murilo.threads;

public class Relatorio implements Runnable {


    @Override
    public void run() {
        for(int i = 0; i < 100000000; i++) {
            System.out.println("Relatorio...aguarde");
        }
    }
}

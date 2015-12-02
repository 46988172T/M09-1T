package UF2_NF2_P03;

/**
 * Created by 46988172t on 02/12/15.
 */

import UF2_NF2_P03.Controller;

public class Threads extends Thread {
    public static int contador = 0;

    public Threads() {
    }

    public void run() {
        Controller.insertarNumero();
        System.out.print("Thread " + contador + " - ");
        ++contador;
    }
}
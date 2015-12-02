package UF2_NF2_P03;

/**
 * Created by 46988172t on 02/12/15.
 */

import java.util.Scanner;


import UF2_NF2_P03.Threads;


public class Controller {
    public static Thread[] arrayThreads;
    public static int posicion = 0;
    public static int[] numeros = new int[1000];
    public static int threads;
    public static int numerosThread;

    public Controller() {
    }

    public static void main(String[] args) {
        while(true) {
            Scanner contThreads = new Scanner(System.in);
            System.out.println("Introduce número divisible entre 1000");
            threads = contThreads.nextInt();
            if(1000 % threads == 0) {
                arrayThreads = new Threads[threads];
                numerosThread = 1000 / threads;

                int var3;
                for(var3 = 0; var3 < threads; ++var3) {
                    arrayThreads[var3] = new Threads();
                }

                for(var3 = 0; var3 < threads; ++var3) {
                    for(int contNumeros = 0; contNumeros < numerosThread; ++contNumeros) {
                        arrayThreads[var3].run();
                        System.out.println("El thread " + var3 + " ha guardado el número " + numeros[posicion] + " en la posición " + posicion + "\n");
                        ++posicion;
                    }
                }

                return;
            }

            System.out.println("Error en el número. Debes introducir un número divisible entre 1000");
        }
    }

    public static void insertarNumero() {
        numeros[posicion] = (int)(Math.random() * 1000.0D + 1.0D);
    }

    public static int[] getArrayNumeros() {
        return numeros;
    }

    public static Thread[] getArrayThreads() {
        return arrayThreads;
    }

    public static int getIndex() {
        return posicion;
    }

    public static int getNombresPerFil() {
        return numerosThread;
    }

    public static int getNumThreads() {
        return threads;
    }

    public static void setArrayNumeros(int[] arrayNumeros) {
        numeros = arrayNumeros;
    }

    public static void setArrayThreads(Thread[] arrayThreads) {
        arrayThreads = arrayThreads;
    }

    public static void setIndex(int index) {
        posicion = index;
    }

    public static void setNombresPerFil(int nombresPerFil) {
        numerosThread = nombresPerFil;
    }

    public static void setNumThreads(int numThreads) {
        threads = numThreads;
    }
}

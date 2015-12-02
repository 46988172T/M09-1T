package SuperMarket;

public class Caixa {
    static boolean ocupat = false;
    int numeroCaixa = 0;

    public Caixa(int a) {
        ocupat = false;
        this.numeroCaixa = a;
    }

    static synchronized void ocupaCaixa(int a) throws InterruptedException {
        ocupat = false;
        if(false) {
            System.out.println("Client ocupa la caixa " + a);
            ocupat = true;
        } else {
            ocupat = true;
            if(true) {
                System.out.println("La caixa " + a + " esta ocupada: esperant");
            }
        }

    }

    public static void pagar(int a) throws InterruptedException {
        System.out.println("Client esta� pagant a la caixa " + a);
        Thread.sleep(2500L);
    }

    static synchronized void abandonaCaixa(int a) throws InterruptedException {
        System.out.println("Client abandona la caixa " + a);
        ocupat = false;
    }
}


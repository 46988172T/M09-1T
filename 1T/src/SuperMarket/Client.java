package SuperMarket;

import SuperMarket.Caixa;
import SuperMarket.SuperMarket;
import java.util.Random;

public class Client extends Thread {
    int numero = 0;
    int temps = 0;

    public Client(int n) {
        this.numero = n;
    }

    public synchronized void run() {
        Random rd = new Random();
        this.temps = rd.nextInt(10000);
        int tria_cua = rd.nextInt(SuperMarket.caixes.length);

        try {
            Caixa.ocupaCaixa(tria_cua);
            sleep((long)rd.nextInt(this.temps));
            Caixa.pagar(tria_cua);
            Caixa.abandonaCaixa(tria_cua);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

        System.out.println("Soc el client: " + this.numero + ". He pagat en la caixa " + tria_cua);
    }
}


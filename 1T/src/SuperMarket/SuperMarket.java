package SuperMarket;

import SuperMarket.Caixa;
import SuperMarket.Client;
import java.util.Scanner;

public class SuperMarket {
    public static Caixa[] caixes = new Caixa[2];

    public SuperMarket() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de clients:");
        int clients = entrada.nextInt();

        for(int i = 0; i <= clients; ++i) {
            Client cliente = new Client(i);
            cliente.start();
        }

        entrada.close();
    }
}

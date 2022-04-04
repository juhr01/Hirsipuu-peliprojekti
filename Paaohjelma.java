
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Peli peli = new Peli();
        Scanner lukija = new Scanner(System.in);

        Kayttoliittyma ui = new Kayttoliittyma(peli, lukija);
        ui.kaynnista();
    }
}
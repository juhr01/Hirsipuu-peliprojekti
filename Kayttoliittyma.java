import java.util.Scanner;

public class Kayttoliittyma {
    static Peli peli;//tämä muutettu static
    static Sanalista sanalista;
    private Scanner lukija;

    public Kayttoliittyma(Peli peli, Scanner lukija) {
        sanalista = new Sanalista();
        Kayttoliittyma.peli = peli;
        this.lukija = lukija;
    }

    public void kaynnista() {
        System.out.println("Tervetuloa pelaamaan hirsipuupeliä!");
        System.out.println("Komennot:");
        System.out.println("lisaa - Lisää sanan, tyhjä lopettaa");
        System.out.println("aloita - Aloittaa arvaamis-vaiheen");
        System.out.println("uusinta - Aloittaa uuden pelin");
        System.out.println("lopeta - Lopettaa pelin");

        while (true) {

            String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                System.out.println("Peli lopetettu.");
                break;
            }
            if (syote.equals("lisaa")) {
                while (true) {
                    System.out.println("");
                    System.out.println("Lisättävä sana: (tyhjä lopettaa lisäys-vaiheen)");
                    String lisattava = lukija.nextLine();

                    if (lisattava.equals("")) {
                        break;
                    }
                    sanalista.lisaa(lisattava);
                }

            }
            if (syote.equals("aloita")) {
                if (sanalista.listallaSanoja()) {
                    Kayttoliittyma.peli.aloitaPeli();
                    System.out.println("\nKomennot:");
                    System.out.println("lisaa - Lisää sanan, tyhjä lopettaa");
                    System.out.println("aloita - Aloittaa arvaamis-vaiheen");
                    System.out.println("uusinta - Aloittaa uuden pelin");
                    System.out.println("lopeta - Lopettaa pelin");
                    continue;
                }
            }
            if (syote.equals("uusinta")) {
                sanalista.tyhjenna();
                kaynnista();
               
                System.out.println("");
            }
        }
    }
}
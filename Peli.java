import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Peli {

    private int laskuri;
    private String viivat;
    private String arvattavaSana;
    private Scanner lukija;
   // private Tulosta tulosta;
    private boolean sanaArvattu;
    private Set<String> aiemmatArvaukset;

    public Peli() {
        this.laskuri = 0;
        this.lukija = new Scanner(System.in);
        this.aiemmatArvaukset = new HashSet<>();
    }

    public void aloitaPeli() {
        nollaaLaskuri();
        nollaaAiemmatArvaukset();
        this.arvattavaSana = Kayttoliittyma.sanalista.arvoSana();
        this.viivat = new String(new char[this.arvattavaSana.length()]).replace("\0", "_");
        this.sanaArvattu = false;
        sanaViivoina();
        while (true) {
            System.out.println("Arvaa kirjain: ");
            String arvaus = lukija.nextLine();
            System.out.println("");
            arvaa(arvaus);
            System.out.println("");
            if (this.sanaArvattu == true || getVaaratArvaukset() >= 8) {
                break;
            }
        }
    }

    public void arvaa(String arvaus) {
        String tarkistus = "";
        if ((this.aiemmatArvaukset.contains(arvaus)) == false && !arvaus.isBlank()) {

            if (arvaus.length() < 2 && this.viivat.contains("_")) {

                for (int i = 0; i < this.arvattavaSana.length(); i++) {
                    if (this.arvattavaSana.charAt(i) == arvaus.toUpperCase().charAt(0)) {
                        tarkistus += arvaus.toUpperCase().charAt(0);
                    } else if (this.viivat.charAt(i) != '_') {
                        tarkistus += this.arvattavaSana.charAt(i);
                    } else {
                        tarkistus += "_";
                    }
                }

                if (this.viivat.toUpperCase().equals(tarkistus.toUpperCase())) {
                    this.laskuri++;
                    Tulosta.tulosta();
                } else {
                    this.viivat = tarkistus.toUpperCase();
                }
            }

            this.aiemmatArvaukset.add(arvaus);
            System.out.println(this.viivat);

            if (this.viivat.equals(this.arvattavaSana)) {
                System.out.println("\nOikein! Arvasit sanan " + this.arvattavaSana + "!\n");
                this.sanaArvattu = true;
            }
        } else if (arvaus.isBlank()) {
            System.out.println("Arvaa jokin kirjain!\n");
            System.out.println(this.viivat);
        } else if (arvaus.length() > 1 || (this.aiemmatArvaukset.contains(arvaus) && arvaus.length() > 1)) {
            System.out.println("Arvaa ainoastaan yksittäisiä kirjaimia!\n");
            System.out.println(this.viivat);
        } else if (this.aiemmatArvaukset.contains(arvaus)) {
            System.out.println("Olet jo arvannut kirjaimen " + arvaus + "!\n");
            System.out.println(this.viivat);
        } else {
            System.out.println("\n");
        }
    }

    public void sanaViivoina() {
        System.out.println(this.viivat);
    }

    public String getSanaViivoina() {
        return this.viivat;
    }

    public int getVaaratArvaukset() {
        return this.laskuri;
    }

    public void nollaaLaskuri() {
        this.laskuri = 0;
    }

    public void nollaaAiemmatArvaukset() {
        this.aiemmatArvaukset.clear();
    }
}
// Nice code bro
// thanks bro
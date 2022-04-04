import java.util.ArrayList;
import java.util.Random;

public class Sanalista {
    private ArrayList<String> sanalista;
    private String arvattavaSana;
    private Random random;

    public Sanalista() {
        this.sanalista = new ArrayList<>();
        this.random = new Random();
        this.arvattavaSana = "";
    }

    public void tulostaLista() {
        for (int i = 0; i < this.sanalista.size(); i++) {
            System.out.println(this.sanalista.get(i));
        }
    }

    public boolean listallaSanoja() {
        if (this.sanalista.size() >= 1) {
            return true;
        }

        System.out.println("Listalla on oltava vähintään yksi sana!");
        return false;
    }

    public void lisaa(String sana) {
        this.sanalista.add(sana);
    }

    public void tyhjenna() {
        this.sanalista.clear();
    }

    public String arvoSana() {
        if (listallaSanoja()) {
            this.arvattavaSana = this.sanalista.get(random.nextInt(this.sanalista.size()));
            return this.arvattavaSana.toUpperCase();
        }

        return this.arvattavaSana;
    }

    public void tulostaSana() {
        System.out.println(this.arvattavaSana);
    }
}

public class Tulosta {
    //private int laskuri;
   // private static Peli peli;

  /*  public Tulosta (Peli peli){
        this.laskuri = laskuri;
        this.peli = peli;

    }*/

    //public void tulosta(int laskuri){
    public static void tulosta() {
        if (Kayttoliittyma.peli.getVaaratArvaukset() == 1) {
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 2){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println();
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 3){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 4){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 5){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 6){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |        |");
            System.out.println("  |        |");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 7){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |       /| \\");
            System.out.println("  |      / |  \\");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
            System.out.println();
        } else if (Kayttoliittyma.peli.getVaaratArvaukset() == 8){
            System.out.println("Hävisit!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |       /| \\");
            System.out.println("  |      / |  \\");
            System.out.println("  |        |");
            System.out.println("  |       / \\");
            System.out.println("  |      /   \\");
            System.out.println("__|__ ");
            System.out.println();
        }
        
    }
}
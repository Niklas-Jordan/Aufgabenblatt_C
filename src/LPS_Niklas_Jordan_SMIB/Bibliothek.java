package LPS_Niklas_Jordan_SMIB;

/**
 * The type Bibliothek.
 */
public class Bibliothek {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Medium[] autoMed = new Medium[4];
        autoMed[0] = new Buch(2004, "Bibliographisches Institut, Mannheim", "3-411-01013-0", "-", "Duden 01. Die deutsche Rechtschreibung");
        autoMed[1] = new CD("Apple (Bea (EMI)", "The Beatles", "1");
        autoMed[2] = new Zeitschrift("0038-7452", 54, 6, "Der Spiegel");
        autoMed[3] = new ElektronischesMedium("http://www.hochschule-stralsund.de", "Hochschule Stralsund");

        for (int i = 0; i < 4; i++)
            System.out.println(autoMed[i].calculateRepresentation());

        for (Medium medium : autoMed) {
            System.out.println(medium.calculateRepresentation());
        }
    }
}


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
        Zettelkasten zettelkasten = new Zettelkasten();

        zettelkasten.addMedium(new Buch(2004, "Bibliographisches Institut, Mannheim", "3-411-01013-0", "-", "Duden 01. Die deutsche Rechtschreibung"));
        zettelkasten.addMedium(new CD("Apple (Bea (EMI)", "The Beatles", "1"));
        zettelkasten.addMedium(new Zeitschrift("0038-7452", 54, 6, "Der Spiegel"));
        zettelkasten.addMedium(new ElektronischesMedium("http://www.hochschule-stralsund.de", "Hochschule Stralsund"));

        zettelkasten.sort(true); //Aufgabe C5

        for (Medium data : zettelkasten) {
            System.out.println(data.calculateRepresentation());
        }
    }
  }

package LPS_Niklas_Jordan_SMIB;

import java.util.ArrayList;

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
        ArrayList <Medium> myZettelkasten = new ArrayList<>();
        myZettelkasten.add(new Buch(2004, "Bibliographisches Institut, Mannheim", "3-411-01013-0", "-", "Duden 01. Die deutsche Rechtschreibung"));
        myZettelkasten.add(new CD("Apple (Bea (EMI)", "The Beatles", "1"));
        myZettelkasten.add(new Zeitschrift("0038-7452", 54, 6, "Der Spiegel"));
        myZettelkasten.add(new ElektronischesMedium("http://www.hochschule-stralsund.de", "Hochschule Stralsund"));

//TODO: Ueberarbeiten, unvollstaendig/ fehlerhaft
        for (int i = 0; i < 4; i++)
            System.out.println(myZettelkasten);

        for (Medium : myZettelkasten) {
            System.out.println(myZettelkasten);
        }


    }
}

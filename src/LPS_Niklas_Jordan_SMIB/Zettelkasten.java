package LPS_Niklas_Jordan_SMIB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * The type Zettelkasten.
 * In Zusammenarbeit mit Florian Eimann
 */
public class Zettelkasten implements Iterable<Medium> {
    /**
     * The My zettelkasten.
     */
    ArrayList<Medium> myZettelkasten = new ArrayList<>();

    public Iterator iterator() {
        return myZettelkasten.iterator();
    }

    /**
     * Add medium boolean.
     * fügt Daten/Medien ohne Reihenfolge/ Sortierung zur Arraylist hinzu
     * @param data the data
     * @return boolean
     */
    boolean addMedium(Medium data) {
        myZettelkasten.add(data);
        order = null;
        return true;
    }

    /**
     * Drop medium.
     * Programm vergleicht Titel, sobald sich ein Titel doppelt, wird die Exception ausgegeben
     * Sollte der gesuchte Titel nicht vorhanden sein in der Arraylist, wird dies auch zurückgegben
     * @param titel the titel
     * @throws DuplicateEntryException the duplicate entry exception
     */
    public void dropMedium(String titel)throws DuplicateEntryException {
        ArrayList<Medium> copies = new ArrayList<>();
        int data = 0;
        for (Medium test : myZettelkasten) {

            if (test.getTitel() == titel) {
                copies.add(test);
                data++;
                if(copies.size()>1){
                    throw new DuplicateEntryException("DuplicateEntryExeption\n");
                }
            }else if(!myZettelkasten.contains(findSoloMedium(titel))) {
                System.out.println("Titel existiert nicht!\n");
                break;
            }else{
            }
        }
        if(data > 0 && data < 2){
            myZettelkasten.remove(copies.get(0));
        }
    }

    /**
     * Drop medium boolean.
     * bestätigt man in der Main diese Aussage mit "ja", wird der gesammte Inhalt der Arraylist gelöscht, wo die Kopien reingestellt werden
     * @param titel       the titel
     * @param alleLöschen the alle löschen
     * @return the boolean
     */
    public boolean dropMedium(String titel, String alleLöschen) {
        if(alleLöschen == "ja") {
            boolean gelöscht = false;
            for (Medium data : findMedium(titel)) {
                gelöscht |= myZettelkasten.remove(data);
            }
            return gelöscht;
        } else {
            System.out.println("Geben sie 'ja' ein, um alle Dublikate zu löschen!");
        }
        return true;
    }

    private Boolean order = null;

    /**
     * Sort boolean.
     * sortiert die Liste alphabetisch aufsteigend, wenn aufsteigend = true, ansonsten alphabetisch absteigend
     * @param aufsteigend the aufsteigend
     * @return the boolean
     */
    boolean sort(boolean aufsteigend) {
        if (aufsteigend == true) {
            if (order != null && order) {
                return false;
            } else {
                Collections.sort(myZettelkasten);
            }
        } else {
            if (order != null && !order) {
                return false;
            }
            myZettelkasten.sort(Collections.reverseOrder());
        }
        return true;
    }

    /**
     * Find solo medium medium.
     * findet einzelnes Medium anhand des eingegebenen Titels
     * @param titel the titel
     * @return the medium
     */
    public Medium findSoloMedium(String titel) {
        for (Medium data : myZettelkasten) {
            if (data.getTitel().equals(titel)) {
                return data;
            }
        }
        return null;
    }

    /**
     * Find medium list.
     * Fügt die Daten/Medien anhand ihrer Titel einer Arraylist hinzu und gibt sie in der unten definierten Reihenfolge in der Konsole aus
     * @param titel the titel
     * @return the list
     */
    public List<Medium> findMedium(String titel) {
        int i = 0;
        List<Medium> copies = new ArrayList<>();
        List<Medium> copiesSorted = new ArrayList<>();
        List<Medium> Zeitschrift = new ArrayList<>();
        List<Medium> CD = new ArrayList<>();
        List<Medium> Buch = new ArrayList<>();
        List<Medium> ElektronischesMedium = new ArrayList<>();

        for(Medium data : myZettelkasten) {
            if(data.getTitel().equals(titel)) {
                copies.add(data);
                if(data.getClass().getName() == "com.LPS_SMIB_Niklas_Jordan_SMIB.Zeitschrift") {
                    Zeitschrift.add(data);
                }else if(data.getClass().getName() == "com.LPS_SMIB_Niklas_Jordan_SMIB.CD") {
                    CD.add(data);
                }else if(data.getClass().getName() == "LPS_SMIB_Niklas_Jordan_SMIB.Buch") {
                    Buch.add(data);
                }else if(data.getClass().getName() == "LPS_SMIB_Niklas_Jordan_SMIB.ElektronischesMedium") {
                    ElektronischesMedium.add(data);
                } else {
                    i++;
                }
            }
        }
        copiesSorted.addAll(Zeitschrift);
        copiesSorted.addAll(CD);
        copiesSorted.addAll(Buch);
        copiesSorted.addAll(ElektronischesMedium);

        return copiesSorted;
    }
}

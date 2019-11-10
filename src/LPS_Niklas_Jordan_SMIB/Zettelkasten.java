package LPS_Niklas_Jordan_SMIB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zettelkasten implements Iterable<Medium> {
    ArrayList<Medium> myZettelkasten = new ArrayList<>();

    public Iterator iterator() {
        return myZettelkasten.iterator();
    }

    boolean addMedium(Medium data) {
        myZettelkasten.add(data);
        order = null;
        return true;
    }

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

    public boolean dropMedium(String titel, int index) throws DuplicateEntryException {
        ArrayList<Medium> copies = new ArrayList<>();
        for(Medium data : myZettelkasten) {
            if(data.getTitel() == titel) {
                copies.add(data);
            }
        }
        myZettelkasten.remove(copies.get(index));
        System.out.println(copies);
        return true;
    }

    public boolean dropMedium(String titel, String alleLöschen) {
        if(alleLöschen == "ja") {
            boolean gelöscht = false;
            for (Medium data : findMedium(titel)) {
                gelöscht |= myZettelkasten.remove(data);
            }
            return gelöscht;
        } else {
            System.out.println("Geben sie 'ja' ein, um alle Duplikate zu löschen!");
        }
        return true;
    }

    private Boolean order = null;

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

    public Medium findSoloMedium(String titel) {
        for (Medium data : myZettelkasten) {
            if (data.getTitel().equals(titel)) {
                return data;
            }
        }
        return null;
    }

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
                if(data.getClass().getName() == "Zeitschrift") {
                    Zeitschrift.add(data);
                }else if(data.getClass().getName() == "com.company.CD") {
                    CD.add(data);
                }else if(data.getClass().getName() == "com.company.Buch") {
                    Buch.add(data);
                }else if(data.getClass().getName() == "com.company.ElektronischesMedium") {
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

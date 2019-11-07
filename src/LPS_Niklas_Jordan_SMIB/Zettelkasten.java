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
        return true;
    }

    public boolean dropMedium(String titel) {
        return myZettelkasten.remove(findMedium(titel));
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
        List<Medium> copies = new ArrayList<>();
        for (Medium data : myZettelkasten) {
            if (data.getTitel().equals(titel)) {
                copies.add(data);
            }
        }
        return copies;
    }
}

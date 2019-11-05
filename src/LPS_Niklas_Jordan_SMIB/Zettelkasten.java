package LPS_Niklas_Jordan_SMIB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class Zettelkasten implements Iterator {
    private ArrayList<Medium> myZettelkasten = new ArrayList<>();

    public boolean AddMedium(Medium data) {
        myZettelkasten.add(data);
        return true;
    }
//TODO: Flo fragen, was geaendert werden muss
    public boolean DropMedium(String titel) {
        for (Medium data : myZettelkasten) {
            if (data.getTitel().equals(data)) {
                myZettelkasten.remove(data);
            }
        }
        return false;
    }
//TODO: Ueberarbeiten, unvollstaendig
    public boolean Sort(boolean aufsteigend) {
        if (aufsteigend) {
            Collections.sort(myZettelkasten);
        } else {
            Collections.sort(myZettelkasten);
        }
        return true;
    }

    public Medium FindMedium(String titel) {
        for (Medium data : myZettelkasten) {
            if (data.getTitel().equals(data)) {
                return data;
            }
        }
        return null;
    }
}

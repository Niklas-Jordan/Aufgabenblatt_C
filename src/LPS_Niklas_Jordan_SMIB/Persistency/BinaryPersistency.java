package LPS_Niklas_Jordan_SMIB.Persistency;

import LPS_Niklas_Jordan_SMIB.Zettelkasten;

import java.io.*;

/**
 * The type Binary persistency.
 */
public class BinaryPersistency implements Persistency {

    public void save(Zettelkasten zk, String dateiname) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dateiname))) {
            out.writeObject(zk);
        }
    }

    public Zettelkasten load(String dateiname) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(dateiname))) {
        } return null;
    }
}

package LPS_Niklas_Jordan_SMIB;

import LPS_Niklas_Jordan_SMIB.Zettelkasten;
import LPS_Niklas_Jordan_SMIB.Medium;

import java.io.*;

public class BinaryPersistency implements Persistency{

    @Override
    public void save(Zettelkasten zk, String dateiname) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dateiname)) {
                out.writeObject(zk);
        }
    }

    @Override
    public Zettelkasten load(String dateiname) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(dateiname))) {
        } return null;
    }
}

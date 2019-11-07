package LPS_Niklas_Jordan_SMIB.Persistency;

import LPS_Niklas_Jordan_SMIB.Medium;
import LPS_Niklas_Jordan_SMIB.Persistency.Persistency;
import LPS_Niklas_Jordan_SMIB.Zettelkasten;

import java.io.*;


public class HumanReadablePersistency implements Persistency {

    public void save(Zettelkasten zk, String dateiname) throws IOException {
        try(BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dateiname), "UTF-8"))) {
            for (Medium data : zk) {
                out.write(data.calculateRepresentation());
            }
        }
    }

    public Zettelkasten load(String dateiname) throws IOException {
        throw new UnsupportedOperationException("Operation ungültig!");
    }
}

package LPS_Niklas_Jordan_SMIB;

import LPS_Niklas_Jordan_SMIB.Zettelkasten;
import LPS_Niklas_Jordan_SMIB.Medium;

import java.io.*;


public class HumanReadablePersistency implements Persistency {

    @Override
    public void save(Zettelkasten zk, String dateiname) throws IOException {
        try(BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dateiname), "UTF-8"))) {
            for (Medium data : zk) {
                out.write(data.calculateRepresentation());
            }
        }
    }

    @Override
    public Zettelkasten load(String dateiname) throws IOException {
        throw new UnsupportedOperationException("Operation ungültig!");
    }
}

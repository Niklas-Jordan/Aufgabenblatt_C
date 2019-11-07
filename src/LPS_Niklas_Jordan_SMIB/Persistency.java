package LPS_Niklas_Jordan_SMIB;

import LPS_Niklas_Jordan_SMIB.Zettelkasten;
import java.io.IOException;

public interface Persistency {
    void save(Zettelkasten zk, String dateiname) throws IOException;
    Zettelkasten load(String dateiname) throws IOException;
}

package LPS_Niklas_Jordan_SMIB.Persistency;

import LPS_Niklas_Jordan_SMIB.Zettelkasten;
import java.io.IOException;

/**
 * The interface Persistency.
 */
public interface Persistency {
    /**
     * Save.
     *
     * @param zk        the zk
     * @param dateiname the dateiname
     * @throws IOException the io exception
     */
    void save(Zettelkasten zk, String dateiname) throws IOException;

    /**
     * Load zettelkasten.
     *
     * @param dateiname the dateiname
     * @return the zettelkasten
     * @throws IOException the io exception
     */
    Zettelkasten load(String dateiname) throws IOException;
}

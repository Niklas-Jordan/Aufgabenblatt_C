package LPS_Niklas_Jordan_SMIB;

/**
 * The type Zeitschrift.
 */
public class Zeitschrift extends Medium{
    private String ISSN;
    private int Volume;
    private int Nummer;

    /**
     * Instantiates a new Zeitschrift.
     *
     * @param _ISSN   the issn
     * @param _Volume the volume
     * @param _Nummer the nummer
     * @param _Titel  the titel
     */
    public Zeitschrift(String _ISSN, int _Volume, int _Nummer, String _Titel){
        super(_Titel);
        this.ISSN = _ISSN;
        this.Volume = _Volume;
        this.Nummer = _Nummer;
    }

    /**
     * Get issn string.
     *
     * @return the string
     */
    public String getISSN(){
        return ISSN;
    }

    /**
     * Get volume int.
     *
     * @return the int
     */
    public int getVolume(){
        return Volume;
    }

    /**
     * Get nummer int.
     *
     * @return the int
     */
    public int getNummer(){
        return Nummer;
    }

    /**
     * Set issn.
     *
     * @param ISSN the issn
     */
    public void setISSN(String ISSN){
        this.ISSN = ISSN;
    }

    /**
     * Sets volume.
     *
     * @param volume the volume
     */
    public void setVolume(int volume) {
        Volume = volume;
    }

    /**
     * Sets nummer.
     *
     * @param nummer the nummer
     */
    public void setNummer(int nummer) {
        Nummer = nummer;
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Titel: ")
                .append(getTitel())
                .append("\n")
                .append("ISSN: ")
                .append(getISSN())
                .append("\n")
                .append("Volume: ")
                .append(getVolume())
                .append("\n")
                .append("Nummer: ")
                .append(getNummer())
                .toString();
    }
}

package LPS_Niklas_Jordan_SMIB;

/**
 * The type Medium.
 */
public abstract class Medium {
    /**
     * The Titel.
     */
    public String Titel;


    /**
     * Instantiates a new Medium.
     *
     * @param _Titel the titel
     */
    public Medium(String _Titel) {
        this.Titel = _Titel;
    }

    /**
     * Get titel string.
     *
     * @return string string
     */
    public String getTitel(){
        return Titel;
    }

    /**
     * Sets titel.
     *
     * @param Titel the titel
     */
    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    /**
     * Calculate representation string.
     *
     * @return the string
     */
    public abstract String calculateRepresentation();
}
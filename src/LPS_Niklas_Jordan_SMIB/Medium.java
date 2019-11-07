package LPS_Niklas_Jordan_SMIB;

/**
 * The type Medium.
 */
public abstract class Medium implements Comparable<Medium>{

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
        setTitel(Titel);
    }

    /**
     * Get titel string.
     *
     * @return string string
     */
    public String getTitel() {
        return Titel;
    }

    /**
     * Sets titel.
     *
     * @param Titel the titel
     */
    //TODO: setTitel Fehlermeldung/ Exception schreiben
    public void setTitel(String Titel) {
        if (Titel == null){
            System.out.println("Titel existiert nicht!");
        } else {
            this.Titel = Titel;
        }
    }

    /**
     * Calculate representation string.
     *
     * @return the string
     */
    public abstract String calculateRepresentation();

    /**
     * @param data
     * @return
     */
//TODO: Ueberarbeiten, unvollstaendig
    @Override
    public int compareTo(Medium data) {
        return this.getTitel().compareTo(data.getTitel());
    }
}
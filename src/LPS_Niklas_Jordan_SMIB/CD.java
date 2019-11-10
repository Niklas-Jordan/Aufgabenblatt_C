package LPS_Niklas_Jordan_SMIB;

/**
 * The type Cd.
 */
public class CD extends Medium {
    private String Label;
    private String Kuenstler;

    /**
     * Instantiates a new Cd.
     *
     * @param _Label     the label
     * @param _Kuenstler the kuenstler
     * @param _Titel     the titel
     */
    public CD(String _Label, String _Kuenstler, String _Titel) {
        super(_Titel);
        this.Label = _Label;
        this.Kuenstler = _Kuenstler;
    }

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return Label;
    }

    /**
     * Gets kuenstler.
     *
     * @return the kuenstler
     */
    public String getKuenstler() {
        return Kuenstler;
    }

    /**
     * Sets label.
     *
     * @param Label the label
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Sets kuenstler.
     *
     * @param Kuenstler the kuenstler
     */
    public void setKuenstler(String Kuenstler) {
        this.Kuenstler = Kuenstler;
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Titel: ")
                .append(getTitel())
                .append("\n")
                .append("Label: ")
                .append(getLabel())
                .append("\n")
                .append("Kuenstler: ")
                .append(getKuenstler())
                .toString();
    }
}
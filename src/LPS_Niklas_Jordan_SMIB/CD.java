package LPS_Niklas_Jordan_SMIB;

public class CD extends Medium {
    private String Label;
    private String Kuenstler;

    public CD(String _Label, String _Kuenstler, String _Titel) {
        super(_Titel);
        this.Label = _Label;
        this.Kuenstler = _Kuenstler;
    }

    public String getLabel() {
        return Label;
    }

    public String getKuenstler() {
        return Kuenstler;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

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
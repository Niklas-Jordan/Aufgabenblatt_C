package LPS_Niklas_Jordan_SMIB;

public class Zeitschrift extends Medium{
    private String ISSN;
    private int Volume;
    private int Nummer;

    public Zeitschrift(String _ISSN, int _Volume, int _Nummer, String _Titel){
        super(_Titel);
        this.ISSN = _ISSN;
        this.Volume = _Volume;
        this.Nummer = _Nummer;
    }
    public String getISSN(){
        return ISSN;
    }
    public int getVolume(){
        return Volume;
    }
    public int getNummer(){
        return Nummer;
    }

    public void setISSN(String ISSN){
        this.ISSN = ISSN;
    }
    public void setVolume(int volume) {
        Volume = volume;
    }
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

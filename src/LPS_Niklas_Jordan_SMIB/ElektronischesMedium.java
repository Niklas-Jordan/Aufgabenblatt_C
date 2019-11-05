package LPS_Niklas_Jordan_SMIB;

import java.net.URL;

public class ElektronischesMedium extends Medium{
    private String URL;

    public ElektronischesMedium(String _URL, String _Titel) {
        super(_Titel);
        this.URL = _URL;
    }
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    public static boolean checkURL(String urlString)
    {
        try
        {
            URL url = new URL(urlString);
            url.toURI();
            return true;
        } catch (Exception exception)
        {
            return false;
        }
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Titel: ")
                .append(getTitel())
                .append("\n")
                .append("URL: ")
                .append(getURL())
                .toString();
    }
}

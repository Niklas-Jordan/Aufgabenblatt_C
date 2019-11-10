package LPS_Niklas_Jordan_SMIB;

import java.net.URL;

/**
 * The type Elektronisches medium.
 */
public class ElektronischesMedium extends Medium{
    private String URL;

    /**
     * Instantiates a new Elektronisches medium.
     *
     * @param _URL   the url
     * @param _Titel the titel
     */
    public ElektronischesMedium(String _URL, String _Titel) {
        super(_Titel);
        this.URL = _URL;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getURL() {
        return URL;
    }

    /**
     * Sets url.
     *
     * @param URL the url
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Check url boolean.
     *
     * @param urlString the url string
     * @return the boolean
     */
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

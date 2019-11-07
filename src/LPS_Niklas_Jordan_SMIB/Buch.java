package LPS_Niklas_Jordan_SMIB;

/**
 * The type Buch.
 */
public class Buch extends Medium{
    private int Erscheinungsjahr;
    private String Verlag;
    private String ISBN;
    private String Verfasser;

    /**
     * Instantiates a new Buch.
     *
     * @param _Erscheinungsjahr the erscheinungsjahr
     * @param _Verlag           the verlag
     * @param _ISBN             the isbn
     * @param _Verfasser        the verfasser
     * @param _Titel            the titel
     */
    public  Buch(int _Erscheinungsjahr, String _Verlag, String _ISBN, String _Verfasser, String _Titel) {
        super(_Titel);
        this.Erscheinungsjahr = _Erscheinungsjahr;
        this.Verlag = _Verlag;
        this.ISBN = _ISBN;
        this.Verfasser = _Verfasser;
    }

    /**
     * Get erscheinungsjahr int.
     *
     * @return the int
     */
    public int getErscheinungsjahr(){
        return Erscheinungsjahr;
    }

    /**
     * Get verlag string.
     *
     * @return the string
     */
    public String getVerlag(){
        return Verlag;
    }

    /**
     * Get isbn string.
     *
     * @return the string
     */
    public String getISBN(){
        return ISBN;
    }

    /**
     * Get verfasser string.
     *
     * @return the string
     */
    public String getVerfasser(){
        return Verfasser;
    }

    /**
     * Set erscheinungsjahr.
     *
     * @param Erscheinungsjahr the erscheinungsjahr
     */
    public void setErscheinungsjahr(int Erscheinungsjahr){
        this.Erscheinungsjahr = Erscheinungsjahr;
    }

    /**
     * Set verlag.
     *
     * @param Verlag the verlag
     */
    public void setVerlag(String Verlag){
        this.Verlag = Verlag;
    }

    /**
     * Set isbn.
     *
     * @param ISBN the isbn
     */
    public void setISBN(String ISBN){
        this.ISBN = ISBN;

        // Simon Biwald
        // [...] = Zeichenkategorie
        // ^ = Invertierung
        String zahlentester = ISBN.replaceAll("[^0-9X]", "");  //eckige zeichen = zeichenkategorie
        int[] zahlen = new int[13];
        for(int i = 0; i< zahlentester.length(); i++) {
            char c = zahlentester.charAt(i);
            if(c == 'X') {
                zahlen[i] = 10;
            }else{
                zahlen[i] = c;
            }
        }
        if(zahlentester.length() == 10 && checkISBN10(zahlen)){
            this.ISBN = ISBN;
        }else if(zahlentester.length() == 13 && checkISBN13(zahlen)){
            this.ISBN = ISBN;
        } else {
            throw new IllegalArgumentException("Fehlerhafte ISBN!!!");
        }

    }

    /**
     * Set verfasser.
     *
     * @param Verfasser the verfasser
     */
    public void setVerfasser(String Verfasser){
        this.Verfasser = Verfasser;
    }

    /**
     * Check isbn 10 boolean.
     *
     * @param isbn the isbn
     * @return the boolean
     */
    public static boolean checkISBN10(int[] isbn) {
        int sum = 0;
        for (int i = 1; i <= isbn.length; i++) {
            sum += i * isbn[i - 1];
        }
        if (sum % 11 == 0) {
            return true;
        } else {

            return false;
        }

    }

    /**
     * Methode um die ISBN zu berechnen
     *
     * @param isbn the isbn
     * @return the boolean
     */
    public static boolean checkISBN13(int[] isbn) {
        int sum = 0;
        for (int i = 1; i < isbn.length; i++) {
            if (i % 2 == 0) {
                sum += isbn[i - 1] * 3;
            } else {
                sum += isbn[i - 1];
            }
        }

        int lastDigit = sum % 10;

        int check = (10 - lastDigit) % 10;

        if (isbn[isbn.length - 1] == check) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] isbn10 = new int[] { 3, 8, 6, 6, 8, 0, 1, 9, 2 };
        System.out.println(checkISBN10(isbn10));
        int[] isbn13 = new int[] { 9, 7, 8, 3, 7, 6, 5, 7, 2, 7, 8, 1, 8 };
        System.out.println(checkISBN13(isbn13));
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Titel: ")
                .append(getTitel())
                .append("\n")
                .append("Erscheinungsjahr: ")
                .append(getErscheinungsjahr())
                .append("\n")
                .append("Verlag: ")
                .append(getVerlag())
                .append("\n")
                .append("ISBN: ")
                .append(getISBN())
                .append("\n")
                .append("Verfasser: ")
                .append(getVerfasser())
                .toString();
    }
}
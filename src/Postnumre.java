public class Postnumre {

    private int Number;
    private String Adresse;

    public Postnumre(int number, String adresse) {
        Number = number;
        Adresse = adresse;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    @Override
    public String toString() {
        return "Postnumre{" +
                "Number=" + Number +
                ", Adresse='" + Adresse + '\'' +
                '}';
    }
}

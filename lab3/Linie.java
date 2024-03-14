public class Linie {
    private String continut;

    public Linie(String continut) {
        this.continut = continut;
    }

    public int lungime() {
        return continut.length();
    }
    
    @Override
    public String toString() {
        return "Linie: " + continut;
    }
}

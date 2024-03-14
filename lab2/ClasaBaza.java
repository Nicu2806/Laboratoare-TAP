public class ClasaBaza {

    public ClasaBaza() {
        System.out.println("Constructor ClasaBaza()");
    }
    
    public ClasaBaza(String param) {
        this();
        System.out.println("Constructor ClasaBaza(String param)");
    }
    
    public ClasaBaza(String param1, int param2) {
        this(param1);
        System.out.println("Constructor ClasaBaza(String param1, int param2)");
    }
    
    public void metoda1() {
        System.out.println("Metoda1 din ClasaBaza");
    }
    
    public void metoda2() {
        System.out.println("Metoda2 din ClasaBaza");
    }
}

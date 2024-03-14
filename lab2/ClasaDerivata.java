public class ClasaDerivata extends ClasaBaza {

    public ClasaDerivata() {
        super("paramImplicit", 10);
        System.out.println("Constructor ClasaDerivata()");
    }
    
    public ClasaDerivata(String param) {
        super(param);
        System.out.println("Constructor ClasaDerivata(String param)");
    }
    
    public void metoda1() {
        super.metoda1();
        System.out.println("Metoda1 din ClasaDerivata");
    }
    
    public void metoda2() {
        super.metoda2();
        System.out.println("Metoda2 din ClasaDerivata");
    }
    
    public void metoda3() {
        System.out.println("Metoda3 din ClasaDerivata");
    }
}

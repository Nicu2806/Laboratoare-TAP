public class Main {
    public static void main(String[] args) {

        ClasaBaza obiectBaza = new ClasaBaza("test", 5);
        
        ClasaDerivata obiectDerivat = new ClasaDerivata();
        
        ClasaDerivata obiectDerivatCuParam = new ClasaDerivata("testC");
        
        ClasaBaza obiectBazaDinDerivata = new ClasaDerivata("testDerivat");
        
        System.out.println("\nApeluri metode pentru obiectBaza:");
        obiectBaza.metoda1();
        obiectBaza.metoda2();
        
        System.out.println("\nApeluri metode pentru obiectDerivat:");
        obiectDerivat.metoda1();
        obiectDerivat.metoda2();
        obiectDerivat.metoda3();
        
        System.out.println("\nApeluri metode pentru obiectDerivatCuParam:");
        obiectDerivatCuParam.metoda1();
        obiectDerivatCuParam.metoda2();
        obiectDerivatCuParam.metoda3();
        
        System.out.println("\nApeluri metode pentru obiectBazaDinDerivata:");
        obiectBazaDinDerivata.metoda1();
        obiectBazaDinDerivata.metoda2();
    }
}

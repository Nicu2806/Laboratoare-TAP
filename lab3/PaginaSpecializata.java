public class PaginaSpecializata extends Pagina {
    @Override
    public void adaugaLinie(String text, String stil) {
        System.out.println("Adaugă linie cu stilul " + stil + ": " + text);
    }
}

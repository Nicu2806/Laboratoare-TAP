public class Main {
    public static void main(String[] args) {
        Pagina pagina = new Pagina();
        pagina.adaugaLinie("Aceasta este o linie obișnuită.");
        pagina.adaugaLinie("Aceasta este o altă linie.", "italic");

        Linie linie = new Linie("Linie de test");
        System.out.println("Lungime linie: " + linie.lungime());
        System.out.println(linie);

        PaginaSpecializata paginaSpec = new PaginaSpecializata();
        paginaSpec.adaugaLinie("Linie specializată", "bold");

        LinieSpecializata linieSpec = new LinieSpecializata("Linie specializată");
        System.out.println("Lungime linie specializată: " + linieSpec.lungime());

        UtilitareText utilitareText = new UtilitareText();
        String text = "Acesta este un text de test.";
        String sablon = "test";
        if (utilitareText.cautaSubsir(text, sablon)) {
            System.out.println("Subșirul \"" + sablon + "\" a fost găsit în text.");
        } else {
            System.out.println("Subșirul \"" + sablon + "\" nu a fost găsit în text.");
        }
    }
}

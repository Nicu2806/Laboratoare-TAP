public class LinieSpecializata extends Linie {
    public LinieSpecializata(String continut) {
        super(continut);
    }

    @Override
    public int lungime() {
        return super.lungime() * 2;
    }
}

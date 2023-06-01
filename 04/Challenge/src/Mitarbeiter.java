public class Mitarbeiter {
    private String name;
    private Standort standort;

    public Mitarbeiter(String name, Standort standort) {
        this.name = name;
        this.standort = standort;
    }

    public String getName() {
        return name;
    }

    public Standort getStandort() {
        return standort;
    }
}
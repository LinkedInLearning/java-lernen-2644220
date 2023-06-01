public class Firma {
    public static void main(String[] args) {
        Standort standort1 = new Standort("Berlin", "Deutschland", 52.520008, 13.404954);
        Standort standort2 = new Standort("Hamburg", "Deutschland", 53.551086, 9.993682);

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Max Mustermann", standort1);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Susi Sorglos", standort2);

        System.out.println("Mitarbeiter 1: " + mitarbeiter1.getName() + ", Standort: " + mitarbeiter1.getStandort().getStadt() + ", " + mitarbeiter1.getStandort().getLand());
        System.out.println("Mitarbeiter 2: " + mitarbeiter2.getName() + ", Standort: " + mitarbeiter2.getStandort().getStadt() + ", " + mitarbeiter2.getStandort().getLand());
    }
}
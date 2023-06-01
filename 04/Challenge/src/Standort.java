public class Standort {
    private String stadt;
    private String land;
    private double latitude;
    private double longitude;

    public Standort(String stadt, String land, double latitude, double longitude) {
        this.stadt = stadt;
        this.land = land;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getStadt() {
        return stadt;
    }

    public String getLand() {
        return land;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
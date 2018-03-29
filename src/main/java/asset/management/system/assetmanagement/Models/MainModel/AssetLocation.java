package asset.management.system.assetmanagement.Models.MainModel;

//This class will hold latitude and longitude for an asset
public class AssetLocation {
    private double latitude;
    private double longitude;

    public AssetLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

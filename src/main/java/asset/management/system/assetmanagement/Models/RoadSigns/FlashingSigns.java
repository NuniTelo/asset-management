package asset.management.system.assetmanagement.Models.RoadSigns;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assetcollection")
@TypeAlias("flashingsigns")
public class FlashingSigns extends AssetMainModel{
    private String type;
    private double voltage;
    private int noOfLights;
    private String signInstrucion;
    private String viewDistance;
    private double viewAngle;

    public FlashingSigns(String id,
                         String brand,
                         String model,
                         String name,
                         String category,
                         String subcategory,
                         String serial_no,
                         String assetStatus,
                         AssetLocation location,
                         String installation_date,
                         String purchase_date,
                         List<AssetHistory> assetHistory,
                         String provider,
                         double assetCost,
                         String assetCondition,
                         String warehouse,
                         String unitOfMeasure,
                         String longDescription,
                         OtherData otherData,
                         boolean multiGeopoints,
                         List<Double> listGeopoints,
                         Dimensions dimensions,
                         String mapMarker,
                         List<String> specialFeatures,
                         String type,
                         double voltage,
                         int noOfLights,
                         String signInstrucion,
                         String viewDistance,
                         double viewAngle)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.type = type;
        this.voltage = voltage;
        this.noOfLights = noOfLights;
        this.signInstrucion = signInstrucion;
        this.viewDistance = viewDistance;
        this.viewAngle = viewAngle;
    }

    public String getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(String viewDistance) {
        this.viewDistance = viewDistance;
    }

    public double getViewAngle() {
        return viewAngle;
    }

    public void setViewAngle(double viewAngle) {
        this.viewAngle = viewAngle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getNoOfLights() {
        return noOfLights;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }

    public String getSignInstrucion() {
        return signInstrucion;
    }

    public void setSignInstrucion(String signInstrucion) {
        this.signInstrucion = signInstrucion;
    }
}

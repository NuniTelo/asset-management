package asset.management.system.assetmanagement.Models.LightingModel;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assetcollection")
@TypeAlias("lightingmodel")
public class LightingModel extends AssetMainModel{

    //no of lights in a Lighting Pole
    private int noLights;

    private String typeOfPole;

    private double voltage;

    private String bulbSize;

    public LightingModel(String id,
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
                         int noLights,
                         String typeOfPole,
                         double voltage,
                         String bulbSize)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.noLights = noLights;
        this.typeOfPole = typeOfPole;
        this.voltage = voltage;
        this.bulbSize = bulbSize;
    }

    public int getNoLights() {
        return noLights;
    }

    public void setNoLights(int noLights) {
        this.noLights = noLights;
    }

    public String getTypeOfPole() {
        return typeOfPole;
    }

    public void setTypeOfPole(String typeOfPole) {
        this.typeOfPole = typeOfPole;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getBulbSize() {
        return bulbSize;
    }

    public void setBulbSize(String bulbSize) {
        this.bulbSize = bulbSize;
    }
}

package asset.management.system.assetmanagement.Models.ComponentsModel;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assetcollection")
@TypeAlias("components")
//Responsible class for the category Components
public class Components extends AssetMainModel {
    private String materialType;
    private String transmisionSpeed;
    private double thickness;
    private String usage;
    private double voltage;
    private String cableType;
    private int numberOfCores;

    public Components(String id,
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
                      String materialType,
                      String transmisionSpeed,
                      double thickness,
                      String usage,
                      double voltage,
                      String cableType,
                      int numberOfCores
                      )
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.materialType = materialType;
        this.transmisionSpeed = transmisionSpeed;
        this.thickness = thickness;
        this.usage = usage;
        this.voltage = voltage;
        this.cableType = cableType;
        this.numberOfCores = numberOfCores;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getTransmisionSpeed() {
        return transmisionSpeed;
    }

    public void setTransmisionSpeed(String transmisionSpeed) {
        this.transmisionSpeed = transmisionSpeed;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

}

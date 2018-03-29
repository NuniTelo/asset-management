package asset.management.system.assetmanagement.Models.ComponentsModel;

import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;

//TODO collection and document
//Responsible class for the category Components
public class Components {
    private String materialType;
    private String transmisionSpeed;
    private double thickness;
    private String usage;
    private double voltage;
    private String cableType;
    private int numberOfCores;
    private AssetMainModel assetMainModel;

    public Components(String materialType,
                      String transmisionSpeed,
                      double thickness,
                      String usage,
                      double voltage,
                      String cableType,
                      int numberOfCores,
                      AssetMainModel assetMainModel) {
        this.materialType = materialType;
        this.transmisionSpeed = transmisionSpeed;
        this.thickness = thickness;
        this.usage = usage;
        this.voltage = voltage;
        this.cableType = cableType;
        this.numberOfCores = numberOfCores;
        this.assetMainModel = assetMainModel;
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

    public AssetMainModel getAssetMainModel() {
        return assetMainModel;
    }

    public void setAssetMainModel(AssetMainModel assetMainModel) {
        this.assetMainModel = assetMainModel;
    }
}

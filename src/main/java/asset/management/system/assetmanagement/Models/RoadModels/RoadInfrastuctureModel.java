package asset.management.system.assetmanagement.Models.RoadModels;

import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;

import java.util.List;
//TODO collection and document
//klase qe do te trashegoje qe te gjitha fushat qe perfshihen ne AssetMainModel
public class RoadInfrastuctureModel {

    //since it will have all the

    //structure type can be a list of diffrent types
    private List<String> structureTypes;

    //road where this is placecd
    private String associativeRoad;

    //assetName ex:Golden Bridge
    private String assetName;

    //short description about asset usage
    private String usage;

    //technical properties
    private TechnicalProperties technicalProperties;

    //assets all fields
    private AssetMainModel assetMainModel;

    public RoadInfrastuctureModel(List<String> structureTypes, String associativeRoad, String assetName, String usage, TechnicalProperties technicalProperties, AssetMainModel assetMainModel) {
        this.structureTypes = structureTypes;
        this.associativeRoad = associativeRoad;
        this.assetName = assetName;
        this.usage = usage;
        this.technicalProperties = technicalProperties;
        this.assetMainModel = assetMainModel;
    }

    public AssetMainModel getAssetMainModel() {
        return assetMainModel;
    }

    public void setAssetMainModel(AssetMainModel assetMainModel) {
        this.assetMainModel = assetMainModel;
    }

    public List<String> getStructureTypes() {
        return structureTypes;
    }

    public void setStructureTypes(List<String> structureTypes) {
        this.structureTypes = structureTypes;
    }

    public String getAssociativeRoad() {
        return associativeRoad;
    }

    public void setAssociativeRoad(String associativeRoad) {
        this.associativeRoad = associativeRoad;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public TechnicalProperties getTechnicalProperties() {
        return technicalProperties;
    }

    public void setTechnicalProperties(TechnicalProperties technicalProperties) {
        this.technicalProperties = technicalProperties;
    }
}




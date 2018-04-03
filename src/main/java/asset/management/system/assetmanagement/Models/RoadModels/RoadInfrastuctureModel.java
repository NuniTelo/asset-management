package asset.management.system.assetmanagement.Models.RoadModels;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assetcollection")
@TypeAlias("roadinfrastucture")
public class RoadInfrastuctureModel extends AssetMainModel {

    //since it will have all the
    //structureTypes, can be a list of diffrent types
    private List<String> structureTypes;

    //road where this is placecd
    private String associativeRoad;

    //assetName ex:Golden Bridge
    private String assetName;

    //short description about asset usage
    private String usage;

    //technical properties
    private TechnicalProperties technicalProperties;


    public RoadInfrastuctureModel(String id,
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
                                  List<String> structureTypes,
                                  String associativeRoad,
                                  String assetName,
                                  String usage,
                                  TechnicalProperties technicalProperties)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.structureTypes = structureTypes;
        this.associativeRoad = associativeRoad;
        this.assetName = assetName;
        this.usage = usage;
        this.technicalProperties = technicalProperties;
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




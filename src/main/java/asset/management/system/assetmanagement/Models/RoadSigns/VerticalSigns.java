package asset.management.system.assetmanagement.Models.RoadSigns;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
//
@Document(collection = "assetcollection")
@TypeAlias("verticalsigns")
public class VerticalSigns extends AssetMainModel{
    private String type;
    private String signInstruction;
    private String color;
    private String name_vertical;

    public VerticalSigns(String id,
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
                         String signInstruction,
                         String color,
                         String name_vertical)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.type = type;
        this.signInstruction = signInstruction;
        this.color = color;
        this.name_vertical = name_vertical;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSignInstruction() {
        return signInstruction;
    }

    public void setSignInstruction(String signInstruction) {
        this.signInstruction = signInstruction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name_vertical;
    }

    public void setName(String name_vertical) {
        this.name_vertical = name_vertical;
    }
}

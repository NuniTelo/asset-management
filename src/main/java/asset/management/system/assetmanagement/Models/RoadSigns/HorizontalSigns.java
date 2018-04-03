package asset.management.system.assetmanagement.Models.RoadSigns;

import asset.management.system.assetmanagement.Models.MainModel.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "assetcollection")
@TypeAlias("horizontalsigns")
public class HorizontalSigns extends AssetMainModel{
    private String type;
    private String signInstruction;

    public HorizontalSigns(String id,
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
                           String signInstruction)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.type = type;
        this.signInstruction = signInstruction;
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
}

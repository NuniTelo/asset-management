package asset.management.system.assetmanagement.Models.DynamicModel;

//This is model for the new assets an user want to add to database
//@JsonInclude(Include.NON_NULL) -> if we dont want to consider null fields

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

//Dynamic Model when user want to add more data.
//Two models, or just add just more 5 fields,or add map and can add fields.
@Document(collection = "assetcollection")
@TypeAlias("dynamicmodel")
public class DynamicModel extends AssetMainModel{

    private Map<String,String> dynamimcData;

    public DynamicModel(String id,
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
                        Map<String, String> dynamimcData)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
        this.dynamimcData = dynamimcData;
    }


    public Map<String, String> getDynamimcData() {
        return dynamimcData;
    }

    public void setDynamimcData(Map<String, String> dynamimcData) {
        this.dynamimcData = dynamimcData;
    }
}

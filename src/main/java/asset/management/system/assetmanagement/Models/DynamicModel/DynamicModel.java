package asset.management.system.assetmanagement.Models.DynamicModel;

//This is model for the new assets an user want to add to database
//@JsonInclude(Include.NON_NULL) -> if we dont want to consider null fields

import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;

import java.util.Map;

//Dynamic Model when user want to add more data.
//Two models, or just add just more 5 fields,or add map and can add fields.
public class DynamicModel {
    private AssetMainModel assetMainModel;

    private Map<String,String> dynamimcData;

    public DynamicModel(AssetMainModel assetMainModel, Map<String, String> dynamimcData) {
        this.assetMainModel = assetMainModel;
        this.dynamimcData = dynamimcData;
    }

    public AssetMainModel getAssetMainModel() {
        return assetMainModel;
    }

    public void setAssetMainModel(AssetMainModel assetMainModel) {
        this.assetMainModel = assetMainModel;
    }

    public Map<String, String> getDynamimcData() {
        return dynamimcData;
    }

    public void setDynamimcData(Map<String, String> dynamimcData) {
        this.dynamimcData = dynamimcData;
    }
}

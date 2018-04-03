package asset.management.system.assetmanagement.Models.MainModel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "assetcollection")
public class AssetMainModel {
    //Id of the asset, can be random and it must be UNIQUE
    @Id
    private String id;

    //what brand an asset is , ex : Sony]
    @Field("brand")
    private String brand;

    @Field("model")
    //model of the asset , ex : A103
    private String model;

    @Field("name")
    //this is the name that will be used to display on the map
    private String name;

    @Field("category")
    //main category where it belongs
    private String category;

    @Field("subcategory")
    //main subcategory where this asset belongs
    private String subcategory;

    @Field("serial_no")
    //unique, since it's serial_no
    private String serial_no;

    @Field("assetStatus")
    //status of the asset
    private String assetStatus;

    @Field("location")
    //location is saved as an objet with two fields
    private AssetLocation location;

    @Field("installation_date")
    //date where the asset is installed
    private String installation_date;

    @Field("purchase_date")
    //date where the asset is purchased
    private String purchase_date;

    @Field("assetHistory")
    //this will be an arraylist of object assetHistory
    private List<AssetHistory> assetHistory;

    @Field("provider")
    //this will hold the provider
    private String provider;

    @Field("assetCost")
    //cost of the asset
    private double assetCost;

    @Field("assetCondition")
    //what condition is GOOD, POOR , BROKEN. Will be stored in the FilterArgs
    private String assetCondition;

    @Field("warehouse")
    //where is stored in the warhouse
    private String warehouse;

    @Field("unitOfMeasure")
    //unit of meassure
    private String unitOfMeasure;

    @Field("longDescription")
    //long description for the asset
    private String longDescription;

    @Field("otherData")
    //ingredients + tags for the asset
    private OtherData otherData;

    @Field("multiGeopoints")
    //TRUE if have multipoits, ex: Road. False if asset have only one.
    private boolean multiGeopoints;

    @Field("listGeopoints")
    //List of all geopoints if multiGeopoints is TRUE
    private List<Double> listGeopoints;

    @Field("dimensions")
    //Dimension is an object that will hold the WIDTH,HEIGHT AND LENGTH
    private Dimensions dimensions;

    @Field("mapMarker")
    //url that will hold marker-image
    private String mapMarker;

    @Field("specialFeatures")
    //this will be an array that will hold special features about an asset
    private List<String> specialFeatures;

    public AssetMainModel(String id,
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
                          List<String> specialFeatures)
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
        this.serial_no = serial_no;
        this.assetStatus = assetStatus;
        this.location = location;
        this.installation_date = installation_date;
        this.purchase_date = purchase_date;
        this.assetHistory = assetHistory;
        this.provider = provider;
        this.assetCost = assetCost;
        this.assetCondition = assetCondition;
        this.warehouse = warehouse;
        this.unitOfMeasure = unitOfMeasure;
        this.longDescription = longDescription;
        this.otherData = otherData;
        this.multiGeopoints = multiGeopoints;
        this.listGeopoints = listGeopoints;
        this.dimensions = dimensions;
        this.mapMarker = mapMarker;
        this.specialFeatures = specialFeatures;
    }

    public AssetMainModel(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public AssetLocation getLocation() {
        return location;
    }

    public void setLocation(AssetLocation location) {
        this.location = location;
    }

    public String getInstallation_date() {
        return installation_date;
    }

    public void setInstallation_date(String installation_date) {
        this.installation_date = installation_date;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public List<AssetHistory> getAssetHistory() {
        return assetHistory;
    }

    public void setAssetHistory(List<AssetHistory> assetHistory) {
        this.assetHistory = assetHistory;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public double getAssetCost() {
        return assetCost;
    }

    public void setAssetCost(double assetCost) {
        this.assetCost = assetCost;
    }

    public String getAssetCondition() {
        return assetCondition;
    }

    public void setAssetCondition(String assetCondition) {
        this.assetCondition = assetCondition;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public OtherData getOtherData() {
        return otherData;
    }

    public void setOtherData(OtherData otherData) {
        this.otherData = otherData;
    }

    public boolean isMultiGeopoints() {
        return multiGeopoints;
    }

    public void setMultiGeopoints(boolean multiGeopoints) {
        this.multiGeopoints = multiGeopoints;
    }

    public List<Double> getListGeopoints() {
        return listGeopoints;
    }

    public void setListGeopoints(List<Double> listGeopoints) {
        this.listGeopoints = listGeopoints;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getMapMarker() {
        return mapMarker;
    }

    public void setMapMarker(String mapMarker) {
        this.mapMarker = mapMarker;
    }

    public List<String> getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(List<String> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}

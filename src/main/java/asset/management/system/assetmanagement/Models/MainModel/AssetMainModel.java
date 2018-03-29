package asset.management.system.assetmanagement.Models.MainModel;

import org.springframework.data.annotation.Id;

import java.util.List;

public class AssetMainModel {
    //Id of the asset, can be random and it must be UNIQUE
    @Id
    private String id;

    //what brand an asset is , ex : Sony
    private String brand;

    //model of the asset , ex : A103
    private String model;

    //this is the name that will be used to display on the map
    private String name;

    //main category where it belongs
    private String category;

    //main subcategory where this asset belongs
    private String subcategory;

    //unique, since it's serial_no
    private String serial_no;

    //status of the asset
    private String assetStatus;

    //location is saved as an objet with two fields
    private AssetLocation location;

    //date where the asset is installed
    private String installation_date;

    //date where the asset is purchased
    private String purchase_date;

    //this will be an arraylist of object assetHistory
    private List<AssetHistory> assetHistory;

    //this will hold the provider
    private String provider;

    //cost of the asset
    private double assetCost;

    //what condition is GOOD, POOR , BROKEN. Will be stored in the FilterArgs
    private String assetCondition;

    //where is stored in the warhouse
    private String warehouse;

    //unit of meassure
    private String unitOfMeasure;

    //long description for the asset
    private String longDescription;

    //ingredients + tags for the asset
    private OtherData otherData;

    //TRUE if have multipoits, ex: Road. False if asset have only one.
    private boolean multiGeopoints;

    //List of all geopoints if multiGeopoints is TRUE
    private List<Double> listGeopoints;

    //Dimension is an object that will hold the WIDTH,HEIGHT AND LENGTH
    private Dimensions dimensions;

    //url that will hold marker-image
    private String mapMarker;

    //this will be an array that will hold special features about an asset
    private List<String> specialFeatures;
}

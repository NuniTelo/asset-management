package asset.management.system.assetmanagement;


//FilterArgs
//Class that will hold static data for better maintaining in the future

import java.util.List;

public class FilterArgs {
    //--------API--VERSION----------------------
//    public static String API_VERSION = "v1";

    public static final String API_VERSION = "v1";
    //-------start-region-condition-------------
    public static String GOOD_CONDITION = "GOOD";
    public static String POOR_CONDITION = "POOR";
    public static String BROKEN_CONDITION = "BROKEN";
    //-------end-region-condiotion---------------


    //-------start-region-unit-of-meassure------
    public static String MEASSURE_METER = "M";
    public static String MEASSURE_CM = "CM";
    public static String MEASSURE_KM = "KM";
    public static String MEASSURE_KG = "KG";
    public static String MEASSURE_LOT = "LOT";
    public static String MEASSURE_PCS = "PCS";
    //-------end-region-unit-of-meassure-------


    //---------start-assetModel--------------------
    public static String MODE_DRAFT = "DRAFT";
    public static String MODE_ACTIVE = "ACTIVE";
    public static String MODE_DELETED = "DELETED";
    //-------------end-assetModel-----------------

    //----------start-assetHistory----------------
    public static String ACTION_CREATED = "CREATED";
    public static String ACTION_FIX = "FIXED";
    public static String ACTION_EDIT ="EDIT";
    //----------end-assetHistory------------------

    //----------roadInfrastucture-stucture---------
    public static String METAL_STRUCTURE = "METAL";
    public static String WOOD_STRUCTURE = "WOOD";
    public static String PLASTIC_STRUCTURE = "PLASTIC";
    public static String CONCRETE_STRUCTURE = "CONCRETE";
    //---------------roadInfrastucture--structure----

    //----------components---usage---------------
    public static String USAGE_INTERNET = "INTERNET";
    public static String USAGE_POWER = "POWER";
    //-------------------END--------------------


    //---------------bulb-size------------------
    public static String SMALL_BULB = "SMALL";
    public static String MEDIUM_BULB = "MEDIUM";
    public static String BIG_BULB = "BIG";
    //-------------------end--------------------

    //-------------camera-type-----------------
    public static String CAMERA_PTZ = "PTZ";
    public static String CAMERA_DOME = "DOME";
    public static String CAMERA_BULLET = "BULLET";
    public static String CAMERA_MINI = "MINI";
    public static String CAMERA_BOX = "BOX";
    public static String CAMERA_BULB = "BULB";
    //--------------end-camera-type------------

    public static String INSTALLATION_DATA_FIELD = "installation_date";

}

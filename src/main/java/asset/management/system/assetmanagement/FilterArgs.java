package asset.management.system.assetmanagement;


//FilterArgs
//Class that will hold static data for better maintaining in the future

import java.util.List;

public class FilterArgs {

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
    private static String USAGE_INTERNET = "INTERNET";
    private static String USAGE_POWER = "POWER";
    //-------------------END--------------------


    //---------------bulb-size------------------
    private static String SMALL_BULB = "SMALL";
    private static String MEDIUM_BULB = "MEDIUM";
    private static String BIG_BULB = "BIG";
    //-------------------end--------------------

    //-------------camera-type-----------------
    private static String CAMERA_PTZ = "PTZ";
    private static String CAMERA_DOME = "DOME";
    private static String CAMERA_BULLET = "BULLET";
    private static String CAMERA_MINI = "MINI";
    private static String CAMERA_BOX = "BOX";
    private static String CAMERA_BULB = "BULB";
    //--------------end-camera-type------------



}

package asset.management.system.assetmanagement.Models.CameraModel;

import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//TODO collection and document

@Document(collection = "cameracategory")
public class CameraModel {
    //camera type
    private String type;

    //infrared TRUE OR FALSE
    private boolean infrared;

    //name of lens
    private String lens;

    //resolution of the camera
    private String resolution;

    //type of sensor
    private String style;

    //no.of IR-LEDS
    private int IRLEDS;

    //distance of IR-LEDS
    private double IRDistance;

    //is IP-camera or not
    private boolean hasIP;

    //image sensor
    private String imageSensor;

    //ip of the camera if has any
    private String IP;

    //list of sensor in the camera
    private List<String> sensors;

    //supported browsers
    private List<String> browserSupport;

    //rain,sun,snow etc.
    private List<String> operatingConditions;

    //camera compression
    private CameraCompression cameraCompression;

    private CameraImage cameraImage;

    private AlarmTrigger alarmTrigger;

    //main model that all the fields have
    private AssetMainModel assetMainModel;

    public CameraModel(String type,
                       boolean infrared,
                       String lens,
                       String resolution,
                       String style,
                       int IRLEDS,
                       double IRDistance,
                       boolean hasIP,
                       String imageSensor,
                       String IP,
                       List<String> sensors,
                       List<String> browserSupport,
                       List<String> operatingConditions,
                       CameraCompression cameraCompression,
                       CameraImage cameraImage,
                       AlarmTrigger alarmTrigger,
                       AssetMainModel assetMainModel)
    {
        this.type = type;
        this.infrared = infrared;
        this.lens = lens;
        this.resolution = resolution;
        this.style = style;
        this.IRLEDS = IRLEDS;
        this.IRDistance = IRDistance;
        this.hasIP = hasIP;
        this.imageSensor = imageSensor;
        this.IP = IP;
        this.sensors = sensors;
        this.browserSupport = browserSupport;
        this.operatingConditions = operatingConditions;
        this.cameraCompression = cameraCompression;
        this.cameraImage = cameraImage;
        this.alarmTrigger = alarmTrigger;
        this.assetMainModel = assetMainModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInfrared() {
        return infrared;
    }

    public void setInfrared(boolean infrared) {
        this.infrared = infrared;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getIRLEDS() {
        return IRLEDS;
    }

    public void setIRLEDS(int IRLEDS) {
        this.IRLEDS = IRLEDS;
    }

    public double getIRDistance() {
        return IRDistance;
    }

    public void setIRDistance(double IRDistance) {
        this.IRDistance = IRDistance;
    }

    public boolean isHasIP() {
        return hasIP;
    }

    public void setHasIP(boolean hasIP) {
        this.hasIP = hasIP;
    }

    public String getImageSensor() {
        return imageSensor;
    }

    public void setImageSensor(String imageSensor) {
        this.imageSensor = imageSensor;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public List<String> getSensors() {
        return sensors;
    }

    public void setSensors(List<String> sensors) {
        this.sensors = sensors;
    }

    public List<String> getBrowserSupport() {
        return browserSupport;
    }

    public void setBrowserSupport(List<String> browserSupport) {
        this.browserSupport = browserSupport;
    }

    public List<String> getOperatingConditions() {
        return operatingConditions;
    }

    public void setOperatingConditions(List<String> operatingConditions) {
        this.operatingConditions = operatingConditions;
    }

    public CameraCompression getCameraCompression() {
        return cameraCompression;
    }

    public void setCameraCompression(CameraCompression cameraCompression) {
        this.cameraCompression = cameraCompression;
    }

    public CameraImage getCameraImage() {
        return cameraImage;
    }

    public void setCameraImage(CameraImage cameraImage) {
        this.cameraImage = cameraImage;
    }

    public AlarmTrigger getAlarmTrigger() {
        return alarmTrigger;
    }

    public void setAlarmTrigger(AlarmTrigger alarmTrigger) {
        this.alarmTrigger = alarmTrigger;
    }

    public AssetMainModel getAssetMainModel() {
        return assetMainModel;
    }

    public void setAssetMainModel(AssetMainModel assetMainModel) {
        this.assetMainModel = assetMainModel;
    }
}

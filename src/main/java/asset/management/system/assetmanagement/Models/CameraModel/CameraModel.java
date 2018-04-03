package asset.management.system.assetmanagement.Models.CameraModel;

import asset.management.system.assetmanagement.Models.MainModel.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

//TODO collection and document

@Document(collection = "assetcollection")
@TypeAlias("cameras")
public class CameraModel extends AssetMainModel{
    //camera type

    public String type;

    //infrared TRUE OR FALSE
    public boolean infrared;

    //name of lens
    public String lens;

    //resolution of the camera
    public String resolution;

    //type of sensor
    public String style;

    //no.of IR-LEDS
    public int IRLEDS;

    //distance of IR-LEDS
    public double IRDistance;

    //is IP-camera or not
    public boolean hasIP;

    //image sensor
    public String imageSensor;

    //ip of the camera if has any
    public String IP;

    //list of sensor in the camera
    public List<String> sensors;

    //supported browsers
    public List<String> browserSupport;

    //rain,sun,snow etc.
    public List<String> operatingConditions;

    //camera compression
    public CameraCompression cameraCompression;

    public CameraImage cameraImage;

    public AlarmTrigger alarmTrigger;

    public CameraModel(String id,
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
                       AlarmTrigger alarmTrigger)
    {
        super(id, brand, model, name, category, subcategory, serial_no, assetStatus, location, installation_date, purchase_date, assetHistory, provider, assetCost, assetCondition, warehouse, unitOfMeasure, longDescription, otherData, multiGeopoints, listGeopoints, dimensions, mapMarker, specialFeatures);
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


}

package asset.management.system.assetmanagement.Models.CameraModel;

//class about different types of camera properties,max resolution,bit-rate,frame-rate
public class CameraImage {
    private String maxImageSize;
    private String bitRate;
    private String frameRate;
    private double storage;

    public CameraImage(String maxImageSize,
                       String bitRate,
                       String frameRate,
                       double storage)
    {
        this.maxImageSize = maxImageSize;
        this.bitRate = bitRate;
        this.frameRate = frameRate;
        this.storage=storage;
    }

    public String getMaxImageSize() {
        return maxImageSize;
    }

    public void setMaxImageSize(String maxImageSize) {
        this.maxImageSize = maxImageSize;
    }

    public String getBitRate() {
        return bitRate;
    }

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }
}

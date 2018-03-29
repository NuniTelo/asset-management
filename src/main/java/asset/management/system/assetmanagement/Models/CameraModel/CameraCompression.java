package asset.management.system.assetmanagement.Models.CameraModel;

public class CameraCompression {
    //ex.H.264/MJPEG
    private String videoCompression;

    //special features for the camera
    private String codingStandard;

    public CameraCompression(String videoCompression, String codingStandard) {
        this.videoCompression = videoCompression;
        this.codingStandard = codingStandard;
    }

    public String getVideoCompression() {
        return videoCompression;
    }

    public void setVideoCompression(String videoCompression) {
        this.videoCompression = videoCompression;
    }

    public String getCodingStandard() {
        return codingStandard;
    }

    public void setCodingStandard(String codingStandard) {
        this.codingStandard = codingStandard;
    }
}

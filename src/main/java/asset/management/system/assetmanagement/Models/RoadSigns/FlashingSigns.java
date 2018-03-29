package asset.management.system.assetmanagement.Models.RoadSigns;

//TODO DOCUMENT NAME
public class FlashingSigns {
    private String type;
    private double voltage;
    private int noOfLights;
    private String signInstrucion;
    private String viewDistance;
    private double viewAngle;

    public FlashingSigns(String type,
                         double voltage,
                         int noOfLights,
                         String signInstrucion,
                         String viewDistance,
                         double viewAngle)
    {
        this.type = type;
        this.voltage = voltage;
        this.noOfLights = noOfLights;
        this.signInstrucion = signInstrucion;
        this.viewDistance = viewDistance;
        this.viewAngle = viewAngle;
    }

    public String getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(String viewDistance) {
        this.viewDistance = viewDistance;
    }

    public double getViewAngle() {
        return viewAngle;
    }

    public void setViewAngle(double viewAngle) {
        this.viewAngle = viewAngle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getNoOfLights() {
        return noOfLights;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }

    public String getSignInstrucion() {
        return signInstrucion;
    }

    public void setSignInstrucion(String signInstrucion) {
        this.signInstrucion = signInstrucion;
    }
}

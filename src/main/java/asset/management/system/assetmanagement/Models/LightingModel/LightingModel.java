package asset.management.system.assetmanagement.Models.LightingModel;

//TODO collection and document
public class LightingModel {
    //no of lights in a Lighting Pole
    private int noLights;

    private String typeOfPole;

    private double voltage;

    private String bulbSize;


    public LightingModel(int noLights,
                         String typeOfPole,
                         double voltage,
                         String bulbSize)
    {
        this.noLights = noLights;
        this.typeOfPole = typeOfPole;
        this.voltage = voltage;
        this.bulbSize = bulbSize;
    }

    public int getNoLights() {
        return noLights;
    }

    public void setNoLights(int noLights) {
        this.noLights = noLights;
    }

    public String getTypeOfPole() {
        return typeOfPole;
    }

    public void setTypeOfPole(String typeOfPole) {
        this.typeOfPole = typeOfPole;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getBulbSize() {
        return bulbSize;
    }

    public void setBulbSize(String bulbSize) {
        this.bulbSize = bulbSize;
    }
}

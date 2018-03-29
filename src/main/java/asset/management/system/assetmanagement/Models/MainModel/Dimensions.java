package asset.management.system.assetmanagement.Models.MainModel;

//Dimensions of the object, default is 0
public class Dimensions {
    private double width;
    private double height;
    private double length;
    private double weight;

    public Dimensions(double width, double height, double length, double weight) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public Dimensions(){
        this.weight=0;
        this.height=0;
        this.length=0;
        this.weight=0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

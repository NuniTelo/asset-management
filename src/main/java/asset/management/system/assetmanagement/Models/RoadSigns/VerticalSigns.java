package asset.management.system.assetmanagement.Models.RoadSigns;
//TODO DOCUMENT NAME
public class VerticalSigns {
    private String type;
    private String signInstruction;
    private String color;
    private String name;

    public VerticalSigns(String type,
                         String signInstruction,
                         String color,
                         String name)
    {
        this.type = type;
        this.signInstruction = signInstruction;
        this.color = color;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSignInstruction() {
        return signInstruction;
    }

    public void setSignInstruction(String signInstruction) {
        this.signInstruction = signInstruction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

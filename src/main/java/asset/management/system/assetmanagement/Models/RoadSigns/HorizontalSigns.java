package asset.management.system.assetmanagement.Models.RoadSigns;

//TODO DOCUMENT NAME
public class HorizontalSigns {
    private String type;
    private String signInstruction;

    public HorizontalSigns(String type,
                           String signInstruction)
    {
        this.type = type;
        this.signInstruction = signInstruction;
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
}

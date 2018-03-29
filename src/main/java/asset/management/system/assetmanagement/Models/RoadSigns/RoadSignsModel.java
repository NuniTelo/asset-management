package asset.management.system.assetmanagement.Models.RoadSigns;

//TODO COLLECTIOn NAME
public class RoadSignsModel {

    private HorizontalSigns horizontalSigns;
    private VerticalSigns verticalSigns;
    private FlashingSigns flashingSigns;

    public RoadSignsModel(HorizontalSigns horizontalSigns,
                          VerticalSigns verticalSigns,
                          FlashingSigns flashingSigns)
    {
        this.horizontalSigns = horizontalSigns;
        this.verticalSigns = verticalSigns;
        this.flashingSigns = flashingSigns;
    }

    public HorizontalSigns getHorizontalSigns() {
        return horizontalSigns;
    }

    public void setHorizontalSigns(HorizontalSigns horizontalSigns) {
        this.horizontalSigns = horizontalSigns;
    }

    public VerticalSigns getVerticalSigns() {
        return verticalSigns;
    }

    public void setVerticalSigns(VerticalSigns verticalSigns) {
        this.verticalSigns = verticalSigns;
    }

    public FlashingSigns getFlashingSigns() {
        return flashingSigns;
    }

    public void setFlashingSigns(FlashingSigns flashingSigns) {
        this.flashingSigns = flashingSigns;
    }
}

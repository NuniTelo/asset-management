package asset.management.system.assetmanagement.Models.MainModel;

//AssetHistory for modifying the asset
public class AssetHistory {

    private String actionTaken;
    private String description;
    private String date;
    private String authorizedUserName;
    private double actionCost;

    public AssetHistory(String actionTaken, String description,
                        String date,
                        String authorizedUserName,
                        double actionCost)
    {
        this.actionTaken = actionTaken;
        this.description = description;
        this.date = date;
        this.authorizedUserName = authorizedUserName;
        this.actionCost = actionCost;
    }


    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthorizedUserName() {
        return authorizedUserName;
    }

    public void setAuthorizedUserName(String authorizedUserName) {
        this.authorizedUserName = authorizedUserName;
    }

    public double getActionCost() {
        return actionCost;
    }

    public void setActionCost(double actionCost) {
        this.actionCost = actionCost;
    }
}

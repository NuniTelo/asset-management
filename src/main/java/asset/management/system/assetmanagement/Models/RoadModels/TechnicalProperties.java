package asset.management.system.assetmanagement.Models.RoadModels;

import java.util.List;
//Technical Properties for an asset
public class TechnicalProperties {
    private int noOfLanes;
    private double operationHours;
    private List<String> busLines;
    private double speedLimit;
    private List<String> users;

    public TechnicalProperties(int noOfLanes,
                               double operationHours,
                               List<String> busLines,
                               double speedLimit,
                               List<String> users)
    {
        this.noOfLanes = noOfLanes;
        this.operationHours = operationHours;
        this.busLines = busLines;
        this.speedLimit = speedLimit;
        this.users = users;
    }

    public int getNoOfLanes() {
        return noOfLanes;
    }

    public void setNoOfLanes(int noOfLanes) {
        this.noOfLanes = noOfLanes;
    }

    public double getOperationHours() {
        return operationHours;
    }

    public void setOperationHours(double operationHours) {
        this.operationHours = operationHours;
    }

    public List<String> getBusLines() {
        return busLines;
    }

    public void setBusLines(List<String> busLines) {
        this.busLines = busLines;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}

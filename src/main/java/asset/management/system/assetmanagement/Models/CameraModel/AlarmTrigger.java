package asset.management.system.assetmanagement.Models.CameraModel;

public class AlarmTrigger {
    private boolean motionDedection;
    private boolean tamperingAlarm;
    private boolean networkDisconnect;

    public AlarmTrigger(boolean motionDedection,
                        boolean tamperingAlarm,
                        boolean networkDisconnect)
    {
        this.motionDedection = motionDedection;
        this.tamperingAlarm = tamperingAlarm;
        this.networkDisconnect = networkDisconnect;
    }

    public boolean isMotionDedection() {
        return motionDedection;
    }

    public void setMotionDedection(boolean motionDedection) {
        this.motionDedection = motionDedection;
    }

    public boolean isTamperingAlarm() {
        return tamperingAlarm;
    }

    public void setTamperingAlarm(boolean tamperingAlarm) {
        this.tamperingAlarm = tamperingAlarm;
    }

    public boolean isNetworkDisconnect() {
        return networkDisconnect;
    }

    public void setNetworkDisconnect(boolean networkDisconnect) {
        this.networkDisconnect = networkDisconnect;
    }
}

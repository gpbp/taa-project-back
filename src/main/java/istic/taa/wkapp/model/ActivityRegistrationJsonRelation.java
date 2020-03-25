package istic.taa.wkapp.model;

import javax.validation.constraints.NotNull;

public class ActivityRegistrationJsonRelation {
    @NotNull
    private int userId;

    @NotNull
    private int activityId;

    @NotNull
    private int locationId;

    @NotNull
    private int constraintsId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getConstraintsId() {
        return constraintsId;
    }

    public void setConstraintsId(int constraintsId) {
        this.constraintsId = constraintsId;
    }
}

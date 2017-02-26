package com.lewiswei.microservice.model;

import java.util.Date;

/**
 * Created by Lewis Wei on 17/2/26.
 */
public class RewardRedeemed {

    private String rewardId;

    private Date redeemedOn;

    private int pointCost;

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public Date getRedeemedOn() {
        return redeemedOn;
    }

    public void setRedeemedOn(Date redeemedOn) {
        this.redeemedOn = redeemedOn;
    }

    public int getPointCost() {
        return pointCost;
    }

    public void setPointCost(int pointCost) {
        this.pointCost = pointCost;
    }
}

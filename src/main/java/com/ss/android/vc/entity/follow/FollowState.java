package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class FollowState implements Serializable {
    private static final long serialVersionUID = 1;
    private FollowDataType dataType;
    private String senderId;
    private FollowWebData webData;

    public FollowDataType getDataType() {
        return this.dataType;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public FollowWebData getWebData() {
        return this.webData;
    }

    public String getPayload() {
        FollowWebData followWebData;
        if (this.dataType != FollowDataType.FOLLOW_WEB_DATA || (followWebData = this.webData) == null) {
            return null;
        }
        return followWebData.getPayload();
    }

    public String getStrategyId() {
        FollowWebData followWebData;
        if (this.dataType != FollowDataType.FOLLOW_WEB_DATA || (followWebData = this.webData) == null) {
            return null;
        }
        return followWebData.getStrategyId();
    }

    public String toString() {
        return "strategyId = " + getStrategyId() + ", payload = " + getPayload();
    }

    public void setDataType(FollowDataType followDataType) {
        this.dataType = followDataType;
    }

    public void setSenderId(String str) {
        this.senderId = str;
    }

    public void setWebData(FollowWebData followWebData) {
        this.webData = followWebData;
    }
}

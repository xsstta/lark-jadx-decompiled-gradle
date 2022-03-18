package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class FollowPatch implements Serializable {
    private static final long serialVersionUID = 1;
    private FollowDataType dataType;
    private Type opType;
    private String senderId;
    private FollowWebData webData;

    public enum Type {
        UNKNOWN_PATCH_TYPE(0),
        APPEND_TYPE(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_PATCH_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return APPEND_TYPE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public FollowDataType getDataType() {
        return this.dataType;
    }

    public Type getOpType() {
        return this.opType;
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

    public void setOpType(Type type) {
        this.opType = type;
    }

    public void setSenderId(String str) {
        this.senderId = str;
    }

    public void setWebData(FollowWebData followWebData) {
        this.webData = followWebData;
    }
}

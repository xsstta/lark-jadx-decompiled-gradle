package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class FollowWebData implements Serializable {
    private static final long serialVersionUID = 1;
    private long id;
    private String payload;
    private String strategyId;

    public long getId() {
        return this.id;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getStrategyId() {
        return this.strategyId;
    }

    public String toString() {
        return "FollowWebData{id=" + this.id + ", strategyId='" + this.strategyId + '\'' + ", payload='" + this.payload + '\'' + '}';
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setStrategyId(String str) {
        this.strategyId = str;
    }
}

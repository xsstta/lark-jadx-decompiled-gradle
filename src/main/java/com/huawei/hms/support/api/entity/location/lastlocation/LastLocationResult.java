package com.huawei.hms.support.api.entity.location.lastlocation;

import com.huawei.hms.support.api.client.Result;

public class LastLocationResult extends Result {
    private GetLastLocationResponse getLastLocationResponse;

    public GetLastLocationResponse getLastLocationResponse() {
        return this.getLastLocationResponse;
    }

    public void setLastLocationResponse(GetLastLocationResponse getLastLocationResponse2) {
        this.getLastLocationResponse = getLastLocationResponse2;
    }
}

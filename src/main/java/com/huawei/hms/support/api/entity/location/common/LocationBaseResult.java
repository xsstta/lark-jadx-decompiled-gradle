package com.huawei.hms.support.api.entity.location.common;

import com.huawei.hms.support.api.client.Result;

public class LocationBaseResult extends Result {
    private LocationBaseResponse locationBaseResponse;

    public LocationBaseResponse getLocationBaseResponse() {
        return this.locationBaseResponse;
    }

    public void setLocationBaseResponse(LocationBaseResponse locationBaseResponse2) {
        this.locationBaseResponse = locationBaseResponse2;
    }
}

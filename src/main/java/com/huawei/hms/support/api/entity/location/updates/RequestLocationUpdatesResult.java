package com.huawei.hms.support.api.entity.location.updates;

import com.huawei.hms.support.api.client.Result;

public class RequestLocationUpdatesResult extends Result {
    private RequestLocationUpdatesResponse requestLocationUpdatesResponse;

    public RequestLocationUpdatesResponse getRequestLocationUpdatesResponse() {
        return this.requestLocationUpdatesResponse;
    }

    public void setRequestLocationUpdatesResponse(RequestLocationUpdatesResponse requestLocationUpdatesResponse2) {
        this.requestLocationUpdatesResponse = requestLocationUpdatesResponse2;
    }
}

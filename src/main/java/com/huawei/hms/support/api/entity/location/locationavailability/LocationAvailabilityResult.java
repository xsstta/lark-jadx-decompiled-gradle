package com.huawei.hms.support.api.entity.location.locationavailability;

import com.huawei.hms.support.api.client.Result;

public class LocationAvailabilityResult extends Result {
    private GetLocationAvailabilityResponse getLocationAvailabilityResponse;

    public GetLocationAvailabilityResponse getGetLocationAvailabilityResponse() {
        return this.getLocationAvailabilityResponse;
    }

    public void setGetLocationAvailabilityResponse(GetLocationAvailabilityResponse getLocationAvailabilityResponse2) {
        this.getLocationAvailabilityResponse = getLocationAvailabilityResponse2;
    }
}

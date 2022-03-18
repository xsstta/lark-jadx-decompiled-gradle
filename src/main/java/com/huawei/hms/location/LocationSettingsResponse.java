package com.huawei.hms.location;

import com.huawei.hms.common.api.Response;

public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse(LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return ((LocationSettingsResult) getResult()).getLocationSettingsStates();
    }
}

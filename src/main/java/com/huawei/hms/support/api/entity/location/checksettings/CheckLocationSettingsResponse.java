package com.huawei.hms.support.api.entity.location.checksettings;

import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;

public class CheckLocationSettingsResponse extends LocationBaseResponse {
    @Packed
    private LocationSettingsResponse locationSettingsResponse;

    public LocationSettingsResponse getLocationSettingsResponse() {
        return this.locationSettingsResponse;
    }

    public void setLocationSettingsResponse(LocationSettingsResponse locationSettingsResponse2) {
        this.locationSettingsResponse = locationSettingsResponse2;
    }
}

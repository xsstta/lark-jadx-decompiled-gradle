package com.huawei.hms.support.api.entity.location.checksettings;

import com.huawei.hms.support.api.client.Result;

public class CheckLocationSettingsResult extends Result {
    private CheckLocationSettingsResponse checkLocationSettingsResponse;

    public CheckLocationSettingsResponse getCheckLocationSettingsResponse() {
        return this.checkLocationSettingsResponse;
    }

    public void setCheckLocationSettingsResponse(CheckLocationSettingsResponse checkLocationSettingsResponse2) {
        this.checkLocationSettingsResponse = checkLocationSettingsResponse2;
    }
}

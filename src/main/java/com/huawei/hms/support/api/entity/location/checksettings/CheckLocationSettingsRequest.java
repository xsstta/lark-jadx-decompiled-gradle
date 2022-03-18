package com.huawei.hms.support.api.entity.location.checksettings;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class CheckLocationSettingsRequest extends LocationBaseRequest {
    @Packed
    private LocationSettingsRequest locationSettingsRequest;

    public CheckLocationSettingsRequest(Context context) {
        super(context);
    }

    public LocationSettingsRequest getLocationSettingsRequest() {
        return this.locationSettingsRequest;
    }

    public void setLocationSettingsRequest(LocationSettingsRequest locationSettingsRequest2) {
        this.locationSettingsRequest = locationSettingsRequest2;
    }
}

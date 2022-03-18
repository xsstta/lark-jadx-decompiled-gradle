package com.huawei.hms.support.api.entity.location.updates;

import android.location.Location;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;

public class HuaweiLocationInfo extends LocationBaseResponse {
    @Packed
    private Location location;

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location2) {
        this.location = location2;
    }
}

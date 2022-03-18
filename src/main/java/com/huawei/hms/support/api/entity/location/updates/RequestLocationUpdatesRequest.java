package com.huawei.hms.support.api.entity.location.updates;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class RequestLocationUpdatesRequest extends LocationBaseRequest {
    @Packed
    private LocationRequest locationRequest;
    @Packed
    private String uuid;

    public RequestLocationUpdatesRequest(Context context) {
        super(context);
    }

    public LocationRequest getLocationRequest() {
        return this.locationRequest;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setLocationRequest(LocationRequest locationRequest2) {
        this.locationRequest = locationRequest2;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}

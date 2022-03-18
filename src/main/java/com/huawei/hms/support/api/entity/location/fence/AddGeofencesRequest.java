package com.huawei.hms.support.api.entity.location.fence;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class AddGeofencesRequest extends LocationBaseRequest {
    @Packed
    private GeofenceRequest geofencingRequest;

    public AddGeofencesRequest(Context context) {
        super(context);
    }

    public GeofenceRequest getGeofencingRequest() {
        return this.geofencingRequest;
    }

    public void setGeofencingRequest(GeofenceRequest geofenceRequest) {
        this.geofencingRequest = geofenceRequest;
    }
}

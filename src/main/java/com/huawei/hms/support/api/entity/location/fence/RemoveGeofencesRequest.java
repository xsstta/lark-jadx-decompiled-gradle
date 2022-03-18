package com.huawei.hms.support.api.entity.location.fence;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import java.util.List;

public class RemoveGeofencesRequest extends LocationBaseRequest {
    @Packed
    private List<String> geofenceRequestIds;

    public RemoveGeofencesRequest(Context context) {
        super(context);
    }

    public List<String> getGeofenceRequestIds() {
        return this.geofenceRequestIds;
    }

    public void setGeofenceRequestIds(List<String> list) {
        this.geofenceRequestIds = list;
    }
}

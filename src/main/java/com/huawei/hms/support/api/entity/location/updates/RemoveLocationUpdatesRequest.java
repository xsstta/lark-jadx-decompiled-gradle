package com.huawei.hms.support.api.entity.location.updates;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class RemoveLocationUpdatesRequest extends LocationBaseRequest {
    @Packed
    private String uuid;

    public RemoveLocationUpdatesRequest(Context context) {
        super(context);
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}

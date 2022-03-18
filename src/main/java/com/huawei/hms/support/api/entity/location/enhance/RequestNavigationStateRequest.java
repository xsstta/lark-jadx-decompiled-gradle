package com.huawei.hms.support.api.entity.location.enhance;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.NavigationRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class RequestNavigationStateRequest extends LocationBaseRequest {
    @Packed
    private NavigationRequest navigationRequest;
    @Packed
    private String uuid;

    public RequestNavigationStateRequest(Context context) {
        super(context);
    }

    public NavigationRequest getNavigationRequest() {
        return this.navigationRequest;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setNavigationRequest(NavigationRequest navigationRequest2) {
        this.navigationRequest = navigationRequest2;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}

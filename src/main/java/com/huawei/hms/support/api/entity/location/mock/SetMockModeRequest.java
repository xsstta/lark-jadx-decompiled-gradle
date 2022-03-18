package com.huawei.hms.support.api.entity.location.mock;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class SetMockModeRequest extends LocationBaseRequest {
    @Packed
    private boolean isMockMode;

    public SetMockModeRequest(Context context) {
        super(context);
    }

    public boolean isMockMode() {
        return this.isMockMode;
    }

    public void setMockMode(boolean z) {
        this.isMockMode = z;
    }
}

package com.huawei.hms.support.api.entity.location.activityrecognition;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import java.util.List;

public class RequestActivityConversionRequest extends LocationBaseRequest {
    @Packed
    private List<ActivityConversionInfo> activityConversions;

    public RequestActivityConversionRequest(Context context) {
        super(context);
    }

    public List<ActivityConversionInfo> getActivityConversions() {
        return this.activityConversions;
    }

    public void setActivityConversions(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }
}

package com.huawei.hms.support.api.entity.location.enhance;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class RequestReportLocationRequest extends LocationBaseRequest {
    @Packed
    private String reportType;

    public RequestReportLocationRequest(Context context) {
        super(context);
    }

    public String getReportType() {
        return this.reportType;
    }

    public void setReportType(String str) {
        this.reportType = str;
    }
}

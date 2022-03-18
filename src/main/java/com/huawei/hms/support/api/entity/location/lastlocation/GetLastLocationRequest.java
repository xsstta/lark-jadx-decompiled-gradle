package com.huawei.hms.support.api.entity.location.lastlocation;

import android.content.Context;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;

public class GetLastLocationRequest extends LocationBaseRequest {
    @Packed
    private String countryCode;
    @Packed
    private String language;
    @Packed
    private boolean needAddress;

    public GetLastLocationRequest(Context context) {
        super(context);
    }

    public GetLastLocationRequest(Context context, boolean z, String str, String str2) {
        super(context);
        this.needAddress = z;
        this.language = str;
        this.countryCode = str2;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public boolean getNeedAddress() {
        return this.needAddress;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setNeedAddress(boolean z) {
        this.needAddress = z;
    }
}

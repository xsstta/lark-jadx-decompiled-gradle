package com.huawei.hms.location;

import android.os.Bundle;
import android.os.Parcel;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.locationSdk.y0;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;
import java.util.HashMap;
import java.util.Map;

public class NavigationResult extends LocationBaseResponse {
    private Map<String, Object> extras;
    private int possibility = -1;
    private int state = -1;

    public NavigationResult() {
    }

    protected NavigationResult(Parcel parcel) {
        this.state = parcel.readInt();
        this.possibility = parcel.readInt();
        this.extras = new HashMap();
        Bundle readBundle = parcel.readBundle(NavigationResult.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                Object obj = readBundle.get(str);
                if (obj != null) {
                    this.extras.put(str, obj);
                }
            }
        }
    }

    private final Map<String, Object> getExtras() {
        return this.extras;
    }

    private void setExtras(Map<String, Object> map) {
        this.extras = map;
    }

    public final int getPossibility() {
        return this.possibility;
    }

    public final int getState() {
        return this.state;
    }

    public void setPossibility(int i) throws ApiException {
        if (i > 100 || i < 0) {
            throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
        }
        this.possibility = i;
    }

    public void setState(int i) {
        this.state = i;
    }
}

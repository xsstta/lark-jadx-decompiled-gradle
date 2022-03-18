package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.locationSdk.AbstractC23654i;
import com.huawei.hms.locationSdk.C23643b;
import com.huawei.hms.locationSdk.C23668s;
import com.huawei.hms.locationSdk.v0;

public class LocationEnhanceService {

    /* renamed from: a */
    private AbstractC23654i f58382a;

    public LocationEnhanceService(Activity activity) {
        this.f58382a = C23643b.m86021c(activity, (C23668s) null);
    }

    public LocationEnhanceService(Context context) {
        this.f58382a = C23643b.m86022c(context, (C23668s) null);
    }

    public AbstractC23432f<NavigationResult> getNavigationState(NavigationRequest navigationRequest) {
        v0.m86110f().mo83540d();
        return this.f58382a.mo83513a(navigationRequest);
    }
}

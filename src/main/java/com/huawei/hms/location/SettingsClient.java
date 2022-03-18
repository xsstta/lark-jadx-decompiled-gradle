package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.locationSdk.AbstractC23647f;
import com.huawei.hms.locationSdk.C23643b;
import com.huawei.hms.locationSdk.C23668s;

public class SettingsClient {

    /* renamed from: a */
    private Context f58386a;

    /* renamed from: b */
    private Activity f58387b;

    /* renamed from: c */
    private AbstractC23647f f58388c;

    public SettingsClient(Activity activity) {
        this.f58387b = activity;
        this.f58388c = C23643b.m86019b(activity, (C23668s) null);
    }

    public SettingsClient(Context context) {
        this.f58386a = context;
        this.f58388c = C23643b.m86020b(context, (C23668s) null);
    }

    public AbstractC23432f<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return this.f58388c.mo83503a(locationSettingsRequest);
    }
}

package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.locationSdk.AbstractC23657l;
import com.huawei.hms.locationSdk.C23643b;
import com.huawei.hms.locationSdk.C23668s;
import java.util.List;

public class GeofenceService {

    /* renamed from: a */
    private AbstractC23657l f58381a;

    public GeofenceService(Activity activity) {
        this.f58381a = C23643b.m86023d(activity, (C23668s) null);
    }

    public GeofenceService(Context context) {
        this.f58381a = C23643b.m86024d(context, (C23668s) null);
    }

    public AbstractC23432f<Void> createGeofenceList(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        return this.f58381a.mo83518a(geofenceRequest, pendingIntent);
    }

    public AbstractC23432f<Void> deleteGeofenceList(PendingIntent pendingIntent) {
        return this.f58381a.mo83517a(pendingIntent);
    }

    public AbstractC23432f<Void> deleteGeofenceList(List<String> list) {
        return this.f58381a.mo83519a(list);
    }
}

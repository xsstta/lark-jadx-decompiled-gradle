package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;

/* renamed from: com.huawei.hms.locationSdk.f */
public interface AbstractC23647f {
    /* renamed from: a */
    AbstractC23432f<Void> mo83496a();

    /* renamed from: a */
    AbstractC23432f<Void> mo83497a(PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC23432f<Void> mo83498a(Location location);

    /* renamed from: a */
    AbstractC23432f<Void> mo83499a(LocationCallback locationCallback);

    /* renamed from: a */
    AbstractC23432f<HWLocation> mo83500a(LocationRequest locationRequest);

    /* renamed from: a */
    AbstractC23432f<Void> mo83501a(LocationRequest locationRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC23432f<Void> mo83502a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    /* renamed from: a */
    AbstractC23432f<LocationSettingsResponse> mo83503a(LocationSettingsRequest locationSettingsRequest);

    /* renamed from: a */
    AbstractC23432f<Void> mo83504a(boolean z);

    /* renamed from: b */
    AbstractC23432f<LocationAvailability> mo83505b();

    /* renamed from: b */
    AbstractC23432f<Void> mo83506b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    /* renamed from: c */
    AbstractC23432f<Location> mo83507c();
}

package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.locationSdk.AbstractC23647f;
import com.huawei.hms.locationSdk.C23643b;
import com.huawei.hms.locationSdk.C23668s;
import com.huawei.hms.locationSdk.v0;

public class FusedLocationProviderClient {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    /* renamed from: a */
    private final Context f58364a;

    /* renamed from: b */
    private AbstractC23647f f58365b;

    public FusedLocationProviderClient(Activity activity) {
        this.f58364a = activity.getApplicationContext();
        this.f58365b = C23643b.m86019b(activity, (C23668s) null);
    }

    public FusedLocationProviderClient(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f58364a = applicationContext;
        this.f58365b = C23643b.m86020b(applicationContext, (C23668s) null);
    }

    public AbstractC23432f<Void> flushLocations() {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83496a();
    }

    public AbstractC23432f<Location> getLastLocation() {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83507c();
    }

    public AbstractC23432f<HWLocation> getLastLocationWithAddress(LocationRequest locationRequest) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83500a(locationRequest);
    }

    public AbstractC23432f<LocationAvailability> getLocationAvailability() {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83505b();
    }

    public AbstractC23432f<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83497a(pendingIntent);
    }

    public AbstractC23432f<Void> removeLocationUpdates(LocationCallback locationCallback) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83499a(locationCallback);
    }

    public AbstractC23432f<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83501a(locationRequest, pendingIntent);
    }

    public AbstractC23432f<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83506b(locationRequest, locationCallback, looper);
    }

    public AbstractC23432f<Void> requestLocationUpdatesEx(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83502a(locationRequest, locationCallback, looper);
    }

    public AbstractC23432f<Void> setMockLocation(Location location) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83498a(location);
    }

    public AbstractC23432f<Void> setMockMode(boolean z) {
        v0.m86110f().mo83540d();
        return this.f58365b.mo83504a(z);
    }
}

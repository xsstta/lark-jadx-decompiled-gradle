package com.huawei.hms.location;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import java.util.ArrayList;
import java.util.List;

public class GeofenceData {
    public static final String KEY_ERROR_CODE = "hms_error_code";
    public static final String KEY_GEOFENCE_LIST = "com.huawei.hms.location.geofence.geofence_list";
    public static final String KEY_LOCATION = "com.huawei.hms.location.geofence.location";
    public static final String KEY_TRANSITION = "com.huawei.hms.location.geofence.conversion";

    /* renamed from: a */
    private final int f58374a;

    /* renamed from: b */
    private final int f58375b;

    /* renamed from: c */
    private final List<Geofence> f58376c;

    /* renamed from: d */
    private final Location f58377d;

    private GeofenceData(int i, int i2, List<Geofence> list, Location location) {
        this.f58374a = i;
        this.f58375b = i2;
        this.f58376c = list;
        this.f58377d = location;
    }

    public static GeofenceData getDataFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(KEY_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra(KEY_TRANSITION, -1);
        if (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4) {
            i = intExtra2;
        }
        Location location = (Location) intent.getParcelableExtra(KEY_LOCATION);
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        Bundle INVOKEVIRTUAL_com_huawei_hms_location_GeofenceData_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra = INVOKEVIRTUAL_com_huawei_hms_location_GeofenceData_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(intent, "com.huawei.hms.location.geofence.geofence_list_bundle");
        ArrayList parcelableArrayList = INVOKEVIRTUAL_com_huawei_hms_location_GeofenceData_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra != null ? INVOKEVIRTUAL_com_huawei_hms_location_GeofenceData_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra.getParcelableArrayList(KEY_GEOFENCE_LIST) : intent.getParcelableArrayListExtra(KEY_GEOFENCE_LIST);
        if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
            arrayList.addAll(parcelableArrayList);
        }
        return new GeofenceData(intExtra, i, arrayList, location);
    }

    public int getConversion() {
        return this.f58375b;
    }

    public List<Geofence> getConvertingGeofenceList() {
        return this.f58376c;
    }

    public Location getConvertingLocation() {
        return this.f58377d;
    }

    public int getErrorCode() {
        return this.f58374a;
    }

    public boolean isFailure() {
        return this.f58374a != -1;
    }

    public boolean isSuccess() {
        return this.f58374a == -1;
    }

    public static Bundle INVOKEVIRTUAL_com_huawei_hms_location_GeofenceData_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}

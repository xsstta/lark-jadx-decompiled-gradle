package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.appsflyer.AFExecutor;

/* renamed from: com.appsflyer.internal.r */
public final class C2030r {

    /* renamed from: com.appsflyer.internal.r$e */
    public static final class C2031e {

        /* renamed from: ǃ */
        public static final C2030r f6981 = new C2030r();
    }

    C2030r() {
    }

    /* renamed from: ι */
    public static Location m8929(Context context) {
        Location location;
        Location location2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (m8928(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                location = locationManager.getLastKnownLocation("network");
            } else {
                location = null;
            }
            if (m8928(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                location2 = locationManager.getLastKnownLocation("gps");
            } else {
                location2 = null;
            }
            if (location2 == null && location == null) {
                location = null;
            } else if (location2 != null || location == null) {
                if ((location == null && location2 != null) || 60000 >= location.getTime() - location2.getTime()) {
                    location = location2;
                }
            }
            if (location != null) {
                return location;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ɩ */
    private static boolean m8928(Context context, String[] strArr) {
        for (String str : strArr) {
            if (AFExecutor.ThreadFactoryC19774.m8715(context, str)) {
                return true;
            }
        }
        return false;
    }
}

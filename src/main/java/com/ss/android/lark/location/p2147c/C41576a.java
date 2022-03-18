package com.ss.android.lark.location.p2147c;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.lark.location.c.a */
public class C41576a {

    /* renamed from: com.ss.android.lark.location.c.a$1 */
    static /* synthetic */ class C415771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105645a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority[] r0 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.location.p2147c.C41576a.C415771.f105645a = r0
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.location.p2147c.C41576a.C415771.f105645a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.DEVICE_SENSORS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.location.p2147c.C41576a.C415771.f105645a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_BALANCED_POWER_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.location.p2147c.C41576a.C415771.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m164977a(Address address) {
        if (address == null) {
            return "";
        }
        String addressLine = address.getAddressLine(0);
        if (TextUtils.isEmpty(addressLine)) {
            addressLine = address.getFeatureName();
        }
        if (TextUtils.isEmpty(addressLine)) {
            return address.getSubLocality();
        }
        return addressLine;
    }

    /* renamed from: a */
    public static LarkLocation m164976a(Context context, Location location) {
        Address address;
        if (location == null) {
            Log.m165389i("LocationManagerUtils", "createLarkLocationFromLarkManager called. locationManagerLocation is null.");
            return null;
        }
        LarkLocation larkLocation = new LarkLocation(location);
        larkLocation.mo149607a(LarkLocation.CoordinateSystem.WGS);
        larkLocation.mo149609a("gps".equals(location.getProvider()));
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(latitude, longitude, 1);
            if (!(fromLocation == null || fromLocation.size() <= 0 || (address = fromLocation.get(0)) == null)) {
                larkLocation.mo149608a(m164977a(address));
                larkLocation.mo149613c(address.getLocality());
                larkLocation.mo149615d(address.getSubLocality());
                larkLocation.mo149611b(address.getAdminArea());
                larkLocation.mo149617e(address.getFeatureName());
                larkLocation.mo149619f(address.getSubThoroughfare());
            }
        } catch (IOException e) {
            Log.m165384e("LocationManagerUtils", "parse address error", e);
        }
        double[] a = C41586e.m165039a(latitude, longitude);
        larkLocation.setLatitude(a[0]);
        larkLocation.setLongitude(a[1]);
        return larkLocation;
    }

    /* renamed from: a */
    public static Set<String> m164978a(LocationManager locationManager, LocationRequestOption.LocationPriority locationPriority) {
        HashSet hashSet = new HashSet();
        if (locationManager == null) {
            Log.m165389i("LocationManagerUtils", "getProviderList called. locationManager is null.");
            return hashSet;
        }
        int i = C415771.f105645a[locationPriority.ordinal()];
        if (i == 1) {
            if (locationManager.isProviderEnabled("gps")) {
                hashSet.add("gps");
            }
            if (locationManager.isProviderEnabled("network")) {
                hashSet.add("network");
            }
            return hashSet;
        } else if (i == 2) {
            if (locationManager.isProviderEnabled("gps")) {
                hashSet.add("gps");
            }
            return hashSet;
        } else if (i != 3) {
            if (locationManager.isProviderEnabled("network")) {
                hashSet.add("network");
            }
            if (locationManager.isProviderEnabled("passive")) {
                hashSet.add("passive");
            }
            return hashSet;
        } else {
            if (locationManager.isProviderEnabled("network")) {
                hashSet.add("network");
            }
            return hashSet;
        }
    }

    /* renamed from: a */
    public static Location m164974a(Context context, LocationManager locationManager, Set<String> set) {
        if (locationManager == null) {
            Log.m165389i("LocationManagerUtils", "getLastKnownLocation called. locationManager is null.");
            return null;
        } else if (set == null || set.isEmpty()) {
            Log.m165389i("LocationManagerUtils", "getLastKnownLocation called. providerSet is null or size is 0");
            return null;
        } else {
            Location a = m164975a(context, locationManager, set, "gps");
            if (a != null) {
                return a;
            }
            Location a2 = m164975a(context, locationManager, set, "network");
            if (a2 != null) {
                return a2;
            }
            return m164975a(context, locationManager, set, "passive");
        }
    }

    /* renamed from: a */
    private static Location m164975a(Context context, LocationManager locationManager, Set<String> set, String str) {
        if ((ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) && set.contains(str)) {
            return locationManager.getLastKnownLocation(str);
        }
        return null;
    }
}

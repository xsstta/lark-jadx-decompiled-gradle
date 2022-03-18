package com.ss.android.lark.locationmessage.p2149b;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.locationmessage.b.e */
public class C41594e {
    /* renamed from: a */
    public static LocationInfo m165059a(LocationInfo locationInfo) {
        if (locationInfo == null) {
            return null;
        }
        if (locationInfo.isNeedGCTLatLng()) {
            return m165063b(locationInfo);
        }
        return locationInfo;
    }

    /* renamed from: a */
    public static boolean m165060a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            Log.m165386e("LocationUtils", e);
            return false;
        }
    }

    /* renamed from: b */
    public static LocationInfo m165063b(LocationInfo locationInfo) {
        if (locationInfo == null) {
            return null;
        }
        if (!locationInfo.isInternal() || !locationInfo.isNeedGCTLatLng()) {
            return locationInfo;
        }
        try {
            double[] a = C41597c.m165069a().mo143916i().mo143929a(C41595f.m165064a(locationInfo.getLatitude()), C41595f.m165064a(locationInfo.getLongitude()));
            return new LocationInfo.C29595a(String.valueOf(a[0]), String.valueOf(a[1])).mo106512a(locationInfo.getMessage()).mo106513a(locationInfo.getName()).mo106516b(locationInfo.getDesc()).mo106511a(locationInfo.getZoomLevel()).mo106514a(locationInfo.isSecretChat()).mo106517b(locationInfo.isInternal()).mo106515a();
        } catch (NumberFormatException e) {
            C53241h.m205895a("LocationUtils", "failed to parseDouble.", e);
            return locationInfo;
        }
    }

    /* renamed from: a */
    private static boolean m165062a(String str, double d) {
        return TextUtils.equals(String.format("%.5f", Double.valueOf(C41595f.m165064a(str))), String.format("%.5f", Double.valueOf(d)));
    }

    /* renamed from: a */
    public static boolean m165061a(LocationInfo locationInfo, double d, double d2) {
        if (locationInfo != null && m165062a(locationInfo.getLatitude(), d) && m165062a(locationInfo.getLongitude(), d2)) {
            return true;
        }
        return false;
    }
}

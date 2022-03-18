package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.location.Location;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.LocationRequestOption;

/* renamed from: com.ss.android.lark.map.a.b.b */
public class C44588b {

    /* renamed from: com.ss.android.lark.map.a.b.b$1 */
    static /* synthetic */ class C445891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f113006a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority[] r0 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.map.p2237a.p2239b.C44588b.C445891.f113006a = r0
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.map.p2237a.p2239b.C44588b.C445891.f113006a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_BALANCED_POWER_ACCURACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.map.p2237a.p2239b.C44588b.C445891.f113006a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_LOW_POWER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.map.p2237a.p2239b.C44588b.C445891.f113006a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.location.listener.LocationRequestOption$LocationPriority r1 = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_NO_POWER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.map.p2237a.p2239b.C44588b.C445891.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m176897a(Context context) {
        if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m176895a(LocationRequestOption.LocationPriority locationPriority) {
        int i = C445891.f113006a[locationPriority.ordinal()];
        if (i == 1) {
            return 100;
        }
        if (i == 3) {
            return 104;
        }
        if (i != 4) {
            return 102;
        }
        return LocationRequest.PRIORITY_NO_POWER;
    }

    /* renamed from: a */
    public static LarkLocation m176896a(Location location) {
        LarkLocation larkLocation = new LarkLocation(location);
        larkLocation.getLatitude();
        larkLocation.getLongitude();
        larkLocation.mo149607a(LarkLocation.CoordinateSystem.WGS);
        larkLocation.mo149609a("gps".equals(location.getProvider()));
        return larkLocation;
    }
}

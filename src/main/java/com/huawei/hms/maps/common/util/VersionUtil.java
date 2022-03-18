package com.huawei.hms.maps.common.util;

import android.content.Context;
import com.huawei.hms.maps.mac;
import com.huawei.hms.maps.mcq;

public class VersionUtil {
    public static int isHmsMapAvailable(Context context) {
        if (("cn".equalsIgnoreCase(mac.m86189a("ro.product.locale.region", "")) || "cn".equalsIgnoreCase(mac.m86189a("ro.hw.country", ""))) && !mac.m86190a()) {
            mcq.m86886b("MapUtil", "isHmsMapAvailable is 2");
            return 2;
        } else if (mac.m86188a(context) != 0) {
            mcq.m86886b("MapUtil", "isHmsMapAvailable is 1");
            return 1;
        } else {
            mcq.m86886b("MapUtil", "isHmsMapAvailable is 0");
            return 0;
        }
    }
}

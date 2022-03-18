package com.huawei.hms.maps;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class MapsInitializer {

    /* renamed from: a */
    private static boolean f58556a;

    public static synchronized int initialize(Context context) {
        synchronized (MapsInitializer.class) {
            BitmapDescriptorFactory.setContext(context);
        }
        return 0;
    }

    public static void setApiKey(String str) {
        MapClientIdentify.m86146a(str);
    }
}

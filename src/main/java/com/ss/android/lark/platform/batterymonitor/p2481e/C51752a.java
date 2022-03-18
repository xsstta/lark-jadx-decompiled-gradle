package com.ss.android.lark.platform.batterymonitor.p2481e;

import android.content.Context;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57765ac;

/* renamed from: com.ss.android.lark.platform.batterymonitor.e.a */
public final class C51752a {
    /* renamed from: a */
    public static boolean m200649a(Context context) {
        Log.m165389i("BatteryMonitor", "BatteryUtils current process: " + C26252ad.m94992a(context));
        if (C57765ac.m224188b(context) || C57765ac.m224187a(context) || C57765ac.m224189c(context) || C57765ac.m224193g(context)) {
            return false;
        }
        return true;
    }
}

package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* renamed from: com.huawei.hms.stats.b */
public class C23782b {

    /* renamed from: a */
    public static HiAnalyticsInstance f58921a;

    /* renamed from: a */
    public static HiAnalyticsInstance m86955a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f58921a = analyticsInstance;
        return analyticsInstance;
    }

    /* renamed from: a */
    public static void m86956a(Context context, int i) {
        if (m86955a(context) != null) {
            f58921a.onReport(i);
        }
    }

    /* renamed from: a */
    public static void m86958a(Context context, String str, String str2) {
        if (m86955a(context) != null) {
            f58921a.onEvent(context, str, str2);
        }
    }

    /* renamed from: a */
    public static void m86957a(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m86955a(context) != null) {
            f58921a.onEvent(i, str, linkedHashMap);
        }
    }
}

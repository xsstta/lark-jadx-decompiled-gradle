package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

public class HmsHiAnalyticsUtils {
    public static void enableLog() {
        l1.m85846a();
    }

    public static void onReport() {
        j1.m85775c();
    }

    public static boolean getInitFlag() {
        return j1.m85774b();
    }

    public static void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        j1.m85772a(i, str, linkedHashMap);
    }

    public static void onEvent(Context context, String str, String str2) {
        j1.m85773a(context, str, str2);
    }

    public static void init(Context context, boolean z, boolean z2, boolean z3, String str, String str2) {
        new k1(context).mo83079a(z).mo83082c(z2).mo83081b(z3).mo83077a(0, str).mo83077a(1, str).mo83078a(str2).mo83080a();
    }
}

package com.bytedance.lynx.webview.glue.sdk112;

import com.bytedance.lynx.webview.glue.sdk111.IGlueToSdk111;
import com.bytedance.lynx.webview.internal.C19979m;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.util.C20048g;

public abstract class IGlueToSdk112 extends IGlueToSdk111 {
    public static String getIsolateDirectorySuffix() {
        return C20011y.m73018p();
    }

    public static boolean hasInitializeNative() {
        return C20011y.m72976a().mo67904H();
    }

    public static boolean setInitializeNative() {
        return C20011y.m72976a().mo67905I();
    }

    public static void onEffectiveConnectionTypeChanged(int i) {
        C19979m.m72869a(i);
    }

    public static boolean isEnableSelectMenu(boolean z) {
        return C20011y.m73019q();
    }

    public static void LogD(String str, String str2) {
        C20048g.m73162b(str, str2);
    }

    public static void LogE(String str, String str2) {
        C20048g.m73164d(str, str2);
    }

    public static void LogI(String str, String str2) {
        C20048g.m73161a(str, str2);
    }

    public static void onRTTOrThroughputEstimatesComputed(long j, long j2, int i) {
        C19979m.m72870a(j, j2, i);
    }
}

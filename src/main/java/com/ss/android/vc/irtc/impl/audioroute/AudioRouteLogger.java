package com.ss.android.vc.irtc.impl.audioroute;

import com.ss.android.vc.irtc.C61064p;

public class AudioRouteLogger {
    /* renamed from: d */
    public static void m237436d(String str, String str2) {
        C61064p.m237486b("RtcAudioRoute_" + str, str2);
    }

    /* renamed from: e */
    public static void m237437e(String str, String str2) {
        C61064p.m237487c("RtcAudioRoute_" + str, str2);
    }

    /* renamed from: i */
    public static void m237438i(String str, String str2) {
        C61064p.m237485a("RtcAudioRoute_" + str, str2);
    }

    public static void monitor(String str, String str2) {
        m237436d(str, str2);
        C61064p.m237488d("RtcAudioRoute_" + str, str2);
    }
}

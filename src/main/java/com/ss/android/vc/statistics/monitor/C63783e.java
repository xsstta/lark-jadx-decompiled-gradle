package com.ss.android.vc.statistics.monitor;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;

/* renamed from: com.ss.android.vc.statistics.monitor.e */
public class C63783e {
    /* renamed from: a */
    public static void m250420a(boolean z, VideoChat videoChat) {
        if (z) {
            C63726b.m249912a("vcex_calling_client_timeout", 1, videoChat);
        } else {
            C63726b.m249912a("vcex_ringing_client_timeout", 1, videoChat);
        }
    }
}

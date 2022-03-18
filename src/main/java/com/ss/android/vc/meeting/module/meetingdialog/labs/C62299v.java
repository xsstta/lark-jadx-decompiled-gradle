package com.ss.android.vc.meeting.module.meetingdialog.labs;

import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.v */
public class C62299v {

    /* renamed from: a */
    private static boolean f156533a;

    /* renamed from: a */
    public static synchronized void m243370a() {
        synchronized (C62299v.class) {
            f156533a = true;
        }
    }

    /* renamed from: b */
    public static synchronized void m243372b() {
        synchronized (C62299v.class) {
            f156533a = false;
        }
    }

    /* renamed from: a */
    public static synchronized void m243371a(C61303k kVar) {
        ByteRtc y;
        synchronized (C62299v.class) {
            if (!(f156533a || kVar == null || (y = kVar.mo212165y()) == null)) {
                y.mo212017d();
            }
        }
    }
}

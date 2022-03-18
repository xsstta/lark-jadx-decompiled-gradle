package com.ss.android.vc.statistics.p3180a;

import android.text.TextUtils;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.statistics.a.e */
public class C63693e {

    /* renamed from: a */
    private static String f160784a;

    /* renamed from: b */
    private static String f160785b;

    /* renamed from: c */
    private static String f160786c;

    /* renamed from: d */
    private static String f160787d;

    /* renamed from: e */
    private static String f160788e;

    /* renamed from: f */
    private static String f160789f;

    /* renamed from: c */
    public static void m249686c() {
        if (!TextUtils.isEmpty(f160785b)) {
            C63686a.m249660a(f160785b, null, null, null, null);
        }
    }

    /* renamed from: d */
    public static void m249688d() {
        if (!TextUtils.isEmpty(f160785b)) {
            C63686a.m249663b(f160785b, null, null, null, null);
        }
    }

    /* renamed from: f */
    public static void m249690f() {
        f160787d = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_open_camera_time, null, null, null, null);
    }

    /* renamed from: a */
    public static void m249680a() {
        f160784a = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_enter_onthecall_total, null, null, null, null);
        f160785b = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_enter_onthecall_pure, null, null, null, null);
    }

    /* renamed from: b */
    public static void m249683b() {
        if (!TextUtils.isEmpty(f160784a)) {
            C63686a.m249665c(f160784a, null, null, null, null);
            f160784a = null;
        }
        if (!TextUtils.isEmpty(f160785b)) {
            C63686a.m249665c(f160785b, null, null, null, null);
            f160785b = null;
        }
    }

    /* renamed from: g */
    public static void m249691g() {
        if (!TextUtils.isEmpty(f160787d)) {
            C63686a.m249665c(f160787d, null, null, null, null);
            f160787d = null;
        }
    }

    /* renamed from: h */
    public static void m249692h() {
        if (!TextUtils.isEmpty(f160788e)) {
            C63686a.m249665c(f160788e, null, null, null, null);
            f160788e = null;
        }
    }

    /* renamed from: i */
    public static void m249693i() {
        if (!TextUtils.isEmpty(f160789f)) {
            C63686a.m249665c(f160789f, null, null, null, null);
            f160789f = null;
        }
    }

    /* renamed from: e */
    public static void m249689e() {
        if (!TextUtils.isEmpty(f160784a) || !TextUtils.isEmpty(f160785b)) {
            C60700b.m235851b("PreviewAppreciable", "[abortEnterOnTheCall]", f160784a + ", " + f160785b);
            f160784a = null;
            f160785b = null;
        }
    }

    /* renamed from: a */
    public static void m249681a(C61303k kVar) {
        if (m249687c(kVar)) {
            f160786c = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_rtc_connect_time, null, null, null, null);
        }
    }

    /* renamed from: b */
    public static void m249684b(C61303k kVar) {
        if (!TextUtils.isEmpty(f160786c)) {
            C63686a.m249665c(f160786c, null, null, null, null);
            f160786c = null;
        }
    }

    /* renamed from: c */
    private static boolean m249687c(C61303k kVar) {
        if (!(kVar == null || kVar.mo212056e() == null || kVar.mo212056e().getParticipants() == null)) {
            int i = 0;
            for (Participant participant : kVar.mo212056e().getParticipants()) {
                if (participant != null && participant.getStatus() == Participant.Status.ON_THE_CALL && (i = i + 1) > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m249682a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_source", str);
        f160788e = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_window_switch_time, null, null, null, hashMap);
    }

    /* renamed from: b */
    public static void m249685b(String str) {
        if (VCAppLifeCycle.m236255b()) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_source", str);
            f160789f = C63686a.m249658a(Scene.VCOnTheCall, Event.vc_window_return_time, null, null, null, hashMap);
            return;
        }
        f160789f = null;
    }
}

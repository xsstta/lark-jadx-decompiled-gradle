package com.ss.android.vc.meeting.module.p3130k.p3131a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.net.service.VCSettingsService;

/* renamed from: com.ss.android.vc.meeting.module.k.a.a */
public class C62003a {

    /* renamed from: a */
    public static int f155792a;

    /* renamed from: b */
    public static Boolean f155793b;

    /* renamed from: c */
    public static volatile C61999a f155794c;

    /* renamed from: a */
    public static void m242249a() {
        m242252a(C60776r.m236157o());
    }

    /* renamed from: c */
    public static void m242256c() {
        f155792a = -1;
        f155794c = null;
    }

    /* renamed from: b */
    public static boolean m242255b() {
        Boolean bool = f155793b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        JSONObject d = m242257d();
        if (d != null) {
            JSONObject jSONObject = d.getJSONObject("xiaomi");
            if (jSONObject != null && jSONObject.containsKey("supportCameraView") && jSONObject.getInteger("supportCameraView").intValue() == 1 && C26246a.m94979c(ar.m236694a()) >= jSONObject.getInteger("versionCode").intValue()) {
                z = true;
            }
            f155793b = Boolean.valueOf(z);
        }
        return z;
    }

    /* renamed from: d */
    private static JSONObject m242257d() {
        String settings = VCSettingsService.getSettings("vc_pad_config");
        if (TextUtils.isEmpty(settings)) {
            return null;
        }
        C60700b.m235851b("PadOrientationHandler", "[isSupportCameraView]", "setting = " + settings);
        try {
            JSONObject parseObject = JSON.parseObject(settings);
            if (parseObject != null) {
                return parseObject.getJSONObject("pad");
            }
            return null;
        } catch (Exception e) {
            C60700b.m235851b("PadOrientationHandler", "[isSupportCameraView]", " JSON exception= " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m242251a(C61999a aVar) {
        f155794c = aVar;
    }

    /* renamed from: a */
    public static void m242252a(boolean z) {
        m242253a(VCAppLifeCycle.m236255b(), z);
    }

    /* renamed from: b */
    public static void m242254b(boolean z) {
        if (C60776r.m236159q() && C60776r.m236157o()) {
            int g = C61999a.m242221g();
            if (!z) {
                C61237h.m238223a().mo210535d(0);
            } else if (g == 90) {
                C61237h.m238223a().mo210535d(270);
            } else if (g == 270) {
                C61237h.m238223a().mo210535d(90);
            }
        }
    }

    /* renamed from: a */
    public static void m242250a(int i) {
        int c = C61999a.m242218c(i);
        if (f155792a != c) {
            f155792a = c;
            int g = C61999a.m242221g();
            C60700b.m235851b("PadOrientationHandler", "[handleMagicWindowRotationFromSensor]", "sensorDegree: " + f155792a + " rotationDegree:" + g);
            if (g != 0) {
                m242252a(true);
            } else if (!VCAppLifeCycle.m236255b() && C60776r.m236159q()) {
                if (c == 270) {
                    C61237h.m238223a().mo210544g(0);
                } else if (c == 90) {
                    C61237h.m238223a().mo210544g(180);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r5 == 270) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r5 == 270) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m242253a(boolean r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a.m242253a(boolean, boolean):void");
    }
}

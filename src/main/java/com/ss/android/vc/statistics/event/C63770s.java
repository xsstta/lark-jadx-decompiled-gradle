package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.service.impl.C63682b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.s */
public class C63770s {

    /* renamed from: a */
    private static int f160931a = 0;

    /* renamed from: b */
    private static long f160932b = 0;

    /* renamed from: c */
    private static long f160933c = 0;

    /* renamed from: d */
    private static long f160934d = Long.MAX_VALUE;

    /* renamed from: e */
    private static float f160935e = 0.0f;

    /* renamed from: f */
    private static long f160936f = Long.MIN_VALUE;

    /* renamed from: g */
    private static long f160937g;

    /* renamed from: h */
    private static long f160938h;

    /* renamed from: i */
    private static long f160939i;

    /* renamed from: j */
    private static long f160940j;

    /* renamed from: k */
    private static boolean f160941k;

    /* renamed from: b */
    public static void m250364b() {
        f160937g = System.currentTimeMillis();
    }

    /* renamed from: d */
    public static void m250366d() {
        if (!f160941k) {
            f160939i = System.currentTimeMillis();
            f160941k = true;
        }
    }

    /* renamed from: f */
    private static boolean m250368f() {
        if (f160937g != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m250367e() {
        if (f160941k) {
            long currentTimeMillis = System.currentTimeMillis();
            f160940j = currentTimeMillis;
            m250362a(currentTimeMillis - f160939i);
            f160941k = false;
        }
    }

    /* renamed from: c */
    public static void m250365c() {
        long currentTimeMillis = System.currentTimeMillis();
        f160938h = currentTimeMillis;
        f160933c = currentTimeMillis - f160937g;
        if (f160941k) {
            m250362a(currentTimeMillis - f160939i);
            f160941k = false;
        }
        int i = f160931a;
        if (i != 0) {
            f160935e = ((float) f160932b) / ((float) i);
        }
    }

    /* renamed from: g */
    private static void m250369g() {
        f160931a = 0;
        f160932b = 0;
        f160933c = 0;
        f160934d = Long.MAX_VALUE;
        f160935e = BitmapDescriptorFactory.HUE_RED;
        f160936f = Long.MIN_VALUE;
        f160937g = 0;
        f160938h = 0;
        f160939i = 0;
        f160940j = 0;
        f160941k = false;
    }

    /* renamed from: a */
    public static void m250361a() {
        if (m250368f()) {
            try {
                C60700b.m235851b("FollowActionVersionLagEvent", "[sendFollowActionVersionLagEvent]", "sendEvent");
                m250365c();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, "lag");
                jSONObject.put("count", f160931a);
                jSONObject.put("duration", f160932b);
                jSONObject.put("total", f160933c);
                long j = f160934d;
                long j2 = 0;
                if (j == Long.MAX_VALUE) {
                    j = 0;
                }
                jSONObject.put("min_cost", j);
                jSONObject.put("ave_cost", String.valueOf(f160935e));
                long j3 = f160936f;
                if (j3 != Long.MIN_VALUE) {
                    j2 = j3;
                }
                jSONObject.put("max_cost", j2);
                C63682b.m249642a("vc_meeting_magic_share_stat", jSONObject);
            } catch (JSONException e) {
                C60700b.m235864f("FollowActionVersionLagEvent", "[sendFollowActionVersionLagEvent]", "JSONException");
                e.printStackTrace();
            } catch (Throwable th) {
                m250369g();
                throw th;
            }
            m250369g();
        }
    }

    /* renamed from: a */
    private static void m250362a(long j) {
        f160932b += j;
        f160931a++;
        if (f160934d > j) {
            f160934d = j;
        }
        if (f160936f < j) {
            f160936f = j;
        }
    }

    /* renamed from: a */
    public static void m250363a(RNFollowEvent rNFollowEvent) {
        if (rNFollowEvent == null) {
            C60700b.m235851b("FollowActionVersionLagEvent", "[process]", "rnFollowEvent is null");
        } else if (rNFollowEvent.dataJson == null) {
            C60700b.m235851b("FollowActionVersionLagEvent", "[process]", "rnFollowEvent.dataJson is null");
        } else if (rNFollowEvent.dataJson.length() > 2) {
            try {
                String string = ((JSONObject) new JSONArray(rNFollowEvent.dataJson).get(0)).getString("state");
                if (TextUtils.equals(string, "true")) {
                    m250366d();
                } else if (TextUtils.equals(string, "false")) {
                    m250367e();
                }
            } catch (JSONException e) {
                C60700b.m235864f("FollowActionVersionLagEvent", "[process]", "JSONException");
                e.printStackTrace();
            }
        }
    }
}

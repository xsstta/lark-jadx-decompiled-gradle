package com.ss.android.vc.statistics.p3180a;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.p3069b.p3073d.C60681a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.a.d */
public class C63690d {

    /* renamed from: a */
    public static final String f160779a = "d";

    /* renamed from: b */
    public static volatile long f160780b;

    /* renamed from: c */
    public static volatile long f160781c;

    /* renamed from: a */
    public static void m249677a() {
        C60700b.m235851b(f160779a, "[recordMemory]", "start");
        C60735ab.m236018e(new Runnable() {
            /* class com.ss.android.vc.statistics.p3180a.C63690d.RunnableC636922 */

            public void run() {
                C63690d.f160780b = C60681a.m235782a(ar.m236694a());
                C63690d.f160781c = C60681a.m235781a() - C60681a.m235783b(ar.m236694a());
                String str = C63690d.f160779a;
                C60700b.m235851b(str, "[recordMemory2]", "appMemory = " + C63690d.f160780b + " sysMemory= " + C63690d.f160781c);
            }
        });
    }

    /* renamed from: b */
    public static void m249679b(final String str, final String str2) {
        C60700b.m235851b(f160779a, "[sendMemoryEventAfter]", "start");
        C60745ag.m236063a(new Runnable() {
            /* class com.ss.android.vc.statistics.p3180a.C63690d.RunnableC636911 */

            public void run() {
                try {
                    long a = C60681a.m235782a(ar.m236694a());
                    long a2 = C60681a.m235781a() - C60681a.m235783b(ar.m236694a());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("interactive_id", str2);
                    jSONObject.put("meeting_id", str);
                    jSONObject.put("app_memory", a);
                    jSONObject.put("system_memory", a2);
                    C63686a.m249664b("vc_metric_after_meeting", jSONObject, (VideoChat) null);
                    String str = C63690d.f160779a;
                    C60700b.m235851b(str, "[sendMemoryEventAfter2]", "appMemory = " + a + " sysMemory= " + a2);
                } catch (JSONException e) {
                    String str2 = C63690d.f160779a;
                    C60700b.m235864f(str2, "[sendMemoryEventAfter3]", "JSONException: " + e.getMessage());
                }
            }
        }, 3000);
    }

    /* renamed from: a */
    public static void m249678a(String str, String str2) {
        C60700b.m235851b(f160779a, "[sendMemoryEventBefore]", "start");
        if (f160780b > 0 && f160781c > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("interactive_id", str2);
                jSONObject.put("meeting_id", str);
                jSONObject.put("app_memory", f160780b);
                jSONObject.put("system_memory", f160781c);
                C63686a.m249664b("vc_metric_before_meeting", jSONObject, (VideoChat) null);
            } catch (JSONException e) {
                String str3 = f160779a;
                C60700b.m235864f(str3, "[sendMemoryEventBefore]", "JSONException: " + e.getMessage());
            }
        }
    }
}

package com.ss.android.vc.statistics.p3180a;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.C63685a;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vcxp.C63791b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.a.a */
public class C63686a {
    /* renamed from: a */
    public static void m249661a(String str, JSONObject jSONObject, VideoChat videoChat) {
        C60735ab.m236019f(new Runnable(jSONObject, str) {
            /* class com.ss.android.vc.statistics.p3180a.$$Lambda$a$N1RMNDfLHo_gNezjwJfPAomJIs4 */
            public final /* synthetic */ JSONObject f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63686a.lambda$N1RMNDfLHo_gNezjwJfPAomJIs4(VideoChat.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public static void m249664b(String str, JSONObject jSONObject, VideoChat videoChat) {
        C60735ab.m236019f(new Runnable(jSONObject, str) {
            /* class com.ss.android.vc.statistics.p3180a.$$Lambda$a$48X9V6CdB4LkGfXl_GlrUlhsWnM */
            public final /* synthetic */ JSONObject f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63686a.lambda$48X9V6CdB4LkGfXl_GlrUlhsWnM(VideoChat.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249659a(VideoChat videoChat, JSONObject jSONObject, String str) {
        if (videoChat != null) {
            jSONObject = C63724a.m249906a(jSONObject, videoChat);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("event", str);
        } catch (JSONException e) {
            C60700b.m235864f("AppreciableUtils", "[performance2]", e.getMessage());
        }
        C60700b.m235851b("AppreciableUtils", "[performance]", jSONObject.toString());
        C63685a.m249655a("vc_basic_performance", null, null, jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249662b(VideoChat videoChat, JSONObject jSONObject, String str) {
        if (videoChat != null) {
            jSONObject = C63724a.m249906a(jSONObject, videoChat);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("event", str);
        } catch (JSONException e) {
            C60700b.m235864f("AppreciableUtils", "[onError2]", e.getMessage());
        }
        C60700b.m235851b("AppreciableUtils", "[onError]", jSONObject.toString());
        C63685a.m249655a("vc_appreciable_error", null, null, jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.ss.android.lark.appreciablelib.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m249665c(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Map<String, Object> map4) {
        C60700b.m235851b("AppreciableUtils", "[end]", "key = " + str);
        if (map4 == null) {
            map4 = new HashMap<>();
        }
        map4.put("is_multi_process", Integer.valueOf(C63791b.m250468b() ? 1 : 0));
        AppreciableKit.m107394b().mo103523c(str, map, map2, map3, map4);
    }

    /* renamed from: a */
    public static void m249660a(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Map<String, Object> map4) {
        C60700b.m235851b("AppreciableUtils", "[pause]", "key = " + str);
        AppreciableKit.m107394b().mo103519a(str, map, map2, map3, map4);
    }

    /* renamed from: b */
    public static void m249663b(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Map<String, Object> map4) {
        C60700b.m235851b("AppreciableUtils", "[resume]", "key = " + str);
        AppreciableKit.m107394b().mo103522b(str, map, map2, map3, map4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.appreciablelib.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static String m249658a(Scene scene, Event event, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Map<String, Object> map4) {
        Map<String, Object> map5;
        Map<String, Object> map6;
        if (event.equals(Event.vc_enter_calling) || event.equals(Event.vc_enter_onthecall_pure) || event.equals(Event.vc_enter_onthecall_total) || event.equals(Event.vc_enter_preview_pure) || event.equals(Event.vc_enter_preview_total)) {
            if (map4 == null) {
                map6 = new HashMap<>();
            } else {
                map6 = map4;
            }
            map6.put("camera_permission", Integer.valueOf(C60788y.m236247a(ar.m236694a()) ? 1 : 0));
            map6.put("mic_permission", Integer.valueOf(C60788y.m236250b(ar.m236694a()) ? 1 : 0));
            map5 = map6;
        } else {
            map5 = map4;
        }
        String a = AppreciableKit.m107394b().mo103510a(Biz.VideoConference, scene, event, (String) null, true, (Map<String, ? extends Object>) map, (Map<String, ? extends Object>) map2, (Map<String, ? extends Object>) map3, (Map<String, ? extends Object>) map5);
        C60700b.m235851b("AppreciableUtils", "[start]", "scene = " + scene + ", event = " + event + ", key = " + a);
        return a;
    }
}

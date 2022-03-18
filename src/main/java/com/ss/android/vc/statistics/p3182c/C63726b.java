package com.ss.android.vc.statistics.p3182c;

import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.C63685a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.c.b */
public class C63726b {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m249921d(String str, JSONObject jSONObject) {
        C63685a.m249653a(str, C63724a.m249910c(jSONObject));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m249923e(String str, JSONObject jSONObject) {
        C63685a.m249653a(str, C63724a.m249908b(jSONObject));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m249924f(String str, JSONObject jSONObject) {
        C63685a.m249653a(str, C63724a.m249905a(jSONObject));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249916b(String str, VideoChat videoChat) {
        C63685a.m249653a(str, C63724a.m249906a(null, videoChat));
    }

    /* renamed from: c */
    public static void m249919c(String str, JSONObject jSONObject) {
        C60735ab.m236018e(new Runnable(str, jSONObject) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$44Tkf4vPnlWd0FU5ldrA3r0mII */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C63726b.m249921d(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public static void m249917b(String str, JSONObject jSONObject) {
        C60735ab.m236018e(new Runnable(str, jSONObject) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$v19EUrwlwpaDQuFLuksh9HpdL8 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C63726b.m249923e(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m249913a(String str, VideoChat videoChat) {
        C60735ab.m236018e(new Runnable(str, videoChat) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$NsJBEZrd0z4MkC6FmMMzF5toLU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ VideoChat f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C63726b.m249916b(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m249914a(String str, JSONObject jSONObject) {
        C60735ab.m236018e(new Runnable(str, jSONObject) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$h9z_veZvwQQTtDTAC4YV92oTsg */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C63726b.m249924f(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m249912a(String str, int i, VideoChat videoChat) {
        C60735ab.m236018e(new Runnable(i, str, videoChat) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$8qjhGBYgAgcbBKwNUBxU4XbWC1Q */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63726b.m249911a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m249922d(String str, JSONObject jSONObject, VideoChat videoChat) {
        C63685a.m249653a(str, C63724a.m249906a(jSONObject, videoChat));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249911a(int i, String str, VideoChat videoChat) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C63685a.m249652a(str, i, (JSONObject) null);
        C63685a.m249653a(str, C63724a.m249906a(jSONObject, videoChat));
    }

    /* renamed from: b */
    public static void m249918b(String str, JSONObject jSONObject, VideoChat videoChat) {
        C60735ab.m236018e(new Runnable(str, jSONObject, videoChat) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$NHcndSAc1hGo1u9w9RlD8fhV4lU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63726b.m249920c(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m249920c(String str, JSONObject jSONObject, VideoChat videoChat) {
        C63685a.m249654a(str, jSONObject, (JSONObject) null);
        JSONObject a = C63724a.m249906a(null, videoChat);
        if (!(jSONObject == null || jSONObject.keys() == null)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    a.put(next, jSONObject.get(next));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        C63685a.m249653a(str, a);
    }

    /* renamed from: a */
    public static void m249915a(String str, JSONObject jSONObject, VideoChat videoChat) {
        C60735ab.m236018e(new Runnable(str, jSONObject, videoChat) {
            /* class com.ss.android.vc.statistics.p3182c.$$Lambda$b$7hLxpi_TlJt86x0SSW3bDvgMxA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63726b.m249922d(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}

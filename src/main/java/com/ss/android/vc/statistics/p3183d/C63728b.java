package com.ss.android.vc.statistics.p3183d;

import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.d.b */
public class C63728b {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249929b(String str, JSONObject jSONObject, VideoChat videoChat) {
        C63685a.m249653a(str, C63727a.m249927a(jSONObject, videoChat));
    }

    /* renamed from: a */
    public static void m249928a(String str, JSONObject jSONObject, VideoChat videoChat) {
        C60735ab.m236018e(new Runnable(str, jSONObject, videoChat) {
            /* class com.ss.android.vc.statistics.p3183d.$$Lambda$b$kdPpmrcikr3pChxYTeUd7fcMP1g */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JSONObject f$1;
            public final /* synthetic */ VideoChat f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63728b.m249929b(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}

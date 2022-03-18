package com.bytedance.feelgood.p738d;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.bytedance.feelgood.AbstractC13928d;
import com.bytedance.feelgood.AbstractC13934e;
import com.bytedance.feelgood.p739e.AbstractDialogC13935a;

/* renamed from: com.bytedance.feelgood.d.a */
public class C13929a {

    /* renamed from: a */
    public static String f36405a = "DPBridgeSdk";

    /* renamed from: b */
    private AbstractDialogC13935a f36406b;

    /* renamed from: c */
    private AbstractC13934e f36407c;

    /* renamed from: d */
    private AbstractC13928d f36408d;

    /* renamed from: a */
    private void m56377a(String str) {
        if (this.f36407c != null) {
            this.f36407c.mo51222a(C13931c.m56385a(str));
        }
    }

    /* renamed from: c */
    private void m56379c(String str) {
        if (this.f36408d != null) {
            this.f36408d.mo51220a(C13931c.m56385a(str).f36414c.toString());
        }
    }

    /* renamed from: d */
    private void m56380d(String str) {
        if (this.f36408d != null) {
            C13931c a = C13931c.m56385a(str);
            this.f36408d.mo51221a(a.f36412a, a.f36414c.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m56378b(java.lang.String r2) {
        /*
            r1 = this;
            com.bytedance.feelgood.d.c r2 = com.bytedance.feelgood.p738d.C13931c.m56385a(r2)
            if (r2 == 0) goto L_0x0013
            org.json.JSONObject r2 = r2.f36414c     // Catch:{ JSONException -> 0x000f }
            java.lang.String r0 = "success"
            boolean r2 = r2.getBoolean(r0)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0014
        L_0x000f:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0013:
            r2 = 0
        L_0x0014:
            com.bytedance.feelgood.e.a r0 = r1.f36406b
            if (r0 == 0) goto L_0x0020
            r0.mo51215d(r2)
            com.bytedance.feelgood.e.a r2 = r1.f36406b
            r2.dismiss()
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feelgood.p738d.C13929a.m56378b(java.lang.String):void");
    }

    @JavascriptInterface
    public void call(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            Log.i("WebHelper", "FeelgoodJsBridge call = " + str + " json = " + str2);
            if ("closeContainer".equals(str)) {
                m56378b(str2);
            } else if ("getParams".equals(str)) {
                m56377a(str2);
            } else if ("postMessage".equals(str)) {
                m56380d(str2);
            } else if ("setContainerHeight".equals(str)) {
                m56379c(str2);
            }
        }
    }

    public C13929a(AbstractDialogC13935a aVar, AbstractC13928d dVar, AbstractC13934e eVar) {
        this.f36406b = aVar;
        this.f36408d = dVar;
        this.f36407c = eVar;
    }
}

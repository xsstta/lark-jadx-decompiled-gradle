package com.bytedance.android.monitor;

import android.os.Looper;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import com.bytedance.android.monitor.webview.C2710h;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.a */
public class C2627a {

    /* renamed from: a */
    private AbstractC2677a f8366a = new C2710h();

    /* renamed from: a */
    public AbstractC2677a mo11397a() {
        return this.f8366a;
    }

    /* renamed from: a */
    public void mo11399a(AbstractC2677a aVar) {
        this.f8366a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11398a(final C2641a aVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            MonitorExecutor.f8417a.mo11451a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.C2627a.RunnableC26281 */

                public void run() {
                    C2637b.m11076a(aVar);
                }
            });
        } else {
            C2637b.m11076a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11400a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        mo11401a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, this.f8366a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11401a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, AbstractC2677a aVar) {
        mo11398a(new C2641a.C2643a(str3).mo11437a(str).mo11441b(str2).mo11438a(jSONObject).mo11442b(jSONObject2).mo11444c(jSONObject3).mo11446e(jSONObject4).mo11439a(z).mo11436a(aVar).mo11440a());
    }
}

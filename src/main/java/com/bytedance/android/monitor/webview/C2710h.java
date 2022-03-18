package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.apm.ApmAgent;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.h */
public class C2710h implements AbstractC2677a {
    @Override // com.bytedance.android.monitor.webview.AbstractC2677a
    /* renamed from: a */
    public void mo11563a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            ApmAgent.monitorEvent(str, null, null, jSONObject2);
        } catch (Throwable th) {
            C2655c.m11159a(th);
        }
    }
}

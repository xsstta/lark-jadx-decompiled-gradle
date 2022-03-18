package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.p112i.C2657e;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.g */
public class C2709g {

    /* renamed from: a */
    private JSONObject f8606a;

    /* renamed from: b */
    private JSONObject f8607b;

    /* renamed from: c */
    private JSONObject f8608c;

    /* renamed from: d */
    private JSONObject f8609d;

    /* renamed from: e */
    private JSONObject f8610e;

    /* renamed from: b */
    public static String m11469b() {
        return "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
    }

    /* renamed from: a */
    public String mo11672a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C2657e.m11173a(jSONObject, "monitors", jSONObject2);
        C2657e.m11173a(jSONObject, "sendCommonParams", this.f8610e);
        m11468a(jSONObject2, this.f8606a);
        m11468a(jSONObject2, this.f8607b);
        m11468a(jSONObject2, this.f8608c);
        m11468a(jSONObject2, this.f8609d);
        String jSONObject3 = jSONObject.toString();
        return "SlardarHybrid('config', " + jSONObject3 + ")";
    }

    public C2709g(String str) {
        JSONObject a = C2657e.m11170a(str);
        this.f8606a = C2657e.m11178c(a, "apmReportConfig");
        this.f8607b = C2657e.m11178c(a, "performanceReportConfig");
        this.f8608c = C2657e.m11178c(a, "errorMsgReportConfig");
        this.f8609d = C2657e.m11178c(a, "resourceTimingReportConfig");
        this.f8610e = C2657e.m11178c(a, "commonReportConfig");
    }

    /* renamed from: a */
    private void m11468a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C2657e.m11173a(jSONObject, next, C2657e.m11180e(jSONObject2, next));
            }
        }
    }
}

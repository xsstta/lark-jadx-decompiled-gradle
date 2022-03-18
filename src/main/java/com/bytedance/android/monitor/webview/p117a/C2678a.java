package com.bytedance.android.monitor.webview.p117a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.C2711i;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.a.a */
public class C2678a {

    /* renamed from: a */
    private long f8524a;

    /* renamed from: a */
    public void mo11565a(String str) {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            this.f8524a = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo11564a(WebView webView, String str) {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            long j = this.f8524a;
            if (j != 0) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        Uri parse = Uri.parse(str);
                        C2657e.m11174a(jSONObject, "url", parse.toString());
                        C2657e.m11174a(jSONObject, "host", parse.getHost());
                        C2657e.m11174a(jSONObject, "path", parse.getPath());
                        C2657e.m11174a(jSONObject, "hybrid_monitor_switch", "false");
                        C2657e.m11174a(jSONObject, "js_inject_switch", "false");
                        C2657e.m11174a(jSONObject, "container_type", "web");
                        JSONObject jSONObject2 = new JSONObject();
                        C2657e.m11172a(jSONObject2, "web_page_cost", currentTimeMillis);
                        C2711i.m11480a().mo11577a(webView, str, "performance_test", jSONObject.toString(), jSONObject2.toString(), null, "0");
                        C2711i.m11480a().mo11591a(webView);
                        this.f8524a = 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

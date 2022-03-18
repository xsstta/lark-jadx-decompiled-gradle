package com.larksuite.component.webview.container.impl.statistics;

import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import org.json.JSONObject;

public class WebContainerReporter {

    /* renamed from: a */
    private static final WebContainerReporter f64006a = new WebContainerReporter();

    /* renamed from: b */
    private String f64007b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface POOL {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SCENE {
    }

    /* renamed from: a */
    public static WebContainerReporter m93651a() {
        return f64006a;
    }

    /* renamed from: a */
    public void mo92045a(String str) {
        mo92046a(str, new HashMap<>());
    }

    /* renamed from: a */
    public void mo92046a(String str, HashMap<String, String> hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!CollectionUtils.isEmpty(hashMap)) {
                for (String str2 : hashMap.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put(str2, hashMap.get(str2));
                    }
                }
            }
            mo92047a(str, jSONObject);
        } catch (Exception e) {
            Log.m165384e("WebContainerReporter", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public void mo92047a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(this.f64007b) || str == "init_data") {
            this.f64007b = NetworkUtils.getNetworkAccessType(C25821b.m93347a().mo91844a());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", str);
            jSONObject2.put("network", this.f64007b);
            jSONObject2.put("using_tt", TTWebSdk.isTTWebView());
            ApmAgent.monitorEvent("webview_container_report", jSONObject2, jSONObject, null);
        } catch (Exception e) {
            Log.m165384e("WebContainerReporter", e.getMessage(), e);
        }
    }
}

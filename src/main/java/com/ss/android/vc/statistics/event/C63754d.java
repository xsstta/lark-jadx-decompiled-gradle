package com.ss.android.vc.statistics.event;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.d */
public class C63754d {

    /* renamed from: a */
    private long f160909a;

    /* renamed from: b */
    private boolean f160910b;

    /* renamed from: a */
    public void mo220403a() {
        this.f160909a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo220404a(VideoChat videoChat) {
        if (this.f160909a > 0 && !this.f160910b) {
            try {
                this.f160910b = true;
                long currentTimeMillis = System.currentTimeMillis() - this.f160909a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("byte_connect_time", currentTimeMillis);
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C26246a.m94977a(ar.m236694a()));
                C63726b.m249915a("vc_call_byte_connect_time", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.bytedance.apm6.p174e.p175a;

import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.foundation.safety.C3321a;
import com.bytedance.apm6.p160b.p161a.C3203e;
import com.bytedance.apm6.p160b.p161a.p162a.AbstractC3161b;
import com.bytedance.apm6.p160b.p161a.p162a.C3160a;
import com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a.g */
public class C3301g implements AbstractC3161b {

    /* renamed from: a */
    String f10519a = "report_setting";

    /* renamed from: b */
    String f10520b = "enable_encrypt";

    /* renamed from: c */
    String f10521c = "hosts";

    /* renamed from: d */
    String f10522d = "apm6_once_max_size_kb";

    /* renamed from: e */
    String f10523e = "apm6_uploading_interval";

    /* renamed from: f */
    String f10524f = "enable_report_internal_exception";

    /* renamed from: g */
    String f10525g = "log_reserve_days";

    /* renamed from: h */
    String f10526h = "log_max_size_mb";

    /* renamed from: i */
    private volatile C3160a f10527i;

    @Override // com.bytedance.apm6.p160b.p161a.p162a.AbstractC3161b
    /* renamed from: a */
    public C3160a mo13132a() {
        return this.f10527i;
    }

    public C3301g() {
        C3286a.m13719a().mo13501b();
        C3286a.m13719a().mo13499a(new AbstractC3290b() {
            /* class com.bytedance.apm6.p174e.p175a.C3301g.C33021 */

            @Override // com.bytedance.apm6.p174e.p175a.p176a.AbstractC3290b
            /* renamed from: a */
            public void mo13498a(JSONObject jSONObject, boolean z) {
                C3301g.this.mo13513a(jSONObject, z);
            }
        });
    }

    /* renamed from: a */
    private static List<String> m13742a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String host = new URL(jSONArray.getString(i)).getHost();
                        if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                            arrayList.add(host);
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException e) {
                C3350b.m13935b("APM-Setting", "parse setting host json exception", e);
            } catch (MalformedURLException e2) {
                C3350b.m13935b("APM-Setting", "parse setting host malformedurl exception", e2);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo13513a(JSONObject jSONObject, boolean z) {
        JSONObject a;
        String str;
        JSONObject optJSONObject;
        if (!(jSONObject == null || (a = C3355e.m13953a(jSONObject, "general", "slardar_api_settings", this.f10519a)) == null)) {
            List<String> a2 = m13742a(a.optJSONArray(this.f10521c));
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            if (!C3356f.m13964a(a2)) {
                str = null;
                for (String str3 : a2) {
                    arrayList.add("https://" + str3 + "/monitor/collect/batch/");
                    if (str2 == null) {
                        str2 = "https://" + str3 + "/monitor/collect/c/exception";
                    }
                    if (str == null) {
                        str = "https://" + str3 + "/monitor/collect/c/trace_collect";
                    }
                }
            } else {
                str = null;
            }
            boolean z2 = true;
            boolean optBoolean = a.optBoolean(this.f10520b, true);
            long optLong = a.optLong(this.f10522d, -1) * 1024;
            long optLong2 = a.optLong(this.f10523e, -1) * 1000;
            if (C3355e.m13958b(jSONObject, "general", this.f10524f) != 1) {
                z2 = false;
            }
            C3160a aVar = new C3160a();
            aVar.mo13118a(arrayList);
            aVar.mo13117a(str2);
            aVar.mo13123b(str);
            aVar.mo13116a(optLong);
            aVar.mo13119a(optBoolean);
            aVar.mo13122b(optLong2);
            aVar.mo13124b(z2);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("general");
            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("cleanup")) == null)) {
                aVar.mo13115a(optJSONObject.optInt(this.f10526h, 80));
                aVar.mo13121b(optJSONObject.optInt(this.f10525g, 5));
            }
            this.f10527i = aVar;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Config", "received reportSetting=" + a);
                C3350b.m13932a("APM-Config", "parsed SlardarHandlerConfig=" + this.f10527i);
            }
            C3321a.m13864a(z2);
            C3321a.m13861a(str2);
            C3203e.m13385a().mo13277a(mo13132a());
        }
    }
}

package com.huawei.hms.hatool;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

public class d1 extends AbstractC23613o {

    /* renamed from: g */
    public String f58191g = "";

    @Override // com.huawei.hms.hatool.AbstractC23617s
    /* renamed from: a */
    public JSONObject mo82974a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "1");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f58298d);
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f58295a);
        jSONObject.put("hmac", this.f58191g);
        jSONObject.put("chifer", this.f58300f);
        jSONObject.put("timestamp", this.f58296b);
        jSONObject.put("servicetag", this.f58297c);
        jSONObject.put("requestid", this.f58299e);
        return jSONObject;
    }

    /* renamed from: g */
    public void mo82989g(String str) {
        this.f58191g = str;
    }
}

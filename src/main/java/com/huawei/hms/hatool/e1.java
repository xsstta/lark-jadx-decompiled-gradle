package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONObject;

public class e1 extends AbstractC23614p {

    /* renamed from: f */
    public String f58194f;

    /* renamed from: g */
    public String f58195g;

    /* renamed from: h */
    public String f58196h;

    @Override // com.huawei.hms.hatool.AbstractC23617s
    /* renamed from: a */
    public JSONObject mo82974a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f58196h);
        jSONObject.put("_emui_ver", this.f58303a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f58194f);
        jSONObject.put("_mnc", this.f58195g);
        jSONObject.put("_package_name", this.f58304b);
        jSONObject.put("_app_ver", this.f58305c);
        jSONObject.put("_lib_ver", "2.2.0.308");
        jSONObject.put("_channel", this.f58306d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f58307e);
        return jSONObject;
    }

    /* renamed from: f */
    public void mo82992f(String str) {
        this.f58194f = str;
    }

    /* renamed from: g */
    public void mo82993g(String str) {
        this.f58195g = str;
    }

    /* renamed from: h */
    public void mo82994h(String str) {
        this.f58196h = str;
    }
}

package com.tt.miniapp.streamloader.p3330a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.p3371e.C67509b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.streamloader.a.e */
public class C66869e {

    /* renamed from: a */
    public String f168679a;

    /* renamed from: b */
    public String f168680b;

    /* renamed from: c */
    public String f168681c;

    /* renamed from: d */
    public String f168682d;

    /* renamed from: e */
    public boolean f168683e;

    /* renamed from: a */
    public void mo232839a(IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tma_event", "GetOrWait");
            jSONObject.put("tma_status", String.valueOf(this.f168681c));
            jSONObject.put("tma_fileName", String.valueOf(this.f168679a));
            jSONObject.put("tma_loadFrom", String.valueOf(this.f168680b));
            jSONObject.put("tma_useTime", String.valueOf(this.f168682d));
            jSONObject.put("tma_isReleased", this.f168683e);
            C67509b.m262587a("mp_streamload_monitor", 0, jSONObject, iAppContext);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

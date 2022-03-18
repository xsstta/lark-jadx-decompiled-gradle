package com.larksuite.component.openplatform.core.plugin.vc.audio.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.entity.C67522b;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.sync.b */
public class C25515b extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getAudioStateSync";
    }

    public C25515b() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            int optInt = new JSONObject(this.f168426a).optInt("audioId");
            C67522b bVar = new C67522b();
            AbstractC65746a.C65747a a = AbstractC65746a.m257747a(mo232455f()).mo230375a(optInt, bVar);
            if (a != null) {
                if (a.f165657e >= 0) {
                    AppBrandLogger.m52828d("tma_GetAudioStateSyncCtrl", "audioState.duration ", Long.valueOf(a.f165657e));
                    String str = a.f165653a;
                    String d = mo232454e().mo235048d(str);
                    AppBrandLogger.m52828d("tma_GetAudioStateSyncCtrl", "schemaUrl ", d, " ", str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", d);
                    jSONObject.put("startTime", a.f165654b);
                    jSONObject.put("paused", a.f165655c);
                    jSONObject.put("currentTime", a.f165656d);
                    jSONObject.put("duration", a.f165657e);
                    jSONObject.put("obeyMuteSwitch", a.f165658f);
                    jSONObject.put("buffered", a.f165659g);
                    return mo232446a(jSONObject);
                }
            }
            if (a != null) {
                AppBrandLogger.m52828d("tma_GetAudioStateSyncCtrl", "audioState.duration < 0 ", Long.valueOf(a.f165657e));
                bVar.mo234467a("audioState.duration == ").mo234467a(Long.valueOf(a.f165657e));
            }
            return mo232449a(false, (JSONObject) null, bVar.mo234468a(), bVar.mo234470b());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_GetAudioStateSyncCtrl", "act", e);
            return mo232445a(e);
        }
    }

    public C25515b(String str) {
        super(str);
    }
}

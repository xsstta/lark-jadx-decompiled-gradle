package com.tt.miniapp.event.p3281b.p3282a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.event.p3281b.AbstractC66023a;
import com.tt.miniapp.event.p3281b.C66029b;
import com.tt.miniapp.event.p3281b.C66031d;
import com.tt.miniapphost.C67475d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.a.b */
public class C66025b extends AbstractC66023a {
    public C66025b(C66031d dVar) {
        super(dVar);
    }

    /* renamed from: g */
    private boolean m258551g(C66029b bVar) {
        if (!bVar.f166688c && "mp_load_start".equals(bVar.f166686a) && "micro_app".equals(bVar.f166687b.optString("_param_for_special"))) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapp.event.p3281b.AbstractC66023a
    /* renamed from: f */
    public boolean mo231103f(C66029b bVar) {
        if (m258551g(bVar)) {
            JSONObject jSONObject = new JSONObject();
            C67475d.m262460a(bVar.f166687b, jSONObject);
            try {
                jSONObject.put("total_duration", 0).put("result_type", "cancel").put("error_msg", "process killed");
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("DelegateLoadDomReady", "mp_load_dom_ready json exp!", e);
            }
            mo231095a(mo231102e(new C66029b("mp_load_domready", jSONObject, false)));
            return false;
        } else if (!"mp_load_domready".equals(bVar.f166686a)) {
            return false;
        } else {
            if (!bVar.f166688c) {
                return !mo231101d(bVar);
            }
            mo231099b(mo231102e(bVar));
            return true;
        }
    }
}

package com.tt.miniapp.event.p3281b.p3282a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.event.p3281b.AbstractC66023a;
import com.tt.miniapp.event.p3281b.C66029b;
import com.tt.miniapp.event.p3281b.C66031d;
import com.tt.miniapphost.C67475d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.a.d */
public class C66027d extends AbstractC66023a {
    public C66027d(C66031d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.event.p3281b.AbstractC66023a
    /* renamed from: e */
    public C66029b mo231102e(C66029b bVar) {
        mo231097a(bVar.f166687b, "result_type", "cancel");
        if (!bVar.f166687b.has("duration")) {
            mo231097a(bVar.f166687b, "duration", 0);
        }
        if (TextUtils.isEmpty(bVar.f166687b.optString("error_msg", ""))) {
            mo231097a(bVar.f166687b, "error_msg", "process killed");
        }
        return super.mo231102e(bVar);
    }

    @Override // com.tt.miniapp.event.p3281b.AbstractC66023a
    /* renamed from: f */
    public boolean mo231103f(C66029b bVar) {
        if (!bVar.f166688c && "mp_page_load_start".equals(bVar.f166686a)) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(bVar.f166687b.toString());
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("DelegatePageLoadResult", "build page_load_result json exp!", e);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C67475d.m262460a(bVar.f166687b, jSONObject);
            try {
                jSONObject.put("page_path", bVar.f166687b.optString("page_path", "")).put("result_type", "cancel").put("duration", 0).put("error_msg", "process killed");
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("DelegatePageLoadResult", "49411_put load_result json exp!", e2);
            }
            mo231095a(mo231102e(new C66029b("mp_page_load_result", jSONObject, false)));
            return false;
        } else if (!"mp_page_load_result".equals(bVar.f166686a)) {
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

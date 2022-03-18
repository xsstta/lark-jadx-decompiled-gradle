package com.larksuite.framework.apiplugin.core;

import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25900k;
import org.json.JSONObject;

/* renamed from: com.larksuite.framework.apiplugin.core.f */
public abstract class AbstractC25929f extends AbstractC25937e implements AbstractC25900k {
    /* renamed from: a */
    public LKPluginInterceptResult mo92253a() {
        return LKPluginInterceptResult.f64253d;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25900k
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        return mo92253a();
    }

    /* renamed from: a */
    public LKPluginInterceptResult mo92255a(JSONObject jSONObject) {
        return mo92254a(Integer.MIN_VALUE, jSONObject);
    }

    /* renamed from: a */
    public LKPluginInterceptResult mo92254a(int i, JSONObject jSONObject) {
        return ((LKPluginInterceptResult.C25943a) ((LKPluginInterceptResult.C25943a) new LKPluginInterceptResult.C25943a().mo92280a(jSONObject)).mo92277a(i)).mo92285a(true).mo92286a();
    }
}

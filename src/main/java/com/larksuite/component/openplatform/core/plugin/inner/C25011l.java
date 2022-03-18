package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.impl.business.api.diagnose.C67888b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"execDiagnoseCommands"}, support = {AppType.WebAPP, AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.l */
public class C25011l extends AbstractC65797c {
    public C25011l() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("execDiagnoseCommands");
    }

    /* renamed from: b */
    private boolean m90271b() {
        AbstractC67724a aVar = (AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class);
        if (!aVar.mo50462e("execDiagnoseCommands")) {
            return false;
        }
        if (!aVar.mo50456b("gadget.diagnose.api.enable")) {
            AppBrandLogger.m52830i("ExecCommandsAsyncHandler", "diagnose fg false");
            return false;
        }
        AppBrandLogger.m52830i("ExecCommandsAsyncHandler", "diagnose api check ok");
        return true;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (!m90271b()) {
            AppBrandLogger.m52830i("ExecCommandsAsyncHandler", "can't invoke this API");
            mo230493c("can't invoke this API");
            return;
        }
        JSONArray jSONArray = (JSONArray) bVar.mo234984a("commands");
        if (jSONArray == null) {
            AppBrandLogger.m52829e("ExecCommandsAsyncHandler", "params is empty");
            mo230493c("params is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int length = jSONArray.length();
            AppBrandLogger.m52830i("ExecCommandsAsyncHandler", "received " + length + " commands.");
            for (int i = 0; i < length; i++) {
                m90270a(jSONArray.getJSONObject(i), jSONObject);
            }
            mo230492b(jSONObject);
        } catch (JSONException e) {
            mo230486a(e);
            AppBrandLogger.m52829e("ExecCommandsAsyncHandler", e);
        }
    }

    public C25011l(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90270a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            AppBrandLogger.m52829e("ExecCommandsAsyncHandler", "dispatchCommand, command is null");
            return;
        }
        int optInt = jSONObject.optInt("command", -1);
        AbstractC67885a a = C67888b.m264151a(optInt);
        if (a == null) {
            AppBrandLogger.m52829e("ExecCommandsAsyncHandler", " command handler not found,command " + jSONObject);
            return;
        }
        JSONObject a2 = a.mo235512a(mo230473f(), jSONObject.optJSONObject("params"));
        if (a2 == null) {
            AppBrandLogger.m52829e("ExecCommandsAsyncHandler", " handle data null ,command ", jSONObject);
            return;
        }
        jSONObject2.put(String.valueOf(optInt), a2);
    }
}

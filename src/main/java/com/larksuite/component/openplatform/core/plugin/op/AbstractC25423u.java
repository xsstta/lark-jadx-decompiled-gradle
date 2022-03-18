package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.p3352w.C67288b;
import com.tt.miniapp.p3352w.p3354b.AbstractC67293a;
import com.tt.miniapp.p3352w.p3354b.AbstractC67297c;
import com.tt.miniapp.p3352w.p3354b.C67294b;
import com.tt.miniapp.p3352w.p3354b.C67300f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.option.ext.AbstractC67619e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.u */
public abstract class AbstractC25423u extends ApiHandler {
    /* renamed from: a */
    public abstract void mo88460a(String str, AbstractC67297c cVar);

    public AbstractC25423u() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("eventName");
            if (!C66236a.m259224a(C67300f.m262172b(optString), getAppContext())) {
                m90937a(optString, m90935a("unauthorized event"), getAppContext());
                return;
            }
            AbstractC67297c cVar = (AbstractC67297c) C67288b.m262152a().mo233958a(C67294b.class);
            if (cVar != null) {
                mo88460a(optString, cVar);
            }
        } catch (Exception e) {
            m90937a("", m90935a(e.toString()), getAppContext());
        }
    }

    /* renamed from: a */
    private String m90935a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    protected static ConcurrentHashMap<String, AbstractC67293a> m90936a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170192s;
    }

    public AbstractC25423u(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    protected static void m90937a(String str, String str2, IAppContext iAppContext) {
        IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
        if (jsBridge != null) {
            jsBridge.sendMsgToJsCore(str, str2);
        }
    }
}

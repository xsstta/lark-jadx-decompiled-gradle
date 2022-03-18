package com.tt.remotedebug.p3437a;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.larksuite.component.openplatform.core.plugin.infra.network.C24938i;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.jsbridge.JsBridge;
import com.tt.miniapp.p3324r.C66717c;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.remotedebug.cmd.Native2JsCmd;
import org.json.JSONObject;

/* renamed from: com.tt.remotedebug.a.b */
public class C67952b extends JsBridge {

    /* renamed from: a */
    public C67959d f171196a;

    C67952b(C67959d dVar, IAppContext iAppContext) {
        super(dVar, iAppContext);
        this.f171196a = dVar;
    }

    @Override // com.tt.miniapp.jsbridge.JsBridge, com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(final String str, final String str2) {
        this.f171196a.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67952b.C679542 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                Native2JsCmd native2JsCmd = new Native2JsCmd();
                native2JsCmd.setData(str2);
                native2JsCmd.setEvent(str);
                native2JsCmd.setArgc(2.0f);
                native2JsCmd.setName("subscribeHandler");
                C67952b.this.f171196a.mo235820a(JSON.toJSONString(native2JsCmd));
            }
        });
    }

    @Override // com.tt.miniapp.jsbridge.JsBridge, com.tt.frontendapiinterface.IJsBridge
    public void invokeApi(final String str, final AbstractC25903n nVar, final int i) {
        this.f171196a.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67952b.C679564 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                Native2JsCmd native2JsCmd = new Native2JsCmd();
                native2JsCmd.setCallbackId((float) i);
                native2JsCmd.setArgc(3.0f);
                native2JsCmd.setName("subscribeHandler");
                native2JsCmd.setData(((JsObject) C66718d.m260516a(str, nVar, new C66717c(jsScopedContext))).toString());
                C67952b.this.f171196a.mo235820a(JSON.toJSONString(native2JsCmd));
            }
        });
    }

    @Override // com.tt.miniapp.jsbridge.JsBridge, com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore2(final String str, final IApiOutputParam iApiOutputParam, boolean z) {
        this.f171196a.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67952b.C679575 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                JSONObject a = C67951a.m264521a(str, iApiOutputParam);
                Native2JsCmd native2JsCmd = new Native2JsCmd();
                native2JsCmd.setData(a.toString());
                native2JsCmd.setEvent(str);
                native2JsCmd.setName("subscribeHandler");
                native2JsCmd.setArgc(2.0f);
                C67952b.this.f171196a.mo235820a(JSON.toJSONString(native2JsCmd));
            }
        });
    }

    /* renamed from: a */
    public JSONObject mo235815a(String str, JSONObject jSONObject, int i) {
        C24938i iVar;
        AppBrandLogger.m52828d("VscJsBridge", "call event ", str, " params ", jSONObject, " callbackId ", Integer.valueOf(i));
        if (C66236a.m259223a(str, i, (String) null, this.appContext)) {
            return null;
        }
        IApiInputParam a = C67951a.m264520a(str, jSONObject);
        str.hashCode();
        if (!str.equals("createRequestTask")) {
            iVar = null;
        } else {
            iVar = new C24938i(a);
        }
        if (iVar != null) {
            iVar.mo232460a(this.appContext);
            return C67951a.m264521a(str, iVar.mo87999a());
        }
        asyncJsInvokeV2(str, a, i);
        return null;
    }

    @Override // com.tt.miniapp.jsbridge.JsBridge, com.tt.frontendapiinterface.IJsBridge
    public void returnAsyncResult(final int i, String str, final String str2, String str3) {
        this.f171196a.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67952b.C679531 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                Native2JsCmd native2JsCmd = new Native2JsCmd();
                native2JsCmd.setCallbackId((float) i);
                native2JsCmd.setData(str2);
                native2JsCmd.setArgc(2.0f);
                native2JsCmd.setName("invokeHandler");
                C67952b.this.f171196a.mo235820a(JSON.toJSONString(native2JsCmd));
            }
        });
    }

    @Override // com.tt.miniapp.jsbridge.JsBridge, com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(final String str, final String str2, final int i, boolean z) {
        this.f171196a.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67952b.C679553 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                Native2JsCmd native2JsCmd = new Native2JsCmd();
                native2JsCmd.setData(str2);
                native2JsCmd.setEvent(str);
                native2JsCmd.setWebviewId(i);
                native2JsCmd.setArgc(3.0f);
                native2JsCmd.setName("subscribeHandler");
                C67952b.this.f171196a.mo235820a(JSON.toJSONString(native2JsCmd));
            }
        }, false, z);
    }
}

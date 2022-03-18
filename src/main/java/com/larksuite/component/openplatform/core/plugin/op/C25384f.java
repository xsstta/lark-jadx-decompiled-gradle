package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.p3294i.C66203a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.refer.common.util.C67866g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.f */
public class C25384f extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "onBeforeCloseReturnSync";
    }

    public C25384f() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            final boolean optBoolean = new JSONObject(this.f168426a).optBoolean("isClosed");
            C67866g.m264027a(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25384f.RunnableC253851 */

                public void run() {
                    C66203a.m259184a(C25384f.this.mo232455f()).mo231543a(optBoolean);
                }
            });
            return mo232456g();
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("ApiCloseCallbackReturnCtrl", "", e);
            return mo232451b("jsonException");
        }
    }

    public C25384f(String str) {
        super(str);
    }
}

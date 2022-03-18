package com.larksuite.component.openplatform.core.component.worker.p1116a;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.component.worker.a.a */
public abstract class AbstractC24452a implements AbstractC24364a {

    /* renamed from: a */
    protected IAppContext f60335a;

    /* renamed from: b */
    protected Context f60336b;

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: b */
    public void mo87125b() {
    }

    public AbstractC24452a(Context context, IAppContext iAppContext) {
        this.f60336b = context;
        this.f60335a = iAppContext;
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: a */
    public void mo87124a(String str, String str2) {
        IAppContext iAppContext = this.f60335a;
        if (iAppContext == null) {
            AppBrandLogger.m52829e("OPBaseWorkerImpl", "appContext is null");
            return;
        }
        AbstractC67709b bVar = (AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class);
        if (bVar == null) {
            AppBrandLogger.m52829e("OPBaseWorkerImpl", "this appType not implement JSBridge: " + this.f60335a.getAppType());
            return;
        }
        try {
            bVar.mo235012a(C67706e.C67708a.m263377a(str, new JSONObject(str2)).mo235009a());
        } catch (JSONException e) {
            AppBrandLogger.m52829e("OPBaseWorkerImpl", "JSONException", e);
        }
    }
}

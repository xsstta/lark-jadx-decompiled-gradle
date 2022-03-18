package com.tt.miniapp.p3324r.p3326b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.r.b.a */
public abstract class AbstractC66715a extends AbstractC25937e {

    /* renamed from: a */
    protected String f168426a;

    /* renamed from: b */
    private IAppContext f168427b;

    /* renamed from: a */
    public abstract String mo87633a();

    /* renamed from: b */
    public abstract String mo87634b();

    /* renamed from: h */
    public boolean mo232457h() {
        return true;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public AbstractC66715a() {
    }

    /* renamed from: f */
    public IAppContext mo232455f() {
        return this.f168427b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC67709b mo232453d() {
        return (AbstractC67709b) mo232455f().findServiceByInterface(AbstractC67709b.class);
    }

    /* renamed from: e */
    public AbstractC67709b.AbstractC67710a mo232454e() {
        return (AbstractC67709b.AbstractC67710a) mo232453d().mo235130i();
    }

    /* renamed from: g */
    public String mo232456g() {
        return ApiCallResult.Builder.createOk(mo87633a()).build().toString();
    }

    public AbstractC66715a(String str) {
        this.f168426a = str;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a(mo87633a());
    }

    /* renamed from: a */
    public void mo232450a(IAppContext iAppContext) {
        this.f168427b = iAppContext;
    }

    /* renamed from: a */
    public String mo232445a(Throwable th) {
        return ApiCallResult.Builder.createFail(mo87633a()).extraInfo(th).build().toString();
    }

    /* renamed from: b */
    public String mo232451b(String str) {
        return ApiCallResult.Builder.createFail(mo87633a()).extraInfo(str).build().toString();
    }

    /* renamed from: a */
    public String mo232446a(JSONObject jSONObject) {
        return ApiCallResult.Builder.createOk(mo87633a()).responseData(jSONObject).build().toString();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        AbstractC25891b r = lKEvent.mo92151r();
        if (r instanceof AbstractC24361a) {
            mo232450a(((AbstractC24361a) r).mo87113d());
        } else {
            AppBrandLogger.m52829e("SyncMsgCtrl", "core node is not Container, so have not appContext");
            if (lKEvent.mo92138e() instanceof IAppContext) {
                this.f168427b = (IAppContext) lKEvent.mo92138e();
                AppBrandLogger.m52830i("SyncMsgCtrl", "get find ServiceContext");
            } else if (!ProcessUtil.isMainProcess(lKEvent.mo92145l())) {
                C48936b.m192783a("core node is not Container, so have not appContext");
            }
        }
        OPMonitorUtils.monitorNativeStart(mo232455f(), lKEvent, true);
        if (mo87633a().equals(m)) {
            if (lKEvent.mo92147n() != null) {
                this.f168426a = lKEvent.mo92147n().toString();
            }
            try {
                return lKEvent.mo92131b(new JSONObject(mo87634b()));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("SyncMsgCtrl", "JSONException", e);
            }
        }
        return lKEvent.mo92155v();
    }

    /* renamed from: a */
    public String mo232447a(boolean z, String str) {
        return mo232448a(z, (HashMap<String, Object>) null, str, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo232452b(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public String mo232448a(boolean z, HashMap<String, Object> hashMap, String str, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (hashMap != null && hashMap.size() > 0) {
                for (String str2 : hashMap.keySet()) {
                    jSONObject.put(str2, hashMap.get(str2));
                }
            }
            return mo232449a(z, jSONObject, str, th);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "SyncMsgCtrl", e.getStackTrace());
            return CharacterUtils.empty();
        }
    }

    /* renamed from: a */
    public String mo232449a(boolean z, JSONObject jSONObject, String str, Throwable th) {
        if (z) {
            ApiCallResult.Builder createOk = ApiCallResult.Builder.createOk(mo87633a());
            if (!TextUtils.isEmpty(str)) {
                createOk.extraInfo(str);
            } else if (th != null) {
                createOk.extraInfo(th);
            }
            createOk.responseData(jSONObject);
            return createOk.build().toString();
        }
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(mo87633a());
        if (!TextUtils.isEmpty(str)) {
            createFail.extraInfo(str);
        } else if (th != null) {
            createFail.extraInfo(th);
        }
        createFail.responseData(jSONObject);
        return createFail.build().toString();
    }
}

package com.tt.miniapp.p3260b.p3261a.p3262a;

import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.b.a.a.a */
public abstract class AbstractC65792a extends AbstractC25937e implements AbstractC65803f {

    /* renamed from: h */
    public String f165818h;

    /* renamed from: i */
    protected IAppContext f165819i;

    /* renamed from: j */
    public C67701b f165820j;

    /* renamed from: k */
    protected AbstractC65805h f165821k;

    /* renamed from: l */
    public Boolean f165822l;

    /* renamed from: m */
    protected long f165823m;

    /* renamed from: a */
    public abstract List<String> mo87215a();

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    /* renamed from: b */
    public abstract C67700a mo230470b(C67701b bVar);

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo230476i() {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public AbstractC65792a() {
    }

    /* renamed from: e */
    public String mo230472e() {
        return this.f165818h;
    }

    /* renamed from: f */
    public IAppContext mo230473f() {
        return this.f165819i;
    }

    /* renamed from: g */
    public AbstractC67709b mo230474g() {
        return (AbstractC67709b) mo230473f().findServiceByInterface(AbstractC67709b.class);
    }

    /* renamed from: h */
    public AbstractC67709b.AbstractC67710a mo230475h() {
        return (AbstractC67709b.AbstractC67710a) mo230474g().mo235130i();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        for (String str : mo87215a()) {
            gVar.mo92192a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo230469a(LKEvent lKEvent) {
        Object obj = lKEvent.mo92140g().get("inner_invoke_time");
        if (obj instanceof Long) {
            this.f165823m = ((Long) obj).longValue();
        }
        Object obj2 = lKEvent.mo92140g().get("inner_js_app_completed");
        if (obj2 instanceof Boolean) {
            this.f165822l = (Boolean) obj2;
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(final LKEvent lKEvent) {
        Object obj;
        mo230469a(lKEvent);
        String m = lKEvent.mo92146m();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("eventName:");
        sb.append(m);
        sb.append(" paramsLength:");
        if (lKEvent.mo92147n() != null) {
            obj = Integer.valueOf(lKEvent.mo92147n().length());
        } else {
            obj = "";
        }
        sb.append(obj);
        sb.append(" env:");
        sb.append(lKEvent.mo92141h());
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("ApiHandler", objArr);
        this.f165818h = m;
        AbstractC25891b r = lKEvent.mo92151r();
        if (r instanceof AbstractC24361a) {
            this.f165819i = ((AbstractC24361a) r).mo87113d();
        } else {
            AppBrandLogger.m52829e("ApiHandler", "core node is not Container, so have not appContext");
            if (lKEvent.mo92138e() instanceof IAppContext) {
                this.f165819i = (IAppContext) lKEvent.mo92138e();
                AppBrandLogger.m52830i("ApiHandler", "get find ServiceContext");
            } else if (!ProcessUtil.isMainProcess(lKEvent.mo92145l())) {
                C48936b.m192783a("core node is not Container, so have not appContext");
            }
        }
        OPMonitorUtils.monitorNativeStart(mo230473f(), lKEvent, true);
        if (mo87215a().contains(m)) {
            C67700a b = mo230470b(C67701b.C67703a.m263358a(m, new C67704c(lKEvent.mo92147n())).mo234992a(new AbstractC65805h() {
                /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a.C657942 */

                @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
                public void callback(ApiCallResult apiCallResult) {
                    JSONObject json = apiCallResult.getJson();
                    int a = C25529d.m91127a(json, "errCode", 0);
                    if (a != 0 || apiCallResult.isFail()) {
                        AppBrandLogger.m52830i("ApiHandler", "errorCode:" + a);
                        lKEvent.mo92116a(a, json);
                        return;
                    }
                    lKEvent.mo92127a(json);
                }
            }).mo234993a(new AbstractC65806i() {
                /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a.C657931 */

                @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
                public void executeAsyncApiHandle(String str, Runnable runnable) {
                    AbstractC25890a i = lKEvent.mo92142i();
                    if (i != null) {
                        i.executeAsyncApiHandle(str, runnable);
                        return;
                    }
                    AppBrandLogger.m52829e("ApiHandler", "no set async executor");
                    runnable.run();
                }
            }).mo234996a());
            if (b.mo234981a()) {
                ApiCallResult b2 = b.mo234982b();
                if (b2 == null) {
                    return super.handleEvent(lKEvent);
                }
                AppBrandLogger.m52830i("ApiHandler", "success handle");
                JSONObject json = b2.getJson();
                int a = C25529d.m91127a(json, "errCode", 0);
                if (a != 0 || b2.isFail()) {
                    return lKEvent.mo92130b(a, json);
                }
                return lKEvent.mo92131b(json);
            }
        } else {
            Log.m165383e("ApiHandler", "eventName:" + m + " apiNames:" + mo87215a().toString());
        }
        return lKEvent.mo92155v();
    }

    public AbstractC65792a(String str, IAppContext iAppContext) {
        this.f165818h = str;
        this.f165819i = iAppContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo230471b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventName", str);
            jSONObject.put("errorMessage", str2);
            C67509b.m262587a("mp_invoke_api_failed", 7000, jSONObject, mo230473f());
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiHandler", e);
        }
    }
}

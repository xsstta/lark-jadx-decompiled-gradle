package com.tt.miniapp.p3260b.p3261a.p3262a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.core.utils.ApiMonitorUtil;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.p3263a.p3264a.p3265a.C65795a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.b.a.a.c */
public abstract class AbstractC65797c extends AbstractC65792a implements Cloneable {

    /* renamed from: a */
    private boolean f165832a;

    /* renamed from: b */
    private C65795a f165833b;

    /* renamed from: a */
    public abstract void mo87216a(C67701b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo230490b(ApiCallResult apiCallResult) {
    }

    public AbstractC65797c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: e */
    public String mo230472e() {
        return this.f165818h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo230488a(C67701b bVar, ApiCallResult apiCallResult) {
        AbstractC65805h hVar = this.f165821k;
        if (bVar == null) {
            AppBrandLogger.m52829e("ApiHandler", "triggerApiCallback->apiInvokeData is null!");
            return false;
        }
        if (hVar == null) {
            hVar = bVar.mo234990f();
        }
        if (hVar == null) {
            AppBrandLogger.m52829e("ApiHandler", "triggerApiCallback->asyncAPICallback is null!");
            return false;
        }
        hVar.callback(apiCallResult);
        return true;
    }

    /* renamed from: j */
    public final void mo230494j() {
        mo230484a((String) null, (JSONObject) null);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: i */
    public void mo230476i() {
        ApiHandlerManager.getInst(mo230473f()).unregisterNewActivityResultApiHandler(this);
        mo230473f().unRegisterOnResultPlugin(this);
    }

    /* renamed from: b */
    public final void mo230491b(String str) {
        mo230484a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo230481a(ApiCode apiCode) {
        mo230485a(apiCode.msg, (JSONObject) null, apiCode.code);
    }

    /* renamed from: b */
    public final void mo230492b(JSONObject jSONObject) {
        mo230484a((String) null, jSONObject);
    }

    /* renamed from: c */
    public final void mo230493c(String str) {
        mo230485a(str, (JSONObject) null, ApiCode.GENERAL_UNKONW_ERROR.code);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo230480a(ApiCallResult apiCallResult) {
        if (!this.f165832a) {
            if (!mo230488a(this.f165820j, apiCallResult)) {
                DebugUtil.logOrThrow("ApiHandler", "触发执行异步 Api 回调失败，apiInvokeData:", this.f165820j.mo234986b());
            }
            if (apiCallResult.isFail()) {
                mo230471b(this.f165818h, apiCallResult.toString());
            }
            mo230490b(apiCallResult);
            return;
        }
        this.f165833b.mo230477a(apiCallResult);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    /* renamed from: b */
    public final C67700a mo230470b(final C67701b bVar) {
        Object obj;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("handleApiInvoke->");
        sb.append(bVar.mo234986b());
        sb.append(" length:");
        if (!TextUtils.isEmpty(bVar.mo234988d())) {
            obj = Integer.valueOf(bVar.mo234988d().length());
        } else {
            obj = "";
        }
        sb.append(obj);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("ApiHandler", objArr);
        this.f165820j = bVar;
        if (m257901a(this.f165820j, new Runnable() {
            /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c.RunnableC658014 */

            public void run() {
                try {
                    if (AbstractC65797c.this.shouldHandleActivityResult()) {
                        ApiHandlerManager.getInst(AbstractC65797c.this.mo230473f()).registerNewActivityResultApiHandler(AbstractC65797c.this);
                    }
                    AbstractC65797c cVar = AbstractC65797c.this;
                    cVar.mo87216a(cVar.f165820j);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("ApiHandler", "event:" + bVar.mo234986b(), th);
                    AbstractC65797c.this.mo230493c(ApiCallResultHelper.generateThrowableExtraInfo(th));
                }
            }
        })) {
            return C67700a.f170531b;
        }
        DebugUtil.logOrThrow("ApiHandler", "触发执行异步 Api 处理失败，apiInvokeData:", bVar);
        return C67700a.f170530a;
    }

    /* renamed from: b */
    public void mo230489b(final LKEvent lKEvent) {
        this.f165821k = new AbstractC65805h() {
            /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c.C657992 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
            public void callback(ApiCallResult apiCallResult) {
                JSONObject json = apiCallResult.getJson();
                int a = C25529d.m91127a(json, "errCode", 0);
                if (a != 0 || apiCallResult.isFail()) {
                    lKEvent.mo92116a(a, json);
                } else {
                    lKEvent.mo92127a(json);
                }
            }
        };
        this.f165820j = C67701b.C67703a.m263358a(lKEvent.mo92146m(), new C67704c(lKEvent.mo92147n())).mo234992a(this.f165821k).mo234993a(new AbstractC65806i() {
            /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c.C658003 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, Runnable runnable) {
                if (lKEvent.mo92142i() != null) {
                    lKEvent.mo92142i().executeAsyncApiHandle(str, runnable);
                } else {
                    runnable.run();
                }
            }
        }).mo234996a();
        if (shouldHandleActivityResult()) {
            ApiHandlerManager.getInst(mo230473f()).registerNewActivityResultApiHandler(this);
        }
        mo87216a(this.f165820j);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(final LKEvent lKEvent) {
        Object obj;
        mo230469a(lKEvent);
        String m = lKEvent.mo92146m();
        this.f165818h = m;
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
        if (!mo87215a().contains(m)) {
            return lKEvent.mo92155v();
        }
        AbstractC25890a i = lKEvent.mo92142i();
        if (i != null) {
            lKEvent.mo92151r().mo92183u().mo92202b(this);
            AppBrandLogger.m52830i("ApiHandler", "unregister this handler:" + this.f165818h);
            try {
                lKEvent.mo92151r().mo92183u().mo92199a((AbstractC65797c) clone());
                if (shouldHandleActivityResult() && (lKEvent.mo92151r() instanceof AbstractC25922a)) {
                    ((AbstractC25922a) lKEvent.mo92151r()).mo92244b(this);
                }
            } catch (CloneNotSupportedException e) {
                AppBrandLogger.m52829e("ApiHandler", "CloneNotSupportedException", e);
            }
            i.executeAsyncApiHandle(m, new Runnable() {
                /* class com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c.RunnableC657981 */

                public void run() {
                    OPMonitorUtils.monitorNativeStart(AbstractC65797c.this.mo230473f(), lKEvent, true);
                    AppBrandLogger.m52830i("ApiHandler", "async handle");
                    long currentTimeMillis = System.currentTimeMillis();
                    AbstractC65797c.this.mo230489b(lKEvent);
                    ApiMonitorUtil.m91099a(ApiMonitorUtil.m91097a(lKEvent), currentTimeMillis);
                }
            });
        } else {
            AppBrandLogger.m52829e("ApiHandler", "no set async executor");
            mo230489b(lKEvent);
        }
        return lKEvent.mo92154u();
    }

    /* renamed from: a */
    public final void mo230486a(Throwable th) {
        mo230485a(ApiCallResultHelper.generateThrowableExtraInfo(th), (JSONObject) null, ApiCode.GENERAL_UNKONW_ERROR.code);
    }

    /* renamed from: a */
    public final void mo230487a(HashMap<String, Object> hashMap) {
        mo230484a((String) null, ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
    }

    public AbstractC65797c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public final void mo230482a(ApiCode apiCode, String str) {
        mo230485a(str, (JSONObject) null, apiCode.code);
    }

    /* renamed from: a */
    private boolean m257901a(C67701b bVar, Runnable runnable) {
        if (bVar == null) {
            AppBrandLogger.m52829e("ApiHandler", "triggerExecuteAsyncApiHandle->apiInvokeData is null!");
            return false;
        }
        AbstractC65806i e = bVar.mo234989e();
        if (e == null) {
            AppBrandLogger.m52829e("ApiHandler", "triggerExecuteAsyncApiHandle->executor is null!");
            return false;
        }
        e.executeAsyncApiHandle(bVar.mo234986b(), runnable);
        return true;
    }

    /* renamed from: a */
    public final void mo230484a(String str, JSONObject jSONObject) {
        mo230480a(ApiCallResult.Builder.createOk(mo230472e(), jSONObject).extraInfo(str).build());
    }

    /* renamed from: a */
    public final void mo230483a(ApiCode apiCode, JSONObject jSONObject, String str) {
        mo230485a(str, jSONObject, apiCode.code);
    }

    /* renamed from: a */
    public void mo230485a(String str, JSONObject jSONObject, int i) {
        mo230480a(ApiCallResult.Builder.createFail(mo230472e(), str, i).responseData(jSONObject).build());
    }
}

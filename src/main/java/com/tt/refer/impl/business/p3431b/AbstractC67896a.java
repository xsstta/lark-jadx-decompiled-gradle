package com.tt.refer.impl.business.p3431b;

import android.util.Pair;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler;
import com.larksuite.component.openplatform.core.utils.C25527b;
import com.larksuite.component.openplatform.core.utils.C25528c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25893d;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25898i;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.msg.WebAppApiParamParser;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.base.AbstractC67743a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.b.a */
public abstract class AbstractC67896a extends AbstractC67743a<AbstractC67717a.AbstractC67718a> implements AbstractC67717a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC65806i mo50160a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC67717a.AbstractC67718a mo235129h() {
        return new AbstractC67717a.AbstractC67718a() {
            /* class com.tt.refer.impl.business.p3431b.AbstractC67896a.C679004 */

            @Override // com.tt.refer.p3400a.p3403b.AbstractC67717a.AbstractC67718a
            /* renamed from: a */
            public C67700a mo235069a(C67701b bVar) {
                return ((AbstractC67709b) AbstractC67896a.this.getAppContext().findServiceByInterface(AbstractC67709b.class)).mo235011a(bVar);
            }
        };
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        AbstractC25576a defaultPluginContainer = this.f170082d.getDefaultPluginContainer();
        if (defaultPluginContainer != null) {
            defaultPluginContainer.ah_();
        }
    }

    protected AbstractC67896a(IAppContext iAppContext) {
        super(iAppContext);
        if (!iAppContext.isNewContainer()) {
            C25529d.m91130a(iAppContext);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo235561a(ApiCallResult apiCallResult) {
        if (apiCallResult == null) {
            return CharacterUtils.empty();
        }
        return apiCallResult.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m264192a(LKEvent lKEvent, int i, LKPluginHandleResult lKPluginHandleResult) {
        Pair<Boolean, JSONObject> a = C25527b.m91117a(lKPluginHandleResult, lKEvent.mo92146m());
        if (a.first == null || !((Boolean) a.first).booleanValue()) {
            lKEvent.mo92116a(lKPluginHandleResult.mo92267c(), (JSONObject) a.second);
            return;
        }
        ((JSONObject) a.second).remove("innerCode");
        lKEvent.mo92127a((JSONObject) a.second);
    }

    /* renamed from: a */
    public String mo235562a(final String str, String str2, final OPTrace oPTrace, final AbstractC65805h hVar) {
        String str3;
        String str4;
        String str5;
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.disable.new.pluginapi");
        AdapterApiSettingHandler.ApiCommand a = AdapterApiSettingHandler.m89609a().mo87533a(this.f170082d.getAppType(), str);
        if (a == AdapterApiSettingHandler.ApiCommand.DO_NOT_USE) {
            return ApiCallResult.Builder.createFail(str, ApiCode.GENERAL_UNABLE.msg, ApiCode.GENERAL_UNABLE.code).build().toString();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (featureGating || a == AdapterApiSettingHandler.ApiCommand.USE_OLD || AppType.WebGadgetAPP == this.f170082d.getAppType()) {
            str3 = str;
        } else {
            AppBrandLogger.m52830i("BaseJsBridgeServiceImpl", "use pluginManage");
            C67704c cVar = new C67704c(str2);
            final LKEvent a2 = new LKEvent.C25888a().mo92168a(str).mo92167a(oPTrace).mo92169a(cVar.mo235000b()).mo92162a(this.f170082d.getCurrentActivity()).mo92166a(C25527b.m91119a(cVar)).mo92165a(WebAppApiParamParser.m260522a(str, cVar)).mo92171a();
            OPMonitorUtils.monitorNativePMStart(this.f170082d, a2);
            a2.mo92121a((AbstractC25893d) new AbstractC25893d() {
                /* class com.tt.refer.impl.business.p3431b.$$Lambda$a$xp_qJtiWx9p1l2LOHHpXYyoyfQ */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25893d
                public final void callback(int i, LKPluginHandleResult lKPluginHandleResult) {
                    AbstractC67896a.m264192a(LKEvent.this, i, lKPluginHandleResult);
                }
            });
            a2.mo92123a((AbstractC25898i) new AbstractC25898i() {
                /* class com.tt.refer.impl.business.p3431b.AbstractC67896a.C678971 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25898i
                public void onEventHandleStart(boolean z) {
                    if (!z) {
                        OPMonitorUtils.monitorNativeStart(AbstractC67896a.this.f170082d, a2, true);
                    }
                }
            });
            a2.mo92119a((AbstractC25890a) new AbstractC25890a() {
                /* class com.tt.refer.impl.business.p3431b.AbstractC67896a.C678982 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
                public void executeAsyncApiHandle(String str, Runnable runnable) {
                    AbstractC67896a.this.mo50160a().executeAsyncApiHandle(str, runnable);
                }
            });
            a2.mo92122a((AbstractC25894e) new AbstractC25894e() {
                /* class com.tt.refer.impl.business.p3431b.AbstractC67896a.C678993 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48104a(int i, JSONObject jSONObject) {
                    if (hVar != null) {
                        OPMonitorUtils.monitorPMResult(AbstractC67896a.this.f170082d, a2, currentTimeMillis, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                        hVar.callback(ApiCallResult.Builder.createOk(str).responseData(jSONObject).build());
                        OPMonitorUtils.monitorResultCallback(AbstractC67896a.this.f170082d, str, oPTrace, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                    }
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48103a(int i, int i2, JSONObject jSONObject) {
                    if (hVar != null) {
                        int a = C25529d.m91125a(i2, jSONObject);
                        String optString = jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG);
                        String a2 = C25529d.m91141a(jSONObject);
                        OPMonitorUtils.monitorPMResult(AbstractC67896a.this.f170082d, a2, currentTimeMillis, "fail", i2, a, optString, a2, false);
                        hVar.callback(ApiCallResult.Builder.createFail(str).errorCode(i2).responseData(jSONObject).build());
                        OPMonitorUtils.monitorResultCallback(AbstractC67896a.this.f170082d, str, oPTrace, "fail", i2, a, optString, a2, false);
                    }
                }
            });
            LKBasePluginResult a3 = C25529d.m91131a(this.f170082d, a2);
            if (a3 == null || !a3.mo92268d()) {
                str3 = str;
                C48936b.m192783a("event:" + str3 + " not support plugin");
            } else {
                if (a3.mo92270e() != null) {
                    int c = a3.mo92267c();
                    if (c == Integer.MIN_VALUE) {
                        str5 = "ok";
                    } else {
                        str5 = "fail";
                    }
                    int a4 = C25529d.m91125a(c, a3.mo92270e());
                    String optString = a3.mo92270e().optString(ApiHandler.API_CALLBACK_ERRMSG);
                    String a5 = C25529d.m91141a(a3.mo92270e());
                    OPMonitorUtils.monitorPMResult(this.f170082d, a2, currentTimeMillis, str5, c, a4, optString, a5, true);
                    str4 = str;
                    OPMonitorUtils.monitorResultCallback(this.f170082d, str, oPTrace, str5, c, a4, optString, a5, true);
                } else {
                    str4 = str;
                }
                return C25528c.m91124a(a3, str4);
            }
        }
        C67700a a6 = ((AbstractC67717a.AbstractC67718a) mo235130i()).mo235069a(C67701b.C67703a.m263358a(str3, new C67704c(str2)).mo234992a(hVar).mo234993a(mo50160a()).mo234994a(getAppContext().getAppType()).mo234996a());
        if (!a6.mo234981a()) {
            return null;
        }
        ApiCallResult b = a6.mo234982b();
        if (b != null) {
            OPMonitorUtils.monitorOriginResult(this.f170082d, str, oPTrace, b, currentTimeMillis);
            OPMonitorUtils.monitorOriginResultCallback(this.f170082d, str3, oPTrace, b, true);
        }
        return mo235561a(a6.mo234982b());
    }
}

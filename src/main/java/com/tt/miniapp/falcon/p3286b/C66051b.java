package com.tt.miniapp.falcon.p3286b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.larksuite.component.openplatform.core.p1114c.C24423a;
import com.larksuite.component.openplatform.core.utils.C25527b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25893d;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25898i;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.falcon.jsmodule.TTJSBridge;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.falcon.p3285a.C66049d;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.jsbridge.C66254h;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.p3258a.AbstractC65718b;
import com.tt.miniapp.p3258a.C65719c;
import com.tt.miniapp.p3324r.C66713b;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.falcon.b.b */
public class C66051b {

    /* renamed from: a */
    AndroidFalconShellHolder f166716a;

    /* renamed from: b */
    IAppContext f166717b;

    /* renamed from: c */
    boolean f166718c;

    /* renamed from: d */
    public volatile boolean f166719d;

    /* renamed from: e */
    public List<C66254h> f166720e = new ArrayList();

    /* renamed from: f */
    public final List<String> f166721f = Arrays.asList("createInnerRequestTask", "createRequestTask", "createDownloadTask", "createSocketTask", "createUploadTask");

    /* renamed from: g */
    public final List<String> f166722g = Arrays.asList("setBgAudioState", "getBgAudioState", "operateBgAudio", "reportTimelinePoints", "systemLog", "operateSocketTask");

    /* renamed from: h */
    public C66237b f166723h;

    /* renamed from: i */
    private AbstractC67709b f166724i;

    /* renamed from: j */
    private AbstractC65718b<AbstractC66715a> f166725j = new C65719c();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0197 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r11v18, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r11v23, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x031d, code lost:
        if (r24.equals("readFileSync") == false) goto L_0x0314;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c5 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.lark.falcon.engine.bridge.WritableMap mo231151a(java.lang.String r24, com.lark.falcon.engine.bridge.WritableMap r25, int r26, java.lang.String r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 1022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.falcon.p3286b.C66051b.mo231151a(java.lang.String, com.lark.falcon.engine.bridge.WritableMap, int, java.lang.String, boolean):com.lark.falcon.engine.bridge.WritableMap");
    }

    /* renamed from: a */
    public void m258663a(String str, Runnable runnable, OPTrace oPTrace) {
        C66254h hVar = new C66254h(str, runnable, oPTrace, false);
        if (!this.f166719d || this.f166722g.contains(str)) {
            mo231153a(hVar);
            return;
        }
        ILogger d = C25529d.m91161d(this.f166717b);
        if (d != null) {
            d.mo92224i("ApiExecuteContext", "api ", str, "is block....");
        } else {
            AppBrandLogger.m52830i("ApiExecuteContext", "api ", str, "is block....");
        }
        this.f166720e.add(hVar);
    }

    /* renamed from: a */
    private boolean m258670a(String str) {
        return this.f166721f.contains(str) && AppbrandApplicationImpl.getInst(this.f166717b).getForeBackgroundManager().mo231963e();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258669a(String str, OPTrace oPTrace, long j, LKEvent lKEvent, int i, LKPluginHandleResult lKPluginHandleResult) {
        C66060d.m258684a(this.f166717b, str, oPTrace, j, lKEvent, lKPluginHandleResult);
        m258667a(str, lKPluginHandleResult, i, this.f166717b, this.f166716a);
    }

    /* renamed from: a */
    public void mo231153a(final C66254h hVar) {
        String str;
        ILogger d = C25529d.m91161d(this.f166717b);
        if (!TextUtils.isEmpty(hVar.f167222a)) {
            str = hVar.f167222a;
        } else {
            str = hVar.f167228g != null ? hVar.f167228g.mo92146m() : "";
        }
        this.f166716a.mo86090b(new Runnable() {
            /* class com.tt.miniapp.falcon.p3286b.C66051b.RunnableC660543 */

            public void run() {
                Runnable a = C66051b.m258659a(hVar, C66051b.this.f166717b);
                if (a != null) {
                    a.run();
                } else {
                    new C66713b(hVar, C66051b.this.f166717b).mo232443a();
                }
            }
        });
        if (d != null) {
            d.mo92224i("ApiExecuteContext", "api: " + str + " -> dispatch by handler");
        }
    }

    /* renamed from: a */
    public void mo231154a(String str, IApiInputParam iApiInputParam, int i) {
        C66254h hVar = new C66254h(str, iApiInputParam, i);
        if (!this.f166719d || this.f166722g.contains(str)) {
            mo231153a(hVar);
        } else {
            this.f166720e.add(hVar);
        }
    }

    /* renamed from: a */
    public static void m258667a(String str, LKBasePluginResult lKBasePluginResult, int i, IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder) {
        m258665a(str, i, C25527b.m91120a(lKBasePluginResult, new C66050a(), str), iAppContext, androidFalconShellHolder);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0231 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0123  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo231152a(java.lang.String r24, java.lang.String r25, int r26, java.lang.String r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 1721
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.falcon.p3286b.C66051b.mo231152a(java.lang.String, java.lang.String, int, java.lang.String, boolean):java.lang.String");
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258668a(String str, OPTrace oPTrace, long j, int i, ApiCallResult apiCallResult) {
        OPMonitorUtils.monitorOriginResult(this.f166717b, str, oPTrace, apiCallResult, j);
        C66057c.m258681a(i, null, apiCallResult.toString(), null, this.f166717b, this.f166716a, this.f166723h);
        OPMonitorUtils.monitorOriginResultCallback(this.f166717b, str, oPTrace, apiCallResult, false);
    }

    /* renamed from: a */
    private void m258660a() {
        AppbrandApplicationImpl.getInst(this.f166717b).getForeBackgroundManager().mo231958a(new C66420d.C66427b() {
            /* class com.tt.miniapp.falcon.p3286b.C66051b.C660554 */

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: b */
            public void mo88041b() {
                ILogger d = C25529d.m91161d(C66051b.this.f166717b);
                if (d != null) {
                    d.mo92224i("ApiExecuteContext", "onBackground");
                } else {
                    AppBrandLogger.m52830i("ApiExecuteContext", "onBackground");
                }
                if (!C66051b.this.f166719d) {
                    synchronized (C66051b.this) {
                        C66051b.this.f166719d = true;
                    }
                }
                if (d != null) {
                    d.mo92224i("ApiExecuteContext", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(C66051b.this.f166719d));
                    return;
                }
                AppBrandLogger.m52830i("ApiExecuteContext", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(C66051b.this.f166719d));
            }

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: a */
            public void mo88040a() {
                ILogger d = C25529d.m91161d(C66051b.this.f166717b);
                if (d != null) {
                    d.mo92224i("ApiExecuteContext", "onForeground");
                } else {
                    AppBrandLogger.m52830i("ApiExecuteContext", "onForeground");
                }
                if (C66051b.this.f166719d) {
                    synchronized (C66051b.this) {
                        C66051b.this.f166719d = false;
                        for (C66254h hVar : C66051b.this.f166720e) {
                            C66051b.this.mo231153a(hVar);
                        }
                        C66051b.this.f166720e.clear();
                    }
                }
                if (d != null) {
                    d.mo92224i("ApiExecuteContext", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(C66051b.this.f166719d));
                    return;
                }
                AppBrandLogger.m52830i("ApiExecuteContext", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(C66051b.this.f166719d));
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258662a(LKEvent lKEvent, boolean z) {
        if (!z) {
            OPMonitorUtils.monitorNativeStart(this.f166717b, lKEvent, true);
        }
    }

    /* renamed from: a */
    public static Runnable m258659a(C66254h hVar, IAppContext iAppContext) {
        if (hVar == null) {
            C67509b.m262589a("mp_special_error", "nativeApiEvent is null", "", iAppContext);
            return null;
        }
        LKEvent lKEvent = hVar.f167228g;
        if (lKEvent != null) {
            OPMonitorUtils.monitorNativeStart(iAppContext, lKEvent, hVar.f167229h);
        } else {
            OPTrace oPTrace = hVar.f167230i;
            String str = hVar.f167222a;
            if (oPTrace != null && !TextUtils.isEmpty(str)) {
                OPMonitorUtils.monitorOriginNativeStart(iAppContext, str, oPTrace, hVar.f167229h);
            }
        }
        return hVar.f167227f;
    }

    public C66051b(AndroidFalconShellHolder androidFalconShellHolder, IAppContext iAppContext, C66237b bVar) {
        this.f166716a = androidFalconShellHolder;
        this.f166717b = iAppContext;
        this.f166723h = bVar;
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.disable.plugin.forgadget");
        this.f166718c = featureGating;
        if (!featureGating && !C25529d.m91166g(iAppContext)) {
            C25529d.m91130a(iAppContext).mo92183u().mo92200a(C24423a.m89092c());
        }
        m258660a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258661a(LKEvent lKEvent, String str, Runnable runnable) {
        C66254h hVar = new C66254h(runnable, lKEvent, true);
        ILogger a = C25529d.m91135a(lKEvent);
        if (!this.f166719d || this.f166722g.contains(str)) {
            mo231153a(hVar);
            return;
        }
        if (a != null) {
            a.mo92224i("ApiExecuteContext", "is blocking api:" + this.f166719d + " event:" + str);
        } else {
            AppBrandLogger.m52830i("ApiExecuteContext", "is blocking api:" + this.f166719d + " event:" + str);
        }
        this.f166720e.add(hVar);
    }

    /* renamed from: a */
    private LKBasePluginResult m258658a(final String str, final LKEvent lKEvent, final OPTrace oPTrace, final long j) {
        OPMonitorUtils.monitorNativePMStart(this.f166717b, lKEvent);
        lKEvent.mo92121a((AbstractC25893d) new AbstractC25893d(str, oPTrace, j, lKEvent) {
            /* class com.tt.miniapp.falcon.p3286b.$$Lambda$b$D99Dp_skLX7fe8zNLvh43qYUvxg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ OPTrace f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ LKEvent f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25893d
            public final void callback(int i, LKPluginHandleResult lKPluginHandleResult) {
                C66051b.lambda$D99Dp_skLX7fe8zNLvh43qYUvxg(C66051b.this, this.f$1, this.f$2, this.f$3, this.f$4, i, lKPluginHandleResult);
            }
        });
        lKEvent.mo92123a((AbstractC25898i) new AbstractC25898i(lKEvent) {
            /* class com.tt.miniapp.falcon.p3286b.$$Lambda$b$LB04F5MbAn2ltB_74INcElIkw */
            public final /* synthetic */ LKEvent f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25898i
            public final void onEventHandleStart(boolean z) {
                C66051b.m271543lambda$LB04F5MbAn2ltB_74INcElIkw(C66051b.this, this.f$1, z);
            }
        });
        lKEvent.mo92119a((AbstractC25890a) new AbstractC25890a(lKEvent) {
            /* class com.tt.miniapp.falcon.p3286b.$$Lambda$b$CSB_h7BbdLA2jEsGjP96XYpwtCA */
            public final /* synthetic */ LKEvent f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
            public final void executeAsyncApiHandle(String str, Runnable runnable) {
                C66051b.lambda$CSB_h7BbdLA2jEsGjP96XYpwtCA(C66051b.this, this.f$1, str, runnable);
            }
        });
        lKEvent.mo92122a((AbstractC25894e) new AbstractC25894e() {
            /* class com.tt.miniapp.falcon.p3286b.C66051b.C660532 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48104a(int i, JSONObject jSONObject) {
                String str;
                ILogger a = C25529d.m91135a(lKEvent);
                a.mo92224i("ApiExecuteContext", "onSuccess eventId:" + i);
                Object remove = jSONObject.remove("inner_tracing_id");
                if (remove instanceof String) {
                    str = (String) remove;
                } else {
                    str = null;
                }
                OPMonitorUtils.monitorPMResult(C66051b.this.f166717b, lKEvent, j, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                String str2 = str;
                C66057c.m258681a(i, str2, ApiCallResult.Builder.createOk(str2).responseData(jSONObject).build().toString(), str, C66051b.this.f166717b, C66051b.this.f166716a, C66051b.this.f166723h);
                OPMonitorUtils.monitorResultCallback(C66051b.this.f166717b, str, oPTrace, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48103a(int i, int i2, JSONObject jSONObject) {
                String str;
                ILogger a = C25529d.m91135a(lKEvent);
                a.mo92224i("ApiExecuteContext", "eventName:" + str + " errorCode:" + i2);
                Object remove = jSONObject.remove("inner_tracing_id");
                if (remove instanceof String) {
                    str = (String) remove;
                } else {
                    str = null;
                }
                int a2 = C25529d.m91125a(i2, jSONObject);
                String optString = jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG);
                String a3 = C25529d.m91141a(jSONObject);
                OPMonitorUtils.monitorPMResult(C66051b.this.f166717b, lKEvent, j, "fail", i2, a2, optString, a3, false);
                C66057c.m258681a(i, str, ApiCallResult.Builder.createFail(str).errorCode(i2).responseData(jSONObject).build().toString(), str, C66051b.this.f166717b, C66051b.this.f166716a, C66051b.this.f166723h);
                OPMonitorUtils.monitorResultCallback(C66051b.this.f166717b, str, oPTrace, "fail", i2, a2, optString, a3, false);
            }
        });
        LKBasePluginResult a = C25529d.m91131a(this.f166717b, lKEvent);
        if (a != null) {
            return a;
        }
        ILogger a2 = C25529d.m91135a(lKEvent);
        a2.mo92224i("ApiExecuteContext", "eventName:" + str + " PM No handle this event!");
        return lKEvent.mo92155v();
    }

    /* renamed from: a */
    public static /* synthetic */ void m258664a(AbstractC66047b bVar, IAppContext iAppContext, String str, AndroidFalconShellHolder androidFalconShellHolder, int i) {
        if (bVar != null) {
            String string = bVar.getString(ApiHandler.API_CALLBACK_ERRMSG);
            if (!TextUtils.isEmpty(string) && string.contains("fail")) {
                C66060d.m258685a(iAppContext, str, "callHandler", string, 2);
            }
        }
        ((TTJSBridge) androidFalconShellHolder.mo86077a(TTJSBridge.class)).callHandler(i, ((C66049d) bVar).mo231137a());
    }

    /* renamed from: a */
    private static void m258665a(String str, int i, AbstractC66047b bVar, IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder) {
        ILogger d = C25529d.m91161d(iAppContext);
        if (d != null) {
            d.mo92224i("ApiExecuteContext", "invokeApi eventName：" + str);
        }
        androidFalconShellHolder.mo86083a(new Runnable(iAppContext, str, androidFalconShellHolder, i) {
            /* class com.tt.miniapp.falcon.p3286b.$$Lambda$b$hjfP7haHpBthRH3vJGzNKizixY */
            public final /* synthetic */ IAppContext f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ AndroidFalconShellHolder f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C66051b.m271544lambda$hjfP7haHpBthRH3vJGzNKizixY(AbstractC66047b.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public static void m258666a(String str, AbstractC25903n nVar, int i, IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder) {
        m258665a(str, i, C66718d.m260516a(str, nVar, new C66050a()), iAppContext, androidFalconShellHolder);
    }
}

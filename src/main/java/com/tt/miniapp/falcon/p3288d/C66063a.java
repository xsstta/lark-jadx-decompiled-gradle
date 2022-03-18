package com.tt.miniapp.falcon.p3288d;

import android.text.TextUtils;
import com.bytedance.ee.falcon.openplugin.FalconLarkBridgeModule;
import com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b;
import com.bytedance.ee.falcon.worker.WorkerPipe;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.lark.falcon.engine.AbstractC23944a;
import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.WritableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.holder.AndroidShellHolderDelegate;
import com.lark.falcon.engine.holder.C23974a;
import com.lark.falcon.engine.p1061e.C23973a;
import com.lark.falcon.engine.plugin.WorkerGetUserInfoPlugin;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.plugin.applink.OpenSchemaAsyncHandlerPlugin;
import com.larksuite.component.openplatform.core.plugin.inner.ApiMonitorReportHandlerPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.EnterProfileAsyncHandlerPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e;
import com.larksuite.component.openplatform.plugins.p1144c.C25563f;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25928e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.p2069j.p2070a.C40650q;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tt.miniapp.falcon.d.a */
public class C66063a extends AbstractC23944a {

    /* renamed from: f */
    public FalconLarkBridgeModule f166757f;

    /* renamed from: g */
    private AbstractC25562e f166758g;

    /* renamed from: h */
    private final AtomicBoolean f166759h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f166760i = new AtomicBoolean(false);

    /* renamed from: j */
    private final AndroidFalconShellHolder f166761j;

    /* renamed from: k */
    private AndroidFalconShellHolder f166762k;

    /* renamed from: l */
    private WorkerPipe f166763l;

    /* renamed from: m */
    private long f166764m = -1;

    /* renamed from: f */
    public WorkerPipe mo231169f() {
        return this.f166763l;
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25561d
    /* renamed from: i */
    public AbstractC25562e mo85962i() {
        return this.f166758g;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m258705j() {
        this.f166762k.mo86096g();
    }

    @Override // com.lark.falcon.engine.AbstractC23944a
    /* renamed from: b */
    public void mo85945b() {
        super.mo85945b();
        WorkerPipe workerPipe = this.f166763l;
        if (workerPipe != null) {
            workerPipe.mo48145a();
        }
        FalconLarkBridgeModule falconLarkBridgeModule = this.f166757f;
        if (falconLarkBridgeModule != null) {
            falconLarkBridgeModule.mo48101c();
            this.f166757f = null;
        }
        AndroidFalconShellHolder androidFalconShellHolder = this.f166762k;
        if (androidFalconShellHolder != null) {
            androidFalconShellHolder.mo86083a(new Runnable() {
                /* class com.tt.miniapp.falcon.p3288d.$$Lambda$a$vK61tIOkJOaVdqebVx78NJl2Rnk */

                public final void run() {
                    C66063a.lambda$vK61tIOkJOaVdqebVx78NJl2Rnk(C66063a.this);
                }
            });
        }
        this.f166758g = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.lark.falcon.engine.AbstractC23944a
    /* renamed from: c */
    public void mo85947c() {
        if (this.f166757f == null) {
            AppBrandLogger.m52829e("FalconJsWorker", "notifyAppSessionChanged, mLarkBridgeModule is NULL");
        } else if (this.f59255a == null) {
            AppBrandLogger.m52829e("FalconJsWorker", "notifyAppSessionChanged, mAppContext is NULL");
        } else {
            C23973a.m87629a(this.f166757f.mo48100b(), this.f59255a.getAppId());
        }
    }

    /* renamed from: g */
    private JavaOnlyMap m258703g() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putBoolean("workerApiUseJSSDKMonitor", C24512a.m89388c());
        javaOnlyMap.putMap("JSCoreFG", javaOnlyMap2);
        OPTrace tracingSpan = this.f59255a.getTracingSpan();
        if (tracingSpan != null) {
            JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
            javaOnlyMap3.putString("traceId", tracingSpan.getTracingID());
            javaOnlyMap3.putLong("createTime", tracingSpan.createTime());
            javaOnlyMap3.putArray("extensions", new JavaOnlyArray());
            JavaOnlyMap javaOnlyMap4 = new JavaOnlyMap();
            javaOnlyMap4.putString("optrace_batch_config", C25538c.m91188a().mo88680b());
            javaOnlyMap3.putMap("config", javaOnlyMap4);
            javaOnlyMap.putMap("TMATrace", javaOnlyMap3);
        }
        return javaOnlyMap;
    }

    /* renamed from: h */
    private void m258704h() {
        FalconLarkBridgeModule falconLarkBridgeModule = new FalconLarkBridgeModule(this.f59255a.getCurrentActivity());
        this.f166757f = falconLarkBridgeModule;
        AbstractC25904o a = falconLarkBridgeModule.mo48097a();
        a.mo92199a(new WorkerGetUserInfoPlugin());
        a.mo92199a(new OpenSchemaAsyncHandlerPlugin());
        a.mo92199a(new ApiMonitorReportHandlerPlugin());
        a.mo92199a(new EnterProfileAsyncHandlerPlugin());
        this.f166757f.mo48098a(new AbstractC12706b() {
            /* class com.tt.miniapp.falcon.p3288d.C66063a.C660641 */

            @Override // com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b
            /* renamed from: a */
            public void mo48109a(LKEvent lKEvent) {
                C25529d.m91143a(lKEvent, C66063a.this.f59255a);
            }

            @Override // com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b
            /* renamed from: b */
            public void mo48110b(LKEvent lKEvent) {
                OPMonitorUtils.monitorNativeStart(C66063a.this.f59255a, lKEvent, true, C66063a.this.f59256b);
            }

            @Override // com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b
            /* renamed from: a */
            public OPTrace mo48106a(String str) {
                if (ProcessUtil.isMiniappProcess()) {
                    return AppbrandContext.getInst().getTracing().subTrace(str);
                }
                return C66063a.this.f59255a.getTracingSpan().subTrace(str);
            }

            @Override // com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b
            /* renamed from: a */
            public void mo48107a(AbstractC12706b.C12708a aVar) {
                OPMonitorUtils.monitorNativeInvoke(C66063a.this.f59255a, aVar.mo48117g(), aVar.mo48111a(), aVar.mo48119i(), String.valueOf(aVar.mo48120j()), null, aVar.mo48118h(), C66063a.this.f59256b);
            }

            @Override // com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b
            /* renamed from: a */
            public void mo48108a(AbstractC12706b.C12708a aVar, boolean z, boolean z2) {
                String str;
                String str2;
                int i;
                if ("ok".equals(aVar.mo48113c())) {
                    i = C25906a.f64071a.f64116I;
                    str2 = C25906a.f64071a.f64117J;
                    str = C25906a.f64071a.f64117J;
                } else {
                    i = C25529d.m91125a(aVar.mo48115e(), aVar.mo48116f());
                    str2 = aVar.mo48116f().optString(ApiHandler.API_CALLBACK_ERRMSG);
                    str = C25529d.m91141a(aVar.mo48116f());
                }
                if (z) {
                    OPMonitorUtils.monitorPMResult(C66063a.this.f59255a, aVar.mo48112b(), aVar.mo48114d(), aVar.mo48113c(), aVar.mo48115e(), i, str2, str, z2, C66063a.this.f59256b);
                } else {
                    OPMonitorUtils.monitorResultCallback(C66063a.this.f59255a, aVar.mo48111a(), aVar.mo48117g(), aVar.mo48113c(), aVar.mo48115e(), i, str2, str, z2, C66063a.this.f59256b);
                }
            }
        });
        this.f166762k.mo86091c().registerModule(this.f166757f);
        this.f166762k.mo86093d();
        this.f166758g = new AbstractC25562e() {
            /* class com.tt.miniapp.falcon.p3288d.C66063a.C660652 */

            @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e
            public AbstractC25905b getBridgeContext() {
                AbstractC25905b v = C66063a.this.f166757f.mo48100b().mo92184v();
                if (v instanceof AbstractC25928e) {
                    ((AbstractC25928e) v).mo92221a(C66063a.this.f59255a);
                }
                return v;
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258701a(long j) {
        if (this.f166759h.get()) {
            AppBrandLogger.m52829e("FalconJsWorker", "startExecuteInThread: IsStarted");
            return;
        }
        this.f166759h.set(true);
        this.f166760i.set(true);
        String readString = IOUtils.readString(this.f59257c, "utf-8");
        AndroidFalconShellHolder androidFalconShellHolder = this.f166762k;
        androidFalconShellHolder.mo86087a(readString, this.f59256b + ".js");
        if (this.f166760i.get()) {
            AppBrandLogger.m52830i("FalconJsWorker", "startExecuteInThread, load jssdk success");
            new C67500a(C40650q.f103138a, this.f59255a).setResultTypeSuccess().addCategoryValue("worker", this.f59256b).addCategoryValue("duration", Long.valueOf(System.currentTimeMillis() - j)).addCategoryValue("sdkInitDuration", Long.valueOf(this.f166764m)).addCategoryValue("workerJssdkVersion", mo85943a()).flush();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258702a(long j, long j2) {
        mo85947c();
        this.f166764m = System.currentTimeMillis() - j;
        if (this.f166759h.get()) {
            AppBrandLogger.m52829e("FalconJsWorker", "startExecuteInThread: IsStarted");
            return;
        }
        this.f166762k.mo86083a(new Runnable(j2) {
            /* class com.tt.miniapp.falcon.p3288d.$$Lambda$a$zTKfqL4NIt61yahLBeIkq3uvw */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C66063a.m271546lambda$zTKfqL4NIt61yahLBeIkq3uvw(C66063a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258700a(int i, String str) {
        this.f166760i.set(false);
        OPMonitor addCategoryValue = new C67500a(C40650q.f103138a, this.f59255a).setResultTypeFail().addCategoryValue("worker", this.f59256b).addCategoryValue("sdkInitDuration", Long.valueOf(this.f166764m)).addCategoryValue("workerJssdkVersion", mo85943a());
        addCategoryValue.setErrorCode("" + i).setErrorMessage(str).flush();
    }

    /* renamed from: a */
    public C25908c mo231168a(WritableMap writableMap, C25563f.C25565a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f59257c)) {
            new C67500a(C40650q.f103138a, this.f59255a).setResultTypeFail().addCategoryValue("worker", this.f59256b).addCategoryValue("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).setErrorMessage("js file not exist").setErrorCode("scriptError").flush();
            return C25913h.f64155K;
        }
        AndroidFalconShellHolder androidFalconShellHolder = new AndroidFalconShellHolder(new C23974a.C23976a().mo86108b(C25529d.m91170k(this.f59255a)).mo86106a(true).mo86107a());
        this.f166762k = androidFalconShellHolder;
        androidFalconShellHolder.mo86081a(new AndroidShellHolderDelegate() {
            /* class com.tt.miniapp.falcon.p3288d.$$Lambda$a$SEgwpJFDSqwz42yysSAflzeBWP0 */

            @Override // com.lark.falcon.engine.holder.AndroidShellHolderDelegate
            public final void onError(int i, String str) {
                C66063a.lambda$SEgwpJFDSqwz42yysSAflzeBWP0(C66063a.this, i, str);
            }
        });
        JavaOnlyMap g = m258703g();
        if (writableMap != null) {
            g.merge(writableMap);
        }
        this.f166762k.mo86080a(g);
        m258704h();
        aVar.mo88716a(this);
        aVar.mo88717a(new C25563f.AbstractC25566b(System.currentTimeMillis(), currentTimeMillis) {
            /* class com.tt.miniapp.falcon.p3288d.$$Lambda$a$jCTHjVYUqDSqDbac7KGNjnJ27co */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            @Override // com.larksuite.component.openplatform.plugins.p1144c.C25563f.AbstractC25566b
            public final void ready() {
                C66063a.lambda$jCTHjVYUqDSqDbac7KGNjnJ27co(C66063a.this, this.f$1, this.f$2);
            }
        });
        this.f166763l = new WorkerPipe(this.f166761j, this.f166762k);
        aVar.mo88718a(this.f166757f.mo48097a());
        this.f59258d.mo88700a(aVar.mo88720a(), this.f59255a.getCurrentActivity());
        return C25906a.f64071a;
    }

    public C66063a(IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder, AbstractC25558a aVar) {
        super(iAppContext, aVar);
        this.f166761j = androidFalconShellHolder;
    }
}

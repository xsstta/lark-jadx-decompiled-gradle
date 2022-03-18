package com.lark.falcon.engine;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsEngine;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.he.v8_inspect.Inspector;
import com.he.v8_inspect.InspectorHelper;
import com.lark.falcon.engine.bridge.JsWorkerBridge;
import com.lark.falcon.engine.p1057a.AbstractC23947a;
import com.lark.falcon.engine.p1061e.C23973a;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25567g;
import com.larksuite.component.openplatform.plugins.p1144c.C25563f;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.p2069j.p2070a.C40650q;
import com.ss.android.lark.sdk.C53241h;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.jsbridge.Jscore;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.DebugUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.lark.falcon.engine.b */
public class C23948b extends AbstractC23944a {

    /* renamed from: f */
    private static final String f59264f = "b";

    /* renamed from: g */
    private long f59265g;

    /* renamed from: h */
    private Handler f59266h;

    /* renamed from: i */
    private JsObject f59267i;

    /* renamed from: j */
    private JsEngine f59268j;

    /* renamed from: k */
    private JsContext f59269k;

    /* renamed from: l */
    private Inspector f59270l;

    /* renamed from: m */
    private boolean f59271m;

    /* renamed from: n */
    private AbstractC23947a f59272n;

    /* renamed from: o */
    private final Map<String, Method> f59273o = new HashMap();

    /* renamed from: a */
    public static HandlerThread m87557a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: f */
    public JsObject mo85959f() {
        return this.f59267i;
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25561d
    /* renamed from: i */
    public AbstractC25562e mo85962i() {
        return this.f59272n;
    }

    /* renamed from: a */
    public void mo85957a(long j, long j2) {
        if (this.f59271m) {
            AppBrandLogger.m52829e(f59264f, "startExecuteInThread: IsStarted");
            return;
        }
        m87562a(new Runnable(j, j2) {
            /* class com.lark.falcon.engine.$$Lambda$b$wRvpyADJPZkR2Qht5l3xHf6UHM */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C23948b.m270164lambda$wRvpyADJPZkR2Qht5l3xHf6UHM(C23948b.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo85958a(String str, AbstractC25567g<String> gVar) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e(f59264f, "evaluateJavascript: script is NULL");
            return;
        }
        this.f59266h.post(new Runnable(str, gVar) {
            /* class com.lark.falcon.engine.$$Lambda$b$7BcQBQQewX2qR5yXlsgUPdiSA0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AbstractC25567g f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C23948b.m270159lambda$7BcQBQQewX2qR5yXlsgUPdiSA0(C23948b.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: j */
    private void m87568j() {
        m87562a(new Runnable() {
            /* class com.lark.falcon.engine.$$Lambda$b$AcUe2ulg6XWAyxBPHTz3tVWN8 */

            public final void run() {
                C23948b.m270160lambda$AcUe2ulg6XWAyxBPHTz3tVWN8(C23948b.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m87569k() {
        this.f59269k.run(new JsContext.ScopeCallback() {
            /* class com.lark.falcon.engine.$$Lambda$b$yQC1vgrz2qkRA7AGddgh1J_ynAY */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public final void run(JsScopedContext jsScopedContext) {
                C23948b.lambda$yQC1vgrz2qkRA7AGddgh1J_ynAY(C23948b.this, jsScopedContext);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m87570l() {
        this.f59269k.run(new JsContext.ScopeCallback() {
            /* class com.lark.falcon.engine.$$Lambda$b$Nmrx5ftKnd1I8BHYPCguhBcMbrk */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public final void run(JsScopedContext jsScopedContext) {
                C23948b.lambda$Nmrx5ftKnd1I8BHYPCguhBcMbrk(C23948b.this, jsScopedContext);
            }
        });
    }

    /* renamed from: g */
    public void mo85960g() {
        m87562a(new Runnable() {
            /* class com.lark.falcon.engine.$$Lambda$b$laUBzy15XVR90j9MvvOIVp2htA */

            public final void run() {
                C23948b.m270162lambda$laUBzy15XVR90j9MvvOIVp2htA(C23948b.this);
            }
        });
    }

    /* renamed from: h */
    public void mo85961h() {
        m87562a(new Runnable() {
            /* class com.lark.falcon.engine.$$Lambda$b$_bmDquTEqt2lpaxqEp3VlC7Q44 */

            public final void run() {
                C23948b.m270161lambda$_bmDquTEqt2lpaxqEp3VlC7Q44(C23948b.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m87571m() {
        JsEngine jsEngine = new JsEngine(this.f59266h);
        this.f59268j = jsEngine;
        this.f59269k = new JsContext(jsEngine);
        if (InspectorHelper.isDebugEnable()) {
            Inspector createInspector = InspectorHelper.createInspector(this.f59259e, this.f59268j.vm);
            this.f59270l = createInspector;
            createInspector.updateDisplayName("JsWorker " + this.f59256b);
        }
    }

    @Override // com.lark.falcon.engine.AbstractC23944a
    /* renamed from: b */
    public void mo85945b() {
        super.mo85945b();
        this.f59272n.onRelease();
    }

    /* access modifiers changed from: protected */
    @Override // com.lark.falcon.engine.AbstractC23944a
    /* renamed from: c */
    public void mo85947c() {
        if (this.f59272n == null) {
            AppBrandLogger.m52829e(f59264f, "notifyAppSessionChanged, mWorkerBridge is NULL");
        } else if (this.f59255a == null) {
            AppBrandLogger.m52829e(f59264f, "notifyAppSessionChanged, mAppContext is NULL");
        } else {
            C23973a.m87629a(this.f59272n.getPluginManagerContainer(), this.f59255a.getAppId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m87565b(JsScopedContext jsScopedContext) {
        JsObject global = jsScopedContext.global();
        JsObject createObject = jsScopedContext.createObject();
        m87561a(jsScopedContext, createObject);
        global.set("Lark_Bridge", (AbstractC66047b) createObject);
    }

    /* renamed from: a */
    private void m87562a(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f59266h.post(new Runnable(runnable, countDownLatch) {
            /* class com.lark.falcon.engine.$$Lambda$b$40108GvifJ58Fq0OFNfsVyHnM */
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ CountDownLatch f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C23948b.m270158lambda$40108GvifJ58Fq0OFNfsVyHnM(this.f$0, this.f$1);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            AppBrandLogger.m52829e(f59264f, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m87560a(JsScopedContext jsScopedContext) {
        JsObject global = jsScopedContext.global();
        JsObject createObject = jsScopedContext.createObject();
        createObject.set("workerApiUseJSSDKMonitor", C24512a.m89388c());
        global.set("JSCoreFG", (AbstractC66047b) createObject);
        OPTrace tracingSpan = this.f59255a.getTracingSpan();
        if (tracingSpan != null) {
            JsObject createObject2 = jsScopedContext.createObject();
            createObject2.set("traceId", tracingSpan.getTracingID());
            createObject2.set("createTime", (double) tracingSpan.createTime());
            createObject2.set("extensions", (AbstractC66046a) jsScopedContext.createArray(0));
            JsObject createObject3 = jsScopedContext.createObject();
            createObject3.set("optrace_batch_config", C25538c.m91188a().mo88680b());
            createObject2.set("config", (AbstractC66047b) createObject3);
            global.set("TMATrace", (AbstractC66047b) createObject2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m87563a(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public C23948b(IAppContext iAppContext, AbstractC25558a aVar) {
        super(iAppContext, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m87566b(String str, AbstractC25567g gVar) {
        String evaluateStringScript = JsEngine.evaluateStringScript(this.f59268j.vm, str);
        if (gVar != null) {
            gVar.onReceiveValue(evaluateStringScript);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m87564b(long j, long j2) {
        if (this.f59271m) {
            AppBrandLogger.m52829e(f59264f, "startExecuteInThread: IsStarted");
            return;
        }
        this.f59271m = true;
        this.f59269k.run(new JsContext.ScopeCallback(j, j2) {
            /* class com.lark.falcon.engine.$$Lambda$b$ols_NNx2znhqhOGBgUGOf6xYc */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public final void run(JsScopedContext jsScopedContext) {
                C23948b.m270163lambda$ols_NNx2znhqhOGBgUGOf6xYc(C23948b.this, this.f$1, this.f$2, jsScopedContext);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m87567c(long j, long j2) {
        String str = f59264f;
        C53241h.m205898b(str, "worker name :" + this.f59256b + " ready.");
        mo85947c();
        mo85957a(j2, System.currentTimeMillis() - j);
    }

    /* renamed from: a */
    private void m87561a(JsScopedContext jsScopedContext, JsObject jsObject) {
        if (this.f59273o.isEmpty()) {
            Method[] methods = JsWorkerBridge.class.getMethods();
            for (Method method : methods) {
                Jscore jscore = (Jscore) method.getAnnotation(Jscore.class);
                if (jscore != null) {
                    String jsfunctionname = jscore.jsfunctionname();
                    if (!TextUtils.isEmpty(jsfunctionname)) {
                        if (DebugUtil.debug()) {
                            AppBrandLogger.m52828d(f59264f, "register to js:" + jsfunctionname);
                        }
                        this.f59273o.put(jsfunctionname, method);
                        jsObject.set(method.getName(), (AbstractC66047b) jsScopedContext.createFunction(this.f59272n, method));
                    }
                }
            }
            return;
        }
        for (Map.Entry<String, Method> entry : this.f59273o.entrySet()) {
            jsObject.set(entry.getKey(), (AbstractC66047b) jsScopedContext.createFunction(this.f59272n, entry.getValue()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m87558a(long j, long j2, JsScopedContext jsScopedContext) {
        try {
            String str = f59264f;
            AppBrandLogger.m52830i(str, "startExecuteInThread, load jssdk start, path = " + this.f59257c + " local version = " + this.f59258d.mo88701b());
            JsEngine.startExecuteInThread(this.f59265g, this.f59268j.vm, this.f59257c);
            long currentTimeMillis = System.currentTimeMillis() - j;
            AppBrandLogger.m52830i(str, "startExecuteInThread, load jssdk success");
            new C67500a(C40650q.f103138a, this.f59255a).setResultTypeSuccess().addCategoryValue("worker", this.f59256b).addCategoryValue("duration", Long.valueOf(currentTimeMillis)).addCategoryValue("sdkInitDuration", Long.valueOf(j2)).addCategoryValue("workerJssdkVersion", mo85943a()).flush();
        } catch (Exception e) {
            String message = e.getMessage();
            String str2 = f59264f;
            AppBrandLogger.m52829e(str2, "startExecuteInThread, load jssdk failed, errMsg = " + message);
            new C67500a(C40650q.f103138a, this.f59255a).setResultTypeFail().addCategoryValue("worker", this.f59256b).addCategoryValue("duration", 0L).addCategoryValue("sdkInitDuration", Long.valueOf(j2)).addCategoryValue("workerJssdkVersion", mo85943a()).setErrorCode("scriptError").setErrorMessage(message).flush();
        }
    }

    /* renamed from: a */
    public C25908c mo85956a(JsScopedContext jsScopedContext, JSONObject jSONObject, FrameLayout frameLayout) {
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f59257c)) {
            new C67500a(C40650q.f103138a, this.f59255a).setResultTypeFail().addCategoryValue("worker", this.f59256b).addCategoryValue("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).setErrorMessage("js file not exist").setErrorCode("scriptError").flush();
            return C25913h.f64155K;
        }
        long j = jsScopedContext.vm;
        this.f59265g = j;
        this.f59267i = new JsObject(this.f59265g, jsScopedContext.id, JsEngine.createWorker(j, jsScopedContext.id));
        HandlerThread a = m87557a(f59264f + "_" + this.f59256b);
        a.start();
        this.f59266h = new Handler(a.getLooper());
        this.f59272n = new JsWorkerBridge(this.f59255a, this.f59256b, new JsWorkerBridge.AbstractC23966a() {
            /* class com.lark.falcon.engine.$$Lambda$WgILwiTBQZ5b6IMUg8TmdUdZ2M */

            @Override // com.lark.falcon.engine.bridge.JsWorkerBridge.AbstractC23966a
            public final void execJs(String str, AbstractC25567g gVar) {
                C23948b.this.mo85958a(str, gVar);
            }
        });
        m87568j();
        mo85960g();
        mo85961h();
        m87559a(this.f59255a, this.f59258d, jSONObject, currentTimeMillis, frameLayout);
        return C25906a.f64071a;
    }

    /* renamed from: a */
    private void m87559a(IAppContext iAppContext, AbstractC25558a aVar, JSONObject jSONObject, long j, FrameLayout frameLayout) {
        long currentTimeMillis = System.currentTimeMillis();
        Activity currentActivity = iAppContext.getCurrentActivity();
        C25563f.C25565a a = new C25563f.C25565a().mo88716a(this).mo88715a(jSONObject).mo88718a(this.f59272n.getPluginManager()).mo88719a(iAppContext.getAppId()).mo88717a(new C25563f.AbstractC25566b(currentTimeMillis, j) {
            /* class com.lark.falcon.engine.$$Lambda$b$BSqFn84gExS60u0mxb8HnjJYnYg */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            @Override // com.larksuite.component.openplatform.plugins.p1144c.C25563f.AbstractC25566b
            public final void ready() {
                C23948b.lambda$BSqFn84gExS60u0mxb8HnjJYnYg(C23948b.this, this.f$1, this.f$2);
            }
        }).mo88713a(frameLayout);
        if (iAppContext instanceof C67460f) {
            C67460f fVar = (C67460f) iAppContext;
            if (fVar.mo234156a() instanceof C66546p) {
                a.mo88714a(((C66546p) fVar.mo234156a()).mo232114F());
            }
        }
        aVar.mo88700a(a.mo88720a(), currentActivity);
    }
}

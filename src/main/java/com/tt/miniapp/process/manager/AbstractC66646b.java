package com.tt.miniapp.process.manager;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.entity.C66007a;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.C66643a;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.p3316a.C66613b;
import com.tt.miniapp.render.C66734d;
import com.tt.miniapp.render.OPRenderEngineProvider;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67548h;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67435c;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.process.manager.b */
public abstract class AbstractC66646b implements IAppSandboxEnvProcessor {

    /* renamed from: a */
    public List<SandboxMonitor.AbstractC66610a> f168233a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public String f168234b;

    /* renamed from: c */
    public final Object f168235c = new Object();

    /* renamed from: d */
    public SandboxMonitor.AbstractC66610a f168236d = new SandboxMonitor.AbstractC66610a() {
        /* class com.tt.miniapp.process.manager.AbstractC66646b.C666471 */

        @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
        public void onAlive(ISandboxEnvInfo iSandboxEnvInfo) {
            try {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "Miniapp process start：", iSandboxEnvInfo.getSandboxName());
                synchronized (SandboxMonitor.class) {
                    for (SandboxMonitor.AbstractC66610a aVar : AbstractC66646b.this.f168233a) {
                        if (aVar != null) {
                            aVar.onAlive(iSandboxEnvInfo);
                        }
                    }
                }
            } catch (Exception e) {
                DebugUtil.outputError("AppSandBoxEnvProcessorWrapper", "" + e);
            }
        }

        @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
        public void onDied(ISandboxEnvInfo iSandboxEnvInfo) {
            try {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "miniapp process died:", iSandboxEnvInfo.getSandboxName(), iSandboxEnvInfo.getAppId());
                if (TextUtils.isEmpty(iSandboxEnvInfo.getAppId())) {
                    AbstractC66646b.m260363a(iSandboxEnvInfo, "preload", 9200, "monitor");
                    AbstractC67433a appContext = iSandboxEnvInfo.getAppContext();
                    if (appContext == null) {
                        appContext = C67448a.m262353a().mo234190i();
                    }
                    AbstractC66646b.this.mo232366a(appContext);
                }
                synchronized (SandboxMonitor.class) {
                    for (SandboxMonitor.AbstractC66610a aVar : AbstractC66646b.this.f168233a) {
                        if (aVar != null) {
                            try {
                                aVar.onDied(iSandboxEnvInfo);
                            } catch (Exception e) {
                                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", e);
                            }
                        }
                    }
                }
                AbstractC66646b.this.mo232365a(iSandboxEnvInfo);
                String killingAppId = iSandboxEnvInfo.getKillingAppId();
                if (iSandboxEnvInfo.getAppId() == null) {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "process died reset1：", iSandboxEnvInfo);
                    iSandboxEnvInfo.reset();
                } else if (!iSandboxEnvInfo.isActivityCreated()) {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "process died not reset for activity");
                } else if (killingAppId == null || killingAppId.equals(iSandboxEnvInfo.getAppId())) {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "process died reset2：", iSandboxEnvInfo);
                    iSandboxEnvInfo.reset();
                } else {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "process died not reset for appId：", iSandboxEnvInfo.getAppId());
                }
                iSandboxEnvInfo.setKillingAppId(null);
            } catch (Exception e2) {
                DebugUtil.outputError("AppSandBoxEnvProcessorWrapper", "" + e2);
            }
        }
    };

    /* renamed from: e */
    private IGetDataCallback<Boolean> f168237e;

    /* renamed from: f */
    private boolean f168238f;

    /* renamed from: g */
    private ISandboxEnvInfo[] f168239g;

    /* renamed from: h */
    private ISandboxEnvInfo[] f168240h;

    /* renamed from: i */
    private final Object f168241i = new Object();

    /* renamed from: j */
    private Handler f168242j;

    /* renamed from: a */
    public static HandlerThread m260359a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.process.manager.b$b */
    public static class C66651b {

        /* renamed from: a */
        int f168251a;

        /* renamed from: b */
        String f168252b;

        /* renamed from: c */
        String f168253c;

        /* renamed from: d */
        RenderEngineType f168254d;

        private C66651b() {
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public SandboxMonitor.AbstractC66610a getInnerProcessLifeListener() {
        return this.f168236d;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public String getPlayingBgAudioProcessName() {
        return this.f168234b;
    }

    /* renamed from: a */
    public ISandboxEnvInfo[] mo232368a(RenderEngineType renderEngineType) {
        if (!RenderEngineManageService.getInstance().isFgSandBoxRefactorEnabled()) {
            return m260365b();
        }
        OPRenderEngineProvider findEngine = RenderEngineManageService.getInstance().findEngine(renderEngineType);
        if (findEngine == null) {
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "could not find renderType " + renderEngineType);
            findEngine = RenderEngineManageService.getInstance().findEngine(RenderEngineType.WebView);
        }
        if (findEngine != null) {
            return findEngine.getSandboxEnvConfigList(this);
        }
        AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "engineProvider should not null, but is");
        return m260365b();
    }

    /* renamed from: a */
    public ISandboxEnvInfo[] mo232367a() {
        if (!RenderEngineManageService.getInstance().isFgSandBoxRefactorEnabled()) {
            return m260365b();
        }
        if (this.f168239g == null) {
            synchronized (this.f168241i) {
                if (this.f168239g == null) {
                    ArrayList arrayList = new ArrayList();
                    for (RenderEngineType renderEngineType : getAllRenderEngineType()) {
                        arrayList.addAll(Arrays.asList(mo232368a(renderEngineType)));
                    }
                    this.f168239g = (ISandboxEnvInfo[]) arrayList.toArray(new ISandboxEnvInfo[arrayList.size()]);
                }
            }
        }
        if (this.f168239g.length == 0) {
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "mAllSandboxEnvConfigList should not empty, but is");
            this.f168239g = m260365b();
        }
        return this.f168239g;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo[] getAllSandboxEnvs() {
        return mo232367a();
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getPreloadSandboxEnvInfo() {
        return getPreloadSandboxEnvInfo(RenderEngineType.WebView);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void preloadEmptySandboxEnv() {
        preloadEmptySandboxEnv(2000, "inner preload", C67448a.m262353a().mo234190i());
    }

    /* renamed from: b */
    private ISandboxEnvInfo[] m260365b() {
        if (this.f168240h == null) {
            synchronized (this.f168241i) {
                if (this.f168240h == null) {
                    this.f168240h = C66734d.m260545a(this);
                }
            }
        }
        return this.f168240h;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void killAllSandbox() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        for (ISandboxEnvInfo iSandboxEnvInfo : mo232367a()) {
            killSandbox(applicationContext, iSandboxEnvInfo);
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getLatestUsingHostStackSandboxInfo() {
        ISandboxEnvInfo[] a = mo232367a();
        long j = 0;
        ISandboxEnvInfo iSandboxEnvInfo = null;
        for (ISandboxEnvInfo iSandboxEnvInfo2 : a) {
            if (iSandboxEnvInfo2.isLaunchActivityInHostStack() && iSandboxEnvInfo2.getUseTime() > j && iSandboxEnvInfo2.isUsing()) {
                j = iSandboxEnvInfo2.getUseTime();
                iSandboxEnvInfo = iSandboxEnvInfo2;
            }
        }
        return iSandboxEnvInfo;
    }

    public String toString() {
        return "AppSandBoxEnvProcessorWrapper{mPreloadedEmptyProcess=" + this.f168238f + ", sProcessLifeListenerList=" + this.f168233a + ", playingBgAudioProcessName='" + this.f168234b + '\'' + ", sKillProcessLock=" + this.f168235c + ", mInnerProcessLifeListener=" + this.f168236d + ", sandBoxHandler=" + this.f168242j + '}';
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void setPlayingBgAudioProcessName(String str) {
        this.f168234b = str;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void setProcessorPreloadCallback(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f168237e = iGetDataCallback;
    }

    /* renamed from: a */
    private String m260361a(int i) {
        return String.valueOf(i);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean hasSandboxExist(Context context) {
        return hasSandboxExist(context, RenderEngineType.WebView);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void registerHostProcessLifeListener(C66615b.AbstractC66618a aVar) {
        C66615b.m260248a().mo232244a(aVar);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void unregisterHostProcessLifeListener(C66615b.AbstractC66618a aVar) {
        C66615b.m260248a().mo232247b(aVar);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getPreloadSandboxEnvInfo(Context context) {
        return getPreloadSandboxEnvInfo(context, RenderEngineType.WebView);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getPreloadSandboxEnvInfo(RenderEngineType renderEngineType) {
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.isEmpty(iSandboxEnvInfo.getAppId())) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getSandboxInfoByIdentity(String str) {
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getProcessIdentity(), str)) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getSandboxInfoByName(String str) {
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getSandboxName(), str)) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void initSandBoxList(Context context) {
        for (ISandboxEnvInfo iSandboxEnvInfo : mo232367a()) {
            iSandboxEnvInfo.init(context);
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void release(IAppContext iAppContext) {
        if (iAppContext != null) {
            Handler handler = this.f168242j;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C67485a a = C67485a.m262488a(iAppContext);
            if (!(a == null || a.f170147a == null)) {
                a.f170147a.removeCallbacksAndMessages(null);
            }
            this.f168242j = null;
            this.f168237e = null;
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public Handler getKillSandBoxHandler(AbstractC67433a aVar) {
        C67485a a = C67485a.m262488a(aVar);
        if (a.f170147a == null) {
            synchronized (AbstractC66646b.class) {
                if (a.f170147a == null && a.f170147a == null) {
                    HandlerThread a2 = m260359a("process_manager");
                    a2.start();
                    a.f170147a = new HandlerC66650a(a2.getLooper(), aVar);
                }
            }
        }
        return a.f170147a;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public Handler getSandboxEnvHandler(AbstractC67433a aVar) {
        if (this.f168242j == null) {
            synchronized (AbstractC66646b.class) {
                if (this.f168242j == null) {
                    HandlerThread a = m260359a("process_manager");
                    a.start();
                    this.f168242j = new HandlerC66652c(a.getLooper(), aVar, this);
                }
            }
        }
        return this.f168242j;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getSandboxEnvInfoByAppId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getAppId(), str)) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isInHostStack(Class cls) {
        if (cls == null) {
            return false;
        }
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (cls == iSandboxEnvInfo.getNormalActivityClass()) {
                return false;
            }
            if (cls == iSandboxEnvInfo.getInHostStackActivityClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void killSandBoxByAppId(String str) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "killSandbox appId: ", str);
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getAppId(), str)) {
                killSandbox(applicationContext, iSandboxEnvInfo);
                return;
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void registerSandboxLifeListener(SandboxMonitor.AbstractC66610a aVar) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "registerProcessLifeListener: " + aVar);
        if (aVar != null) {
            synchronized (SandboxMonitor.class) {
                this.f168233a.add(aVar);
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void unregisterSandboxLifeListener(SandboxMonitor.AbstractC66610a aVar) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "unregisterProcessLifeListener: " + aVar);
        if (aVar != null) {
            synchronized (SandboxMonitor.class) {
                this.f168233a.remove(aVar);
            }
        }
    }

    /* renamed from: com.tt.miniapp.process.manager.b$a */
    private static class HandlerC66650a extends Handler {

        /* renamed from: a */
        private AbstractC67433a f168250a;

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (C65764a.m257802a().mo230431c()) {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "The miniapp enters the background for more than a limited time, but it is kept alive and will not be killed");
                return;
            }
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "The miniapp enters the background for more than a limited time, waiting to be killed." + this.f168250a.mo234166f());
            C67070z.m261391a(this.f168250a.getCurrentActivity(), 12, this.f168250a);
        }

        public HandlerC66650a(Looper looper, AbstractC67433a aVar) {
            super(looper);
            this.f168250a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.process.manager.b$c */
    public static class HandlerC66652c extends Handler {

        /* renamed from: a */
        private IAppContext f168255a;

        /* renamed from: b */
        private IAppSandboxEnvProcessor f168256b;

        /* renamed from: a */
        private void m260372a(C66651b bVar) {
            try {
                IAppContext iAppContext = this.f168255a;
                if (iAppContext != null && !iAppContext.isDestroyed() && !this.f168255a.isDestroying()) {
                    AbstractC67435c cVar = (AbstractC67435c) this.f168255a.findServiceByInterface(AbstractC67435c.class);
                    if (cVar != null) {
                        cVar.mo149075a();
                    } else {
                        C48936b.m192783a("serviceInitController NPE");
                    }
                }
                this.f168256b.preloadEmptySandboxEnvInternal(bVar.f168251a, bVar.f168252b, bVar.f168254d, bVar.f168253c);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess", th);
            }
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (this.f168256b.getPreloadSandboxEnvInfo(AppbrandContext.getInst().getApplicationContext()) == null) {
                    AbstractC66646b.m260363a((ISandboxEnvInfo) null, "preload", 9200, "recheck");
                }
            } else if (i == 2 || i == 3 || i == 4) {
                removeMessages(message.what);
                m260372a((C66651b) message.obj);
            } else {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "handleMessage: ERROR! msg.what = " + message.what);
            }
        }

        public HandlerC66652c(Looper looper, IAppContext iAppContext, IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
            super(looper);
            this.f168255a = iAppContext;
            this.f168256b = iAppSandboxEnvProcessor;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo232365a(ISandboxEnvInfo iSandboxEnvInfo) {
        if (!TextUtils.isEmpty(iSandboxEnvInfo.getAppId())) {
            C66007a.m258484a(iSandboxEnvInfo.getAppId());
            if (iSandboxEnvInfo.isLaunchActivityInHostStack()) {
                C66613b.m260242a();
            }
        }
    }

    /* renamed from: a */
    public void mo232366a(AbstractC67433a aVar) {
        getSandboxEnvHandler(aVar).removeMessages(1);
        getSandboxEnvHandler(aVar).sendEmptyMessageDelayed(1, 21000);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean hasSandboxExist(Context context, RenderEngineType renderEngineType) {
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (iSandboxEnvInfo != null && isSandboxEnvExistByName(iSandboxEnvInfo.getSandboxName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private ISandboxEnvInfo m260360a(Context context, RenderEngineType renderEngineType) {
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (!iSandboxEnvInfo.isUsing()) {
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    /* renamed from: c */
    private ISandboxEnvInfo m260366c(Context context, RenderEngineType renderEngineType) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getPreparePreloadProcessIndex");
        ISandboxEnvInfo a = m260360a(context, renderEngineType);
        if (a != null) {
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getPreparePreloadProcessIndex availableProcessInfo: ", a);
            return a;
        }
        ISandboxEnvInfo b = m260364b(context, renderEngineType);
        if (b == null) {
            return null;
        }
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getPreparePreloadProcessIndex killedProcessInfo: ", b);
        return b;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public ISandboxEnvInfo getPreloadSandboxEnvInfo(Context context, RenderEngineType renderEngineType) {
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getPreloadProcessInfo processInfo: ", iSandboxEnvInfo);
            if (iSandboxEnvInfo.isPreload()) {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getPreloadProcessInfo preload process exists. processInfo:", iSandboxEnvInfo);
                return iSandboxEnvInfo;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public boolean isAppSandBoxEnvExistByAppId(Context context, String str) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "isAppProcessExist: " + str);
        ISandboxEnvInfo sandboxEnvInfoByAppId = getSandboxEnvInfoByAppId(str);
        if (sandboxEnvInfoByAppId == null) {
            return false;
        }
        return isSandboxEnvExistByName(sandboxEnvInfoByAppId.getSandboxName());
    }

    /* renamed from: a */
    private void m260362a(final Context context, final ISandboxEnvInfo iSandboxEnvInfo) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "killProcessOnUIThread processInfo:", iSandboxEnvInfo);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f168235c) {
            C67866g.m264026a(new Action() {
                /* class com.tt.miniapp.process.manager.AbstractC66646b.C666493 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    AbstractC66646b.this.killSandbox(context, iSandboxEnvInfo);
                    synchronized (AbstractC66646b.this.f168235c) {
                        AbstractC66646b.this.f168235c.notifyAll();
                    }
                }
            }, C67554l.m262725b(), false);
            try {
                this.f168235c.wait();
            } catch (InterruptedException e) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "killProcessOnUIThread", e);
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "killProcessOnUIThread duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void notifyProcessorPreloadResult(Boolean bool, ErrorResult errorResult) {
        if (this.f168237e == null) {
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "notifyProcessorPreloadResult callback is null");
        } else if (bool == null) {
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "notifyProcessorPreloadResult result is null");
        } else {
            if (bool.booleanValue()) {
                this.f168237e.onSuccess(Boolean.valueOf(bool.booleanValue()));
            } else {
                if (errorResult == null) {
                    errorResult = new ErrorResult(-10000);
                }
                this.f168237e.onError(errorResult);
            }
            this.f168237e = null;
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "notifyProcessorPreloadResult result :" + bool.booleanValue() + " error result : " + errorResult);
        }
    }

    /* renamed from: b */
    private ISandboxEnvInfo m260364b(Context context, RenderEngineType renderEngineType) {
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        ISandboxEnvInfo iSandboxEnvInfo = null;
        for (ISandboxEnvInfo iSandboxEnvInfo2 : a) {
            if (!C66007a.m258494b(iSandboxEnvInfo2.getAppId()) && !TextUtils.equals(iSandboxEnvInfo2.getSandboxName(), this.f168234b)) {
                if (iSandboxEnvInfo == null) {
                    iSandboxEnvInfo = iSandboxEnvInfo2;
                }
                if (iSandboxEnvInfo2.getUseTime() < iSandboxEnvInfo.getUseTime()) {
                    iSandboxEnvInfo = iSandboxEnvInfo2;
                }
            }
        }
        if (iSandboxEnvInfo == null) {
            ISandboxEnvInfo[] a2 = mo232368a(renderEngineType);
            for (ISandboxEnvInfo iSandboxEnvInfo3 : a2) {
                if (TextUtils.equals(C66007a.m258491b(), iSandboxEnvInfo3.getAppId())) {
                    iSandboxEnvInfo = iSandboxEnvInfo3;
                }
            }
        }
        if (iSandboxEnvInfo == null) {
            ISandboxEnvInfo iSandboxEnvInfo4 = mo232368a(renderEngineType)[0];
            ISandboxEnvInfo[] a3 = mo232368a(renderEngineType);
            iSandboxEnvInfo = iSandboxEnvInfo4;
            for (ISandboxEnvInfo iSandboxEnvInfo5 : a3) {
                if (iSandboxEnvInfo5.getUseTime() < iSandboxEnvInfo.getUseTime()) {
                    iSandboxEnvInfo = iSandboxEnvInfo5;
                }
            }
        }
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "kill earliestProcess. killProcessInfo: ", iSandboxEnvInfo);
        if (C67866g.m264030a()) {
            m260362a(context, iSandboxEnvInfo);
        } else {
            killSandbox(context, iSandboxEnvInfo);
        }
        return iSandboxEnvInfo;
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void startSandboxEnvMonitor(Context context, ISandboxEnvInfo iSandboxEnvInfo, String str) {
        startSandboxEnvMonitor(context, iSandboxEnvInfo, true, str);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public synchronized void preloadEmptySandboxEnv(int i, String str, AbstractC67433a aVar) {
        preloadEmptySandboxEnv(i, str, null, 0, aVar);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void launchSnapshotCreatingSandboxEnv(int i, String str, AbstractC67433a aVar) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "launchSnapshotCreatingSandboxEnv, from: " + i + ", reason: " + str);
        C66651b bVar = new C66651b();
        bVar.f168251a = i;
        bVar.f168252b = str;
        bVar.f168253c = "SNAPSHOT_CREATING_FAKER";
        bVar.f168254d = RenderEngineType.WebView;
        Handler sandboxEnvHandler = getSandboxEnvHandler(aVar);
        Message obtainMessage = sandboxEnvHandler.obtainMessage(4, bVar);
        sandboxEnvHandler.removeMessages(4);
        sandboxEnvHandler.sendMessage(obtainMessage);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public synchronized void updateSandboxEnvInfo(String str, String str2, String str3) {
        ISandboxEnvInfo[] a = mo232367a();
        for (ISandboxEnvInfo iSandboxEnvInfo : a) {
            if (TextUtils.equals(iSandboxEnvInfo.getSandboxName(), str)) {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "isMain:" + ProcessUtil.isMainProcess(AppbrandContext.getInst().getApplicationContext()) + "sandboxEnvName:" + str + " sandboxName:" + iSandboxEnvInfo.getSandboxName());
                if (!TextUtils.equals(str2, iSandboxEnvInfo.getAppId())) {
                    AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "runningAppId not equals processInfo mAppId. processInfo:", iSandboxEnvInfo, " runningAppId: ", str2);
                }
                iSandboxEnvInfo.processRunning(str2, str3);
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public synchronized void preloadEmptySandboxEnvInternal(int i, String str, RenderEngineType renderEngineType, String str2) {
        if (renderEngineType != null) {
            mo232364a(i, str, str2, renderEngineType);
        } else {
            for (RenderEngineType renderEngineType2 : getAllRenderEngineType()) {
                mo232364a(i, str, str2, renderEngineType2);
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void startSandboxEnvMonitor(Context context, ISandboxEnvInfo iSandboxEnvInfo, boolean z, String str) {
        if (iSandboxEnvInfo != null) {
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "49411_startMiniProcessMonitor: " + iSandboxEnvInfo.getProcessIdentity() + ", autoCreate=" + z);
            if (z || isSandboxEnvExistByName(iSandboxEnvInfo.getSandboxName())) {
                iSandboxEnvInfo.getMiniProcessMontior().startMonitorMiniAppProcess(str);
                return;
            }
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "49411_startMiniProcessMonitor: MiniProcess not exist && !autoCreate " + iSandboxEnvInfo.getSandboxName());
        }
    }

    /* renamed from: a */
    public static void m260363a(ISandboxEnvInfo iSandboxEnvInfo, String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        long j = 0;
        if (iSandboxEnvInfo != null) {
            try {
                str3 = iSandboxEnvInfo.getSandboxName();
                j = System.currentTimeMillis() - iSandboxEnvInfo.getStartTime();
            } catch (Throwable th) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", th);
                return;
            }
        }
        jSONObject.put("process_type", str);
        jSONObject.put("name", str3);
        jSONObject.put("report_form", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j);
        C67509b.m262588a("mp_process_status", i, jSONObject2, jSONObject, iSandboxEnvInfo.getAppContext());
    }

    /* renamed from: a */
    public synchronized void mo232364a(int i, String str, String str2, RenderEngineType renderEngineType) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess " + renderEngineType);
        final Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (!C67489c.m262538a().isSDKSupport()) {
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "SDK UnSupport stopPreloadEmptyProcess");
            notifyProcessorPreloadResult(Boolean.FALSE, new ErrorResult(-10001));
        } else if (applicationContext == null) {
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess context is null");
            notifyProcessorPreloadResult(Boolean.FALSE, new ErrorResult(-10002));
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (getPreloadSandboxEnvInfo(applicationContext, renderEngineType) != null) {
                    AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess has preload Process");
                    notifyProcessorPreloadResult(Boolean.FALSE, new ErrorResult(-10003));
                    return;
                }
            } else if (getSandboxEnvInfoByAppId(str2) != null) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess has preload Process, appId = " + str2);
                return;
            }
            final ISandboxEnvInfo c = m260366c(applicationContext, renderEngineType);
            if (c == null) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess invalid Process");
                notifyProcessorPreloadResult(Boolean.FALSE, new ErrorResult(-10004));
                return;
            }
            C66399c.m259608a().mo231915a((Context) applicationContext, (IAppContext) c.getAppContext());
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess dest process not exists, preload it. preparePreloadProcessInfo: ", c);
            Class preloadServiceClass = c.getPreloadServiceClass();
            if (preloadServiceClass == null) {
                AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcess getServiceClassByProcessIndex fail. preparePreloadProcessInfo: ", c);
                notifyProcessorPreloadResult(Boolean.FALSE, new ErrorResult(-10005));
                return;
            }
            try {
                OPTrace a = OPTraceService.m192757a();
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "tracing process:" + c.getSandboxName() + " appId:" + c.getAppId());
                String tracingID = a.getTracingID();
                StringBuilder sb = new StringBuilder();
                sb.append("tracing :");
                sb.append(tracingID);
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", sb.toString());
                C67548h.mpAppPreloadStart(tracingID, AppbrandContext.getInst().getProcessStartTime(), m260361a(i), c.getAppContext());
                C67548h.mpProcessLoadStart(tracingID, c.getAppContext());
                Intent intent = new Intent(applicationContext, preloadServiceClass);
                c.reset();
                c.prepareStart();
                if (str2 != null) {
                    c.updateAppId(str2);
                    if (!"SNAPSHOT_CREATING_FAKER".equals(str2)) {
                        intent.putExtra("load_app_id", str2);
                    }
                }
                intent.putExtra("tracing", a.getTracingSpanImpl());
                HostDependManager.getInst().preHandleIntent(applicationContext, intent, 1, i, str);
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preload, start preload " + getSandBoxType());
                HostDependManager.getInst().startMiniAppService(applicationContext, intent);
                if (!this.f168238f) {
                    this.f168238f = true;
                    notifyProcessorPreloadResult(Boolean.TRUE, null);
                }
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.process.manager.AbstractC66646b.C666482 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        AbstractC66646b bVar = AbstractC66646b.this;
                        Context context = applicationContext;
                        ISandboxEnvInfo iSandboxEnvInfo = c;
                        bVar.startSandboxEnvMonitor(context, iSandboxEnvInfo, iSandboxEnvInfo.getAppId());
                    }
                }, C67554l.m262725b());
                if (HostDependManager.getInst().isPreloadSp()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C12791h.m52866d(applicationContext);
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preloadTmaSessionSPTimeStamp:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(5, "AppSandBoxEnvProcessorWrapper", e.getStackTrace());
            }
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void finishServiceSticky(Context context, Class cls, String str, AbstractC67433a aVar, AppInfoEntity appInfoEntity) {
        if (cls == null) {
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "finishServiceSticky serviceClass == null");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                C67548h.mpProcessLoadStart(str, aVar);
            }
            Intent intent = new Intent(context, cls);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("trace_id", str);
            }
            if (appInfoEntity != null && !TextUtils.isEmpty(appInfoEntity.appId)) {
                intent.putExtra("appId", appInfoEntity.appId);
            }
            intent.putExtra("command", "finishSticky");
            HostDependManager.getInst().startMiniAppService(context, intent);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "AppSandBoxEnvProcessorWrapper", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void preLaunchSandboxEnvById(int i, String str, RenderEngineType renderEngineType, String str2, AbstractC67433a aVar) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preLaunchSandboxEnvById, from: " + i + ", reason: " + str);
        C66651b bVar = new C66651b();
        bVar.f168251a = i;
        bVar.f168252b = str;
        bVar.f168253c = str2;
        if (str2 == null || renderEngineType != null) {
            bVar.f168254d = renderEngineType;
        } else {
            bVar.f168254d = RenderEngineType.WebView;
        }
        Handler sandboxEnvHandler = getSandboxEnvHandler(aVar);
        Message obtainMessage = sandboxEnvHandler.obtainMessage(3, bVar);
        sandboxEnvHandler.removeMessages(3);
        sandboxEnvHandler.sendMessage(obtainMessage);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public void preloadEmptySandboxEnv(int i, String str, RenderEngineType renderEngineType, int i2, AbstractC67433a aVar) {
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "preloadEmptyProcessDelay, delayTime: " + i2 + "from: " + i + ", reason: " + str);
        C66651b bVar = new C66651b();
        bVar.f168251a = i;
        bVar.f168252b = str;
        bVar.f168254d = renderEngineType;
        Handler sandboxEnvHandler = getSandboxEnvHandler(aVar);
        Message obtainMessage = sandboxEnvHandler.obtainMessage(2, bVar);
        sandboxEnvHandler.removeMessages(2);
        sandboxEnvHandler.sendMessageDelayed(obtainMessage, (long) i2);
    }

    @Override // com.tt.miniapp.process.manager.IAppSandboxEnvProcessor
    public synchronized C66643a getLaunchClass(Context context, AppInfoEntity appInfoEntity, boolean z, boolean z2, boolean z3, AbstractC67433a aVar) {
        ISandboxEnvInfo preloadSandboxEnvInfo;
        boolean z4;
        String str = appInfoEntity.appId;
        String str2 = appInfoEntity.versionType;
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass appInfo:", appInfoEntity, "isInHostStack:", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RenderEngineType renderEngineType = appInfoEntity.renderEngineType;
        if (renderEngineType == null) {
            renderEngineType = RenderEngineType.WebView;
        }
        ISandboxEnvInfo[] a = mo232368a(renderEngineType);
        int length = a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ISandboxEnvInfo iSandboxEnvInfo = a[i];
            AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass checkExist appId:", str, "processInfo.mAppId:", iSandboxEnvInfo.getAppId(), "processInfo.mVersionType:", iSandboxEnvInfo.getVersionType());
            if (!TextUtils.equals(str, iSandboxEnvInfo.getAppId())) {
                i++;
            } else if (!iSandboxEnvInfo.isUsing()) {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "isAppProcessAvailable !isUsing. processInfo: ", iSandboxEnvInfo);
            } else {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass launch app exists. processInfo: ", iSandboxEnvInfo);
                if (!appInfoEntity.shouldHotLaunch(iSandboxEnvInfo.getVersionType()) || z3) {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass forceKillProcess");
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass process is available. processInfo: ", iSandboxEnvInfo);
                    return new C66643a(iSandboxEnvInfo, z, false);
                }
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass checkExistedApp kill process. processInfo: ", iSandboxEnvInfo);
                if (iSandboxEnvInfo.isLaunchActivityInHostStack()) {
                    C66007a.m258490a(str, (String) null, false);
                }
                if (C67866g.m264030a()) {
                    m260362a(context, iSandboxEnvInfo);
                } else {
                    killSandbox(context, iSandboxEnvInfo);
                }
            }
        }
        if (!z2 || (preloadSandboxEnvInfo = getPreloadSandboxEnvInfo(context, renderEngineType)) == null) {
            ISandboxEnvInfo a2 = m260360a(context, renderEngineType);
            if (a2 != null) {
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass use availableProcessInfo: ", a2);
                a2.reuseInfo(str, str2, aVar);
                return new C66643a(a2, z);
            }
            ISandboxEnvInfo b = m260364b(context, renderEngineType);
            if (b != null) {
                b.reuseInfo(str, str2, aVar);
                AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass kill process. processInfo: ", b);
                return new C66643a(b, z);
            }
            AppBrandLogger.m52829e("AppSandBoxEnvProcessorWrapper", "getLaunchClass fail ProcessList: ", mo232368a(renderEngineType));
            return null;
        }
        AppBrandLogger.m52830i("AppSandBoxEnvProcessorWrapper", "getLaunchClass use preloadProcessInfo. processInfo: ", preloadSandboxEnvInfo);
        preloadSandboxEnvInfo.reuseInfo(str, str2, aVar);
        return new C66643a(preloadSandboxEnvInfo, z);
    }
}

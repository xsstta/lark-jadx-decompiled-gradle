package com.bytedance.ee.larkbrand;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12784c;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.OryxSpUtils;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13120g;
import com.bytedance.ee.larkbrand.p643a.p644a.C12946a;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.bytedance.ee.larkbrand.p649d.C12989b;
import com.bytedance.ee.larkbrand.p654h.C13074b;
import com.bytedance.ee.larkbrand.permission.C13288e;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.utils.C13380x;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.bytedance.ee.larkbrand.utils.DoubleCheckUtils;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.bytedance.ee.ref.C13481a;
import com.bytedance.ee.ref.gadget.C13569a;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.ee.ref.p682a.C13482a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40641h;
import com.ss.android.lark.utils.LarkContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.PerformanceService;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.IAppbrandInitializer;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3365c.C67452b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.file.log.FileLogManager;
import java.io.File;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.a */
public class C12941a {

    /* renamed from: a */
    private static volatile boolean f34488a;

    /* renamed from: a */
    public static boolean m53325a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public static void m53324a(boolean z, AbstractC67433a aVar) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            AppBrandLogger.m52830i("AppBrandHelper", " login " + z + "ismain " + ProcessUtil.isMainProcess(applicationContext) + " need request setting " + C12989b.m53447a().f34592a);
            if (ProcessUtil.isMainProcess(applicationContext) && z && C12989b.m53447a().f34592a) {
                C12989b.m53447a().f34592a = false;
                AppbrandContext.startFetchSetting(aVar);
            }
        }
    }

    /* renamed from: b */
    public static boolean m53326b() {
        boolean z = false;
        if (AppbrandContext.getInst().getApplicationContext() == null) {
            return false;
        }
        if ((AppbrandContext.getInst().getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            z = true;
        }
        if (z) {
            return true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m53328c() {
        try {
            HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
            C12784c.m52842a(Long.parseLong(hostInterface.getUserId()), hostInterface.getSession(), hostInterface.getRawDeviceId(), new C36808a.AbstractC36813d() {
                /* class com.bytedance.ee.larkbrand.C12941a.C129454 */

                @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36813d
                /* renamed from: a */
                public void mo48840a() {
                    AppBrandLogger.m52830i("AppBrandHelper", "initCipher success");
                }

                @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36813d
                /* renamed from: a */
                public void mo48841a(String str) {
                    AppBrandLogger.m52831w("AppBrandHelper", "initCipher error:" + str);
                }
            });
        } catch (NumberFormatException e) {
            AppBrandLogger.m52829e("AppBrandHelper", "initCipher error: userId cannot be parse to long", e);
        } catch (Exception e2) {
            AppBrandLogger.m52829e("AppBrandHelper", "initCipher fatal error:", e2);
        }
    }

    /* renamed from: c */
    public static boolean m53329c(String str) {
        return C12788f.m52855a(str);
    }

    /* renamed from: a */
    public static void m53321a(ExtensionWrapper extensionWrapper) {
        LarkExtensionManager.getInstance().setBrandWrapper(extensionWrapper);
    }

    /* renamed from: b */
    public static boolean m53327b(String str) {
        if (TextUtils.isEmpty(str) || str.contains(":")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static void m53330d(String str) {
        if (m53329c(str)) {
            new Handler().post($$Lambda$a$Nshg50xwxSoOfH7tBBEPKBrGJY.INSTANCE);
        }
    }

    /* renamed from: a */
    private static void m53320a(IAppContext iAppContext) {
        if (OryxManagerProxy.f35291a.initProcess(iAppContext)) {
            OryxManagerProxy.f35291a.regRenderEngine(RenderEngineManageService.getInstance());
        }
    }

    /* renamed from: a */
    public static void m53322a(HostInterface hostInterface) {
        C67452b.m262375a(new C13482a());
        HostExtensionManager.getInstance().setHostInterface(hostInterface);
    }

    /* renamed from: a */
    public static void m53323a(String str) {
        C12989b.m53447a().f34593b = str;
    }

    /* renamed from: a */
    public static String m53315a(String str, String str2) {
        String format = String.format("sslocal://microapp?app_id=%s", str);
        if (!TextUtils.isEmpty(str2)) {
            return C13380x.m54429a(format, "start_page", str2);
        }
        return format;
    }

    /* renamed from: a */
    public static void m53318a(Context context, String str, int i) {
        m53319a(context, str, i, (Map<String, Serializable>) null);
    }

    /* renamed from: a */
    private static void m53317a(Application application, IAppbrandInitializer iAppbrandInitializer, LarkHostDepend eVar, AbstractC67433a aVar) {
        String curProcessName = ProcessUtil.getCurProcessName(application);
        LarkHostDependManager.f34682b.mo49087a(eVar);
        m53320a(aVar);
        if (m53327b(curProcessName)) {
            C13288e.m54115a().mo49525a(application);
            if (TextUtils.isEmpty(C12989b.m53447a().f34593b) && LarkExtensionManager.getInstance().getExtension() != null) {
                m53323a(LarkExtensionManager.getInstance().getExtension().mo49565b());
            }
        }
        eVar.mo48919b();
        long q = eVar.mo48919b().mo149042q();
        AppBrandLogger.m52830i("AppBrandHelper", "initBrand, processName: " + curProcessName + ", processStartTime: " + q);
        AppbrandContext.init(application, iAppbrandInitializer, q, aVar);
        if (m53329c(curProcessName) || C67448a.m262353a().mo234183b()) {
            eVar.mo48919b().mo149047t();
            if (TextUtils.isEmpty(C12989b.m53447a().f34593b)) {
                Observable.create(new Action() {
                    /* class com.bytedance.ee.larkbrand.C12941a.C129432 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        CrossProcessDataEntity f = C67556a.m262949f();
                        if (f != null) {
                            C12941a.m53323a(new C66467o.C66470b(f).f167782h);
                        }
                    }
                }).schudleOn(Schedulers.longIO()).subscribeSimple();
            }
            if (!f34488a) {
                f34488a = true;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.ee.larkbrand.C12941a.C129443 */

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public void onActivityDestroyed(Activity activity) {
                    }

                    public void onActivityPaused(Activity activity) {
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    /* renamed from: a */
                    private IAppContext m53331a(Activity activity) {
                        return C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, C66375a.m259513a(activity.getIntent().getStringExtra("microapp_url")).appId));
                    }

                    public void onActivityResumed(Activity activity) {
                        if (MiniAppProcessUtils.isMicroAppActivity(activity)) {
                            C12988a.m53439a(m53331a(activity)).f34577a = "visible";
                        }
                    }

                    public void onActivityStarted(Activity activity) {
                        if (MiniAppProcessUtils.isMicroAppActivity(activity)) {
                            ((PerformanceService) AppbrandApplicationImpl.getInst(m53331a(activity)).getService(PerformanceService.class)).reportPerformance();
                        }
                    }

                    public void onActivityStopped(Activity activity) {
                        if (MiniAppProcessUtils.isMicroAppActivity(activity)) {
                            IAppContext a = m53331a(activity);
                            if (a == null) {
                                AppBrandLogger.m52830i("AppBrandHelper", activity.getClass().getName() + " releasing!");
                                return;
                            }
                            C12988a.m53439a(a).f34577a = "unVisible";
                            ((PerformanceService) AppbrandApplicationImpl.getInst(a).getService(PerformanceService.class)).cancelReportPerformance();
                        }
                    }
                });
            }
        }
        m53330d(curProcessName);
        FileLogManager.m264459a(application);
    }

    /* renamed from: a */
    public static void m53319a(Context context, String str, int i, Map<String, Serializable> map) {
        AppBrandLogger.m52830i("AppBrandHelper", "openAppBrand, url: " + str + ", scene: " + i);
        if (!DoubleCheckUtils.m54351a()) {
            AbstractC67433a i2 = C67448a.m262353a().mo234190i();
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (applicationContext == null) {
                new C67500a(C67501b.f170234b, i2).setResultTypeFail().addCategoryValue("url", str).addCategoryValue("scene", Integer.valueOf(i)).setErrorMessage("applicationContext is null").flush();
            } else if (!m53325a()) {
                OPMonitor addCategoryValue = new C67500a(C67501b.f170234b, i2).setResultTypeFail().addCategoryValue("url", str).addCategoryValue("scene", Integer.valueOf(i));
                addCategoryValue.setErrorMessage("android version too low, version: " + Build.VERSION.SDK_INT).flush();
            } else if (C13074b.m53606a(context, str)) {
                AppBrandLogger.m52830i("AppBrandHelper", "open schema with vscode:", str);
            } else {
                Uri parse = Uri.parse(str);
                if (LarkHostDependManager.f34681a.mo48919b().mo149048u().mo103470a(parse)) {
                    int indexOf = str.indexOf("?");
                    if (indexOf < 0) {
                        OPMonitor addCategoryValue2 = new C67500a(C40641h.f103079a, i2).setResultTypeFail().addCategoryValue("url", str).addCategoryValue("scene", Integer.valueOf(i));
                        addCategoryValue2.setErrorMessage("no appId, url: " + str).flush();
                        return;
                    }
                    str = C13380x.m54429a(str.replace(str.substring(0, indexOf), "sslocal://microapp"), "app_id", parse.getQueryParameter("appId"));
                    String b = C13380x.m54430b(str, "path_android");
                    if (b == null) {
                        b = C13380x.m54430b(str, "path");
                    }
                    if (b != null) {
                        str = C13380x.m54429a(str, "start_page", b);
                    }
                }
                final String a = C13380x.m54429a(str, "scene", String.valueOf(i));
                String queryParameter = parse.getQueryParameter("app_id");
                if (queryParameter == null || queryParameter.length() <= 0 || queryParameter.indexOf(File.separatorChar) < 0) {
                    if (OryxSpUtils.isOryxGrepApp(queryParameter)) {
                        OryxSpUtils.updateLastOpenOryx(LarkContext.getApplication());
                    }
                    AppBrandLogger.m52830i("AppBrandHelper", str, a, queryParameter);
                    final C67489c a2 = C67489c.m262538a();
                    if (DebugHelper.m54234c(applicationContext)) {
                        C67554l.m262725b().execute(new Runnable() {
                            /* class com.bytedance.ee.larkbrand.C12941a.RunnableC129421 */

                            public void run() {
                                for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                                    if (iAppSandboxEnvProcessor != null) {
                                        iAppSandboxEnvProcessor.killAllSandbox();
                                    }
                                }
                                a2.openAppbrand(new C67466a(a));
                            }
                        });
                        return;
                    }
                    IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(queryParameter);
                    if (e == null || !e.isAppSandBoxEnvExistByAppId(context, queryParameter)) {
                        C12946a.m53334a().mo48842a(queryParameter);
                    }
                    C67466a aVar = new C67466a(a);
                    if (map != null) {
                        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
                            aVar.mo234205a(entry.getKey(), entry.getValue());
                        }
                    }
                    a2.openAppbrand(aVar);
                    return;
                }
                OPMonitor addCategoryValue3 = new C67500a(C67501b.ae, i2).setResultTypeFail().addCategoryValue("url", str).addCategoryValue("scene", Integer.valueOf(i));
                addCategoryValue3.setErrorMessage("illegal app_id: " + queryParameter).flush();
                LKUIToast.show(context, "app_id Illegal");
            }
        }
    }

    /* renamed from: a */
    public static void m53316a(Application application, IAppbrandInitializer iAppbrandInitializer, LarkHostDepend eVar, HostInterface hostInterface, AbstractC67433a aVar) {
        if (ProcessUtil.isMainProcess(application)) {
            C67452b.m262375a(new C13482a());
            C67452b.m262375a(new C13481a());
        }
        C67452b.m262375a(new C13569a());
        HostExtensionManager.getInstance().setHostInterface(hostInterface);
        HostDependManager.getInst().setHostDepend(iAppbrandInitializer.createEssentialDepend(), iAppbrandInitializer.createOptionDepend());
        C13120g.m53718a().mo49172a(eVar.mo48919b());
        m53317a(application, iAppbrandInitializer, eVar, aVar);
    }
}

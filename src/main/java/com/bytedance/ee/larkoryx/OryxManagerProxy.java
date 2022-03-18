package com.bytedance.ee.larkoryx;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.C12920b;
import com.bytedance.ee.lark.oryxgadget.utils.OryxHostMonitorUtil;
import com.bytedance.ee.lark.oryxgadget.utils.OryxSpUtils;
import com.bytedance.ee.larkoryx.p665a.C13382b;
import com.bytedance.ee.larkoryx.p665a.C13383c;
import com.bytedance.ee.larkoryx.p666b.C13385b;
import com.bytedance.ee.larkoryx.p666b.C13386c;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0006H\u0002J\u0006\u0010(\u001a\u00020\u0006J\b\u0010)\u001a\u00020\u0006H\u0002J\u0012\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0014\u0010-\u001a\u00020.2\n\u0010/\u001a\u000600j\u0002`1H\u0002J\u0006\u00102\u001a\u00020.J\u0010\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105J\u0012\u00106\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00067"}, d2 = {"Lcom/bytedance/ee/larkoryx/OryxManagerProxy;", "Lcom/bytedance/ee/larkoryx/IOryxManager;", "()V", "TAG", "", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "mAppContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getMAppContext", "()Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "setMAppContext", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "mContext", "Landroid/app/Application;", "getMContext", "()Landroid/app/Application;", "setMContext", "(Landroid/app/Application;)V", "mHostInterface", "Lcom/bytedance/ee/ref/impl/host/HostInterface;", "getMHostInterface", "()Lcom/bytedance/ee/ref/impl/host/HostInterface;", "setMHostInterface", "(Lcom/bytedance/ee/ref/impl/host/HostInterface;)V", "oryxManager", "getOryxManager", "()Lcom/bytedance/ee/larkoryx/IOryxManager;", "setOryxManager", "(Lcom/bytedance/ee/larkoryx/IOryxManager;)V", "initProcess", "appContext", "isAppOryxEnable", "currentAppInfo", "Lcom/tt/miniapphost/entity/AppInfoEntity;", "isHostPluginValid", "isOryxFGEnable", "isOryxProcessEnable", "isOryxRenderSupport", "context", "Landroid/content/Context;", "monitorReflectException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "preloadClassAsync", "realRegRenderEngine", "service", "Lcom/tt/miniapp/render/RenderEngineManageService;", "regRenderEngine", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkoryx.a */
public final class OryxManagerProxy implements IOryxManager {

    /* renamed from: a */
    public static final OryxManagerProxy f35291a = new OryxManagerProxy();

    /* renamed from: b */
    private static volatile IOryxManager f35292b;

    /* renamed from: c */
    private static volatile boolean f35293c = true;

    /* renamed from: d */
    private static IAppContext f35294d;

    /* renamed from: e */
    private static Application f35295e;

    /* renamed from: f */
    private static HostInterface f35296f;

    private OryxManagerProxy() {
    }

    /* renamed from: a */
    public final IOryxManager mo49685a() {
        return f35292b;
    }

    /* renamed from: d */
    private final boolean m54432d() {
        boolean z;
        if (MiniAppProcessUtils.isMiniAppProcess(f35295e) || MiniAppProcessUtils.isMainProcess(f35295e)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m54433e() {
        boolean z;
        boolean a = C12920b.m53269a(f35295e);
        HostInterface hostInterface = f35296f;
        if (hostInterface != null) {
            z = hostInterface.isMiraPluginInstalled("com.bytedance.ee.lark.oryxplugin");
        } else {
            z = false;
        }
        if (!a || z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo49688c() {
        try {
            if (OryxSpUtils.isForceOpen(f35295e)) {
                return true;
            }
            boolean featureGating = HostDependManager.getInst().getFeatureGating("gadget.oryx.enable", false);
            Log.m165389i("OryxManagerProxy", "oryx enbable fg：" + featureGating);
            boolean isOryxOverMaxSpan = OryxSpUtils.isOryxOverMaxSpan(f35295e);
            Log.m165389i("OryxManagerProxy", "oryx too log：" + isOryxOverMaxSpan);
            if (!featureGating || isOryxOverMaxSpan) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.m165383e("OryxManagerProxy", "isOryxFGEnable :" + e);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo49687b() {
        boolean z;
        ClassLoader classLoader;
        HostInterface hostInterface;
        if (f35293c && f35292b == null) {
            synchronized (this) {
                if (f35293c && f35292b == null) {
                    try {
                        if (C12920b.m53269a(f35295e) && ProcessUtil.isMainProcess(f35295e)) {
                            ClassLoader classLoader2 = f35291a.getClass().getClassLoader();
                            if (classLoader2 != null) {
                                classLoader = classLoader2.getParent();
                            } else {
                                classLoader = null;
                            }
                            if (!(classLoader == null || (hostInterface = f35296f) == null)) {
                                hostInterface.installMiraClassLoader("oryx_plugin");
                            }
                        }
                        Object newInstance = Class.forName("com.bytedance.ee.lark.falconrender.keepclass.OryxManager").newInstance();
                        if (newInstance != null) {
                            f35292b = (IOryxManager) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.larkoryx.IOryxManager");
                        }
                    } catch (Exception e) {
                        HostInterface hostInterface2 = f35296f;
                        if (hostInterface2 != null) {
                            z = hostInterface2.isMiraPluginInstalled("com.bytedance.ee.lark.oryxplugin");
                        } else {
                            z = false;
                        }
                        if (C12920b.m53269a(f35295e) && z) {
                            f35291a.m54431a(e);
                        }
                        Log.m165383e("OryxManagerProxy", "reflect ex:" + z + "--" + e);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (!f35293c && f35292b != null) {
            synchronized (this) {
                if (!f35293c && f35292b != null) {
                    f35292b = null;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: a */
    private final void m54431a(Exception exc) {
        OryxHostMonitorUtil.monitorReflectOryxManagerException(f35294d, exc);
        OryxSpUtils.updateReflectOryxManagerStatus(f35295e);
    }

    @Override // com.bytedance.ee.larkoryx.IOryxManager
    public boolean isOryxRenderSupport(Context context) {
        mo49687b();
        IOryxManager iOryxManager = f35292b;
        if (iOryxManager != null) {
            return iOryxManager.isOryxRenderSupport(context);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49686a(RenderEngineManageService renderEngineManageService) {
        mo49687b();
        IOryxManager iOryxManager = f35292b;
        if (iOryxManager != null) {
            iOryxManager.regRenderEngine(renderEngineManageService);
        }
    }

    @Override // com.bytedance.ee.larkoryx.IOryxManager
    public boolean isAppOryxEnable(AppInfoEntity appInfoEntity) {
        boolean z;
        if (!mo49688c()) {
            return false;
        }
        IOryxManager iOryxManager = f35292b;
        if (iOryxManager != null) {
            z = iOryxManager.isAppOryxEnable(appInfoEntity);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.larkoryx.IOryxManager
    public void regRenderEngine(RenderEngineManageService renderEngineManageService) {
        if (f35295e != null && f35296f != null && renderEngineManageService != null && mo49688c() && m54432d() && m54433e()) {
            Log.m165389i("OryxManagerProxy", "begin reg renderengine");
            C13386c cVar = null;
            if (MiniAppProcessUtils.isMainProcess(f35295e)) {
                cVar = new C13385b();
            } else if (MiniAppProcessUtils.isMiniAppProcess(f35295e)) {
                cVar = new C13386c();
            }
            if (cVar != null) {
                cVar.mo49690a(f35294d, renderEngineManageService);
            }
        }
    }

    @Override // com.bytedance.ee.larkoryx.IOryxManager
    public boolean initProcess(IAppContext iAppContext) {
        boolean z;
        if (iAppContext == null) {
            return false;
        }
        f35294d = iAppContext;
        Application application = (Application) iAppContext.getApplicationContext();
        f35295e = application;
        if (application == null) {
            return false;
        }
        if (!mo49688c()) {
            Log.m165389i("OryxManagerProxy", "init process oryxfg not enable");
            return false;
        }
        HostExtensionManager instance = HostExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "HostExtensionManager.getInstance()");
        HostInterface hostInterface = instance.getHostInterface();
        f35296f = hostInterface;
        if (hostInterface == null) {
            Log.m165389i("OryxManagerProxy", "init miniprocess hostinterface null");
            return false;
        } else if (!m54433e()) {
            Log.m165389i("OryxManagerProxy", "plugin host not valid");
            return false;
        } else {
            C13382b bVar = null;
            if (ProcessUtil.isMiniappProcess()) {
                bVar = new C13383c();
            } else if (ProcessUtil.isMainProcess(f35295e)) {
                bVar = new C13382b();
            }
            if (bVar != null) {
                z = bVar.mo49689a(iAppContext);
            } else {
                z = false;
            }
            if (!z) {
                Log.m165389i("OryxManagerProxy", "init failure");
                return false;
            } else if (isOryxRenderSupport(f35295e)) {
                return true;
            } else {
                Log.m165389i("OryxManagerProxy", "oryx not supported");
                return false;
            }
        }
    }
}

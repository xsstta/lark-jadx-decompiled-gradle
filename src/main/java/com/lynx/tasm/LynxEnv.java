package com.lynx.tasm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import com.C1711a;
import com.lynx.C26421a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.tasm.C26904h;
import com.lynx.tasm.analytics.AbstractC26555a;
import com.lynx.tasm.analytics.C26558d;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.behavior.AbstractC26624b;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.C26662d;
import com.lynx.tasm.behavior.ui.background.AbstractC26752b;
import com.lynx.tasm.behavior.utils.C26845c;
import com.lynx.tasm.behavior.utils.C26846d;
import com.lynx.tasm.provider.AbstractC26934b;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.AbstractC26943j;
import com.lynx.tasm.provider.CanvasProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class LynxEnv {

    /* renamed from: a */
    private static volatile LynxEnv f65574a;

    /* renamed from: w */
    private static AbstractC26527a f65575w;

    /* renamed from: A */
    private WeakReference<Activity> f65576A = null;

    /* renamed from: b */
    private Application f65577b;

    /* renamed from: c */
    private AbstractC26934b f65578c;

    /* renamed from: d */
    private AbstractC26942i f65579d;

    /* renamed from: e */
    private AbstractC26943j f65580e;

    /* renamed from: f */
    private AbstractC26624b f65581f;

    /* renamed from: g */
    private volatile boolean f65582g;

    /* renamed from: h */
    private boolean f65583h;

    /* renamed from: i */
    private boolean f65584i;

    /* renamed from: j */
    private boolean f65585j = true;

    /* renamed from: k */
    private boolean f65586k = true;

    /* renamed from: l */
    private boolean f65587l = true;

    /* renamed from: m */
    private boolean f65588m = true;

    /* renamed from: n */
    private volatile boolean f65589n;

    /* renamed from: o */
    private LynxModuleManager f65590o;

    /* renamed from: p */
    private List<C26622a> f65591p;

    /* renamed from: q */
    private final C26931o f65592q = new C26931o();

    /* renamed from: r */
    private AbstractC26861c f65593r;

    /* renamed from: s */
    private AbstractC26752b f65594s = null;

    /* renamed from: t */
    private CanvasProvider f65595t = null;

    /* renamed from: u */
    private InputMethodManager f65596u = null;

    /* renamed from: v */
    private boolean f65597v = true;

    /* renamed from: x */
    private volatile boolean f65598x = false;

    /* renamed from: y */
    private AbstractC26887e f65599y = null;

    /* renamed from: z */
    private SharedPreferences f65600z;

    /* renamed from: com.lynx.tasm.LynxEnv$a */
    public interface AbstractC26527a {
        /* renamed from: a */
        void mo94124a();
    }

    /* renamed from: c */
    public void mo94095c() {
    }

    public native boolean nativeGetEnv(String str, boolean z);

    public native void nativeSetEnv(String str, boolean z);

    /* renamed from: s */
    public String mo94114s() {
        return "1.6.3-rc.0.18-bugfix";
    }

    static {
        C26845c.m97613a();
    }

    /* renamed from: g */
    public AbstractC26934b mo94100g() {
        return this.f65578c;
    }

    /* renamed from: h */
    public AbstractC26942i mo94101h() {
        return this.f65579d;
    }

    /* renamed from: i */
    public AbstractC26943j mo94102i() {
        return this.f65580e;
    }

    /* renamed from: j */
    public AbstractC26624b mo94103j() {
        return this.f65581f;
    }

    /* renamed from: k */
    public boolean mo94104k() {
        return this.f65583h;
    }

    /* renamed from: o */
    public Context mo94110o() {
        return this.f65577b;
    }

    /* renamed from: p */
    public AbstractC26861c mo94111p() {
        return this.f65593r;
    }

    /* renamed from: r */
    public AbstractC26752b mo94113r() {
        return this.f65594s;
    }

    /* renamed from: t */
    public C26931o mo94115t() {
        return this.f65592q;
    }

    /* renamed from: u */
    public boolean mo94116u() {
        return this.f65597v;
    }

    /* renamed from: a */
    public void mo94090a(String str, boolean z) {
        if (mo94107n()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("setDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z));
            } catch (Exception e) {
                LLog.m96429e("LynxEnv", "setDevtoolEnv failed: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo94091a(boolean z) {
        LLog.m96425c("LynxEnv", z ? "enable lynx debug" : "disable lynx debug");
        this.f65583h = z;
        if (z && this.f65577b != null) {
            m96125w();
        }
    }

    /* renamed from: a */
    public CanvasProvider mo94081a() {
        return this.f65595t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized List<C26622a> mo94099f() {
        return this.f65591p;
    }

    /* renamed from: d */
    public LynxModuleManager mo94097d() {
        if (this.f65590o == null) {
            this.f65590o = new LynxModuleManager(this.f65577b);
        }
        return this.f65590o;
    }

    /* renamed from: e */
    public static LynxEnv m96123e() {
        if (f65574a == null) {
            synchronized (LynxEnv.class) {
                if (f65574a == null) {
                    f65574a = new LynxEnv();
                }
            }
        }
        return f65574a;
    }

    /* renamed from: l */
    public boolean mo94105l() {
        SharedPreferences sharedPreferences = this.f65600z;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_devtool", this.f65584i);
        }
        LLog.m96429e("LynxEnv", "isDevtoolEnabled() must be called after init()");
        return false;
    }

    /* renamed from: m */
    public boolean mo94106m() {
        SharedPreferences sharedPreferences = this.f65600z;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_redbox", this.f65585j);
        }
        LLog.m96429e("LynxEnv", "isRedBoxEnabled() must be called after init()");
        return false;
    }

    /* renamed from: n */
    public boolean mo94107n() {
        mo94092b();
        if (!this.f65589n) {
            C26558d.m96284a("lynx_rapid_render_error", "lynx_exception", "lazyInitIfNeeded failed!");
        }
        return this.f65589n;
    }

    /* renamed from: q */
    public InputMethodManager mo94112q() {
        if (this.f65596u == null) {
            this.f65596u = (InputMethodManager) this.f65577b.getSystemService("input_method");
        }
        return this.f65596u;
    }

    private LynxEnv() {
    }

    /* renamed from: v */
    private void m96124v() {
        ArrayList arrayList = new ArrayList();
        this.f65591p = arrayList;
        arrayList.addAll(new C26662d().mo53784a());
        if (m96123e().mo94103j() != null) {
            this.f65591p.addAll(m96123e().mo94103j().mo53784a());
        }
    }

    /* renamed from: b */
    public synchronized void mo94092b() {
        if (!this.f65582g) {
            if (!this.f65598x) {
                C26904h.AbstractC26905a a = C26904h.m97753a();
                if (a != null) {
                    this.f65598x = true;
                    a.mo95710a();
                    return;
                }
                if (f65575w != null) {
                    this.f65598x = true;
                    f65575w.mo94124a();
                }
            }
        }
    }

    /* renamed from: w */
    private void m96125w() {
        if (mo94107n()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("init", Context.class).invoke(invoke, this.f65577b);
            } catch (Exception e) {
                LLog.m96429e("LynxEnv", "initDevtoolEnv failed: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m96122a(AbstractC26555a aVar) {
        C26558d.m96280a(aVar);
    }

    /* renamed from: d */
    public void mo94098d(boolean z) {
        this.f65597v = z;
    }

    /* renamed from: a */
    public void mo94082a(Activity activity) {
        if (activity == null) {
            this.f65576A = null;
        } else {
            this.f65576A = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public void mo94084a(AbstractC26752b bVar) {
        this.f65594s = bVar;
    }

    /* renamed from: b */
    public void mo94093b(boolean z) {
        String str;
        if (z) {
            str = "Turn on devtool";
        } else {
            str = "Turn off devtool";
        }
        LLog.m96425c("LynxEnv", str);
        this.f65584i = z;
        if (z) {
            LLog.m96414a(2);
        } else {
            LLog.m96414a(4);
        }
        mo94090a("enable_devtool", z);
    }

    /* renamed from: c */
    public void mo94096c(boolean z) {
        String str;
        if (z) {
            str = "Turn on redbox";
        } else {
            str = "Turn off redbox";
        }
        LLog.m96425c("LynxEnv", str);
        this.f65585j = z;
        mo94090a("enable_redbox", z);
    }

    /* renamed from: a */
    public void mo94086a(CanvasProvider canvasProvider) {
        this.f65595t = canvasProvider;
    }

    /* renamed from: a */
    public void mo94085a(AbstractC26887e eVar) {
        if (!this.f65589n) {
            if (eVar != null) {
                try {
                    eVar.loadLibrary("lynx");
                    this.f65599y = eVar;
                } catch (UnsatisfiedLinkError e) {
                    if (eVar == null) {
                        LLog.m96429e("LynxEnv", "Native Lynx Library load from system with error message " + e.getMessage());
                    } else {
                        LLog.m96429e("LynxEnv", "Native Lynx Library load from " + eVar.getClass().getName() + " with error message " + e.getMessage());
                    }
                    this.f65589n = false;
                    return;
                }
            } else {
                C1711a.m7628a("lynx");
            }
            this.f65589n = true;
            LLog.m96413a();
            LLog.m96425c("LynxEnv", "Native Lynx Library load success ");
        }
    }

    /* renamed from: a */
    public void mo94087a(AbstractC26942i iVar) {
        this.f65579d = iVar;
    }

    /* renamed from: b */
    public boolean mo94094b(String str, boolean z) {
        if (!mo94107n()) {
            return z;
        }
        try {
            Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
            Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            return ((Boolean) cls.getMethod("getDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            LLog.m96429e("LynxEnv", "getDevtoolEnv failed: " + e.toString());
            return z;
        }
    }

    /* renamed from: a */
    public void mo94088a(String str, Class<? extends LynxModule> cls) {
        mo94089a(str, cls, null);
    }

    /* renamed from: a */
    public void mo94089a(String str, Class<? extends LynxModule> cls, Object obj) {
        if (this.f65590o == null) {
            this.f65590o = new LynxModuleManager(this.f65577b);
        }
        this.f65590o.mo93959a(str, cls, obj);
    }

    /* renamed from: a */
    public synchronized void mo94083a(Application application, AbstractC26887e eVar, AbstractC26934b bVar, AbstractC26624b bVar2, AbstractC26861c cVar) {
        if (this.f65582g) {
            LLog.m96427d("LynxEnv", "LynxEnv is already initialized");
            return;
        }
        LLog.m96425c("LynxEnv", "LynxEnv start init");
        this.f65582g = true;
        if (C26421a.f65260b.booleanValue()) {
            if (C26421a.f65261c.booleanValue()) {
                try {
                    Log.d("lynx", "open systrace for app");
                    Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            } else {
                TraceController.m96434a().mo94494a(application);
                TraceController.m96434a().mo94496b();
            }
        }
        C26846d.m97614a();
        this.f65577b = application;
        this.f65600z = application.getSharedPreferences("lynx_env_config", 0);
        this.f65581f = bVar2;
        this.f65578c = bVar;
        this.f65593r = cVar;
        m96124v();
        C26596b.m96401a(this.f65591p);
        LynxModuleManager lynxModuleManager = new LynxModuleManager(application);
        this.f65590o = lynxModuleManager;
        lynxModuleManager.mo93959a("NetworkingModule", NetworkingModule.class, null);
        mo94085a(eVar);
        if (mo94104k()) {
            m96125w();
        }
        if (this.f65577b.getBaseContext() instanceof Activity) {
            this.f65576A = new WeakReference<>((Activity) this.f65577b.getBaseContext());
        }
        this.f65577b.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.lynx.tasm.LynxEnv.C265261 */

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
                LynxEnv.this.mo94082a((Activity) null);
            }

            public void onActivityResumed(Activity activity) {
                LynxEnv.this.mo94082a(activity);
            }
        });
    }
}

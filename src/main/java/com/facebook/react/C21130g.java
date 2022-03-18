package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.facebook.infer.annotation.C21045a;
import com.facebook.p946a.p949b.C20987c;
import com.facebook.p946a.p950c.C20988a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.AbstractC21126d;
import com.facebook.react.devsupport.C21119a;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.p961a.AbstractC21120a;
import com.facebook.react.devsupport.p961a.AbstractC21121b;
import com.facebook.react.devsupport.p961a.AbstractC21122c;
import com.facebook.react.modules.core.AbstractC21181b;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.p962a.AbstractC21189a;
import com.facebook.react.p956a.C21054a;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C21273a;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.react.g */
public class C21130g {

    /* renamed from: h */
    private static final String f51516h = "g";

    /* renamed from: a */
    public C21141a f51517a;

    /* renamed from: b */
    public volatile Thread f51518b;

    /* renamed from: c */
    public final AbstractC21121b f51519c;

    /* renamed from: d */
    public Activity f51520d;

    /* renamed from: e */
    public volatile boolean f51521e = false;

    /* renamed from: f */
    public volatile Boolean f51522f = false;

    /* renamed from: g */
    public final NativeModuleCallExceptionHandler f51523g;

    /* renamed from: i */
    private final Set f51524i = Collections.synchronizedSet(new HashSet());

    /* renamed from: j */
    private volatile LifecycleState f51525j;

    /* renamed from: k */
    private final JavaScriptExecutorFactory f51526k;

    /* renamed from: l */
    private final JSBundleLoader f51527l;

    /* renamed from: m */
    private final String f51528m;

    /* renamed from: n */
    private final List<AbstractC21146k> f51529n;

    /* renamed from: o */
    private final boolean f51530o;

    /* renamed from: p */
    private final NotThreadSafeBridgeIdleDebugListener f51531p;

    /* renamed from: q */
    private final Object f51532q = new Object();

    /* renamed from: r */
    private volatile ReactContext f51533r;

    /* renamed from: s */
    private final Context f51534s;

    /* renamed from: t */
    private AbstractC21181b f51535t;

    /* renamed from: u */
    private final Collection<AbstractC21142b> f51536u = Collections.synchronizedList(new ArrayList());

    /* renamed from: v */
    private final ComponentCallbacks2C21112d f51537v;

    /* renamed from: w */
    private final JSIModulePackage f51538w;

    /* renamed from: com.facebook.react.g$b */
    public interface AbstractC21142b {
        /* renamed from: a */
        void mo47823a(ReactContext reactContext);
    }

    /* renamed from: a */
    public static Thread m76808a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.g$a */
    public class C21141a {

        /* renamed from: b */
        private final JavaScriptExecutorFactory f51556b;

        /* renamed from: c */
        private final JSBundleLoader f51557c;

        /* renamed from: a */
        public JavaScriptExecutorFactory mo71842a() {
            return this.f51556b;
        }

        /* renamed from: b */
        public JSBundleLoader mo71843b() {
            return this.f51557c;
        }

        public C21141a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f51556b = (JavaScriptExecutorFactory) C21045a.m76676a(javaScriptExecutorFactory);
            this.f51557c = (JSBundleLoader) C21045a.m76676a(jSBundleLoader);
        }
    }

    /* renamed from: b */
    public AbstractC21121b mo71825b() {
        return this.f51519c;
    }

    /* renamed from: e */
    public boolean mo71828e() {
        return this.f51521e;
    }

    /* renamed from: a */
    public void mo71824a(AbstractC21142b bVar) {
        this.f51536u.add(bVar);
    }

    /* renamed from: a */
    public void mo71823a(final C21141a aVar) {
        Log.d("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f51524i) {
            synchronized (this.f51532q) {
                if (this.f51533r != null) {
                    m76811a(this.f51533r);
                    this.f51533r = null;
                }
            }
        }
        this.f51518b = m76808a(new Thread(null, new Runnable() {
            /* class com.facebook.react.C21130g.RunnableC211355 */

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
            /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:16:0x000a, LOOP_START, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 104
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C21130g.RunnableC211355.run():void");
            }
        }, "create_react_context"));
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f51518b.start();
    }

    /* renamed from: a */
    public void mo71822a(final ReactApplicationContext reactApplicationContext) {
        Log.d("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Systrace.m77079a(0, "setupReactContext");
        synchronized (this.f51524i) {
            synchronized (this.f51532q) {
                this.f51533r = (ReactContext) C21045a.m76676a(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) C21045a.m76676a(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.f51519c.mo71797a(reactApplicationContext);
            this.f51537v.mo71768a(catalystInstance);
            m76817m();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        final AbstractC21142b[] bVarArr = (AbstractC21142b[]) this.f51536u.toArray(new AbstractC21142b[this.f51536u.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.C21130g.RunnableC211386 */

            public void run() {
                for (AbstractC21142b bVar : bVarArr) {
                    bVar.mo47823a(reactApplicationContext);
                }
            }
        });
        Systrace.m77083b(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new Runnable() {
            /* class com.facebook.react.C21130g.RunnableC211397 */

            public void run() {
                Process.setThreadPriority(0);
                ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() {
            /* class com.facebook.react.C21130g.RunnableC211408 */

            public void run() {
                Process.setThreadPriority(0);
            }
        });
    }

    /* renamed from: a */
    public static C21143h m76807a() {
        return new C21143h();
    }

    /* renamed from: j */
    private AbstractC21126d m76814j() {
        return new AbstractC21126d() {
            /* class com.facebook.react.C21130g.C211322 */
        };
    }

    /* renamed from: m */
    private synchronized void m76817m() {
        if (this.f51525j == LifecycleState.RESUMED) {
            m76813a(true);
        }
    }

    /* renamed from: f */
    public void mo71829f() {
        UiThreadUtil.assertOnUiThread();
        AbstractC21181b bVar = this.f51535t;
        if (bVar != null) {
            bVar.mo71833a();
        }
    }

    /* renamed from: h */
    public void mo71831h() {
        UiThreadUtil.assertOnUiThread();
        this.f51519c.mo71801b();
    }

    /* renamed from: i */
    public ReactContext mo71832i() {
        ReactContext reactContext;
        synchronized (this.f51532q) {
            reactContext = this.f51533r;
        }
        return reactContext;
    }

    /* renamed from: c */
    public void mo71826c() {
        Log.d("ReactNative", "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (!this.f51521e) {
            this.f51521e = true;
            m76815k();
        }
    }

    /* renamed from: d */
    public void mo71827d() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        C20987c.m76482a().mo71082a(C20988a.f51369c, "RNCore: load from BundleLoader");
        m76810a(this.f51526k, this.f51527l);
    }

    /* renamed from: l */
    private synchronized void m76816l() {
        ReactContext i = mo71832i();
        if (i != null) {
            if (this.f51525j == LifecycleState.RESUMED) {
                i.onHostPause();
                this.f51525j = LifecycleState.BEFORE_RESUME;
            }
            if (this.f51525j == LifecycleState.BEFORE_RESUME) {
                i.onHostDestroy();
            }
        }
        this.f51525j = LifecycleState.BEFORE_CREATE;
    }

    /* renamed from: k */
    private void m76815k() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        C20987c.m76482a().mo71082a(C20988a.f51369c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f51530o && this.f51528m != null) {
            final AbstractC21189a g = this.f51519c.mo71812g();
            if (!Systrace.m77082a(0)) {
                if (this.f51527l == null) {
                    this.f51519c.mo71813h();
                    return;
                } else {
                    this.f51519c.mo71798a(new AbstractC21122c() {
                        /* class com.facebook.react.C21130g.C211333 */
                    });
                    return;
                }
            }
        }
        mo71827d();
    }

    /* renamed from: g */
    public void mo71830g() {
        UiThreadUtil.assertOnUiThread();
        C20987c.m76482a().mo71082a(C20988a.f51369c, "RNCore: Destroy");
        this.f51522f = true;
        if (this.f51530o) {
            this.f51519c.mo71800a(false);
            this.f51519c.mo71807d();
        }
        m76816l();
        if (this.f51518b != null) {
            this.f51518b = null;
        }
        this.f51537v.mo71767a(this.f51534s);
        synchronized (this.f51532q) {
            if (this.f51533r != null) {
                this.f51533r.destroy();
                this.f51533r = null;
            }
        }
        this.f51521e = false;
        this.f51520d = null;
        this.f51522f = false;
        synchronized (this.f51522f) {
            this.f51522f.notifyAll();
        }
    }

    /* renamed from: a */
    private static void m76809a(Context context) {
        SoLoader.init(context, false);
    }

    /* renamed from: a */
    private void m76811a(ReactContext reactContext) {
        Log.d("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f51525j == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        reactContext.destroy();
        this.f51519c.mo71802b(reactContext);
        this.f51537v.mo71769b(reactContext.getCatalystInstance());
    }

    /* renamed from: a */
    private synchronized void m76813a(boolean z) {
        ReactContext i = mo71832i();
        if (i != null && (z || this.f51525j == LifecycleState.BEFORE_RESUME || this.f51525j == LifecycleState.BEFORE_CREATE)) {
            i.onHostResume(this.f51520d);
        }
        this.f51525j = LifecycleState.RESUMED;
    }

    /* renamed from: a */
    public void mo71821a(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f51520d = activity;
        if (this.f51530o) {
            final View decorView = activity.getWindow().getDecorView();
            if (!ViewCompat.m4015I(decorView)) {
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.facebook.react.C21130g.View$OnAttachStateChangeListenerC211344 */

                    public void onViewDetachedFromWindow(View view) {
                    }

                    public void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        C21130g.this.f51519c.mo71800a(true);
                    }
                });
            } else {
                this.f51519c.mo71800a(true);
            }
        }
        m76813a(false);
    }

    /* renamed from: a */
    private void m76810a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        C21141a aVar = new C21141a(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f51518b == null) {
            mo71823a(aVar);
        } else {
            this.f51517a = aVar;
        }
    }

    /* renamed from: a */
    private void m76812a(AbstractC21146k kVar, C21128e eVar) {
        C21273a.m77086a(0, "processPackage").mo72176a("className", kVar.getClass().getSimpleName()).mo72177a();
        boolean z = kVar instanceof AbstractC21150m;
        if (z) {
            ((AbstractC21150m) kVar).mo71408b();
        }
        eVar.mo71818a(kVar);
        if (z) {
            ((AbstractC21150m) kVar).mo71409c();
        }
        C21273a.m77085a(0).mo72177a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public ReactApplicationContext mo71820a(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f51534s);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f51523g;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f51519c;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(m76806a(reactApplicationContext, this.f51529n, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        Systrace.m77079a(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            Systrace.m77083b(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            JSIModulePackage jSIModulePackage = this.f51538w;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
                if (C21054a.f51464a) {
                    build.setTurboModuleManager(build.getJSIModule(JSIModuleType.TurboModuleManager));
                }
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f51531p;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (Systrace.m77082a(0)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            Systrace.m77079a(0, "runJSBundle");
            build.runJSBundle();
            Systrace.m77083b(0);
            return reactApplicationContext;
        } catch (Throwable th) {
            Systrace.m77083b(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* renamed from: a */
    private NativeModuleRegistry m76806a(ReactApplicationContext reactApplicationContext, List<AbstractC21146k> list, boolean z) {
        C21128e eVar = new C21128e(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f51529n) {
            for (AbstractC21146k kVar : list) {
                if (!z || !this.f51529n.contains(kVar)) {
                    Systrace.m77079a(0, "createAndProcessCustomReactPackage");
                    if (z) {
                        try {
                            this.f51529n.add(kVar);
                        } catch (Throwable th) {
                            Systrace.m77083b(0);
                            throw th;
                        }
                    }
                    m76812a(kVar, eVar);
                    Systrace.m77083b(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        Systrace.m77079a(0, "buildNativeModuleRegistry");
        try {
            return eVar.mo71817a();
        } finally {
            Systrace.m77083b(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    C21130g(Context context, Activity activity, AbstractC21181b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<AbstractC21146k> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, RedBoxHandler redBoxHandler, boolean z2, AbstractC21120a aVar, int i, int i2, JSIModulePackage jSIModulePackage, Map<String, Object> map) {
        Log.d("ReactNative", "ReactInstanceManager.ctor()");
        m76809a(context);
        this.f51534s = context;
        this.f51520d = activity;
        this.f51535t = bVar;
        this.f51526k = javaScriptExecutorFactory;
        this.f51527l = jSBundleLoader;
        this.f51528m = str;
        ArrayList arrayList = new ArrayList();
        this.f51529n = arrayList;
        this.f51530o = z;
        Systrace.m77079a(0, "ReactInstanceManager.initDevSupportManager");
        AbstractC21121b a = C21119a.m76756a(context, m76814j(), str, z, redBoxHandler, aVar, i, map);
        this.f51519c = a;
        Systrace.m77083b(0);
        this.f51531p = notThreadSafeBridgeIdleDebugListener;
        this.f51525j = lifecycleState;
        this.f51537v = new ComponentCallbacks2C21112d(context);
        this.f51523g = nativeModuleCallExceptionHandler;
        synchronized (arrayList) {
            C20987c.m76482a().mo71082a(C20988a.f51369c, "RNCore: Use Split Packages");
            arrayList.add(new C21052a(this, new AbstractC21181b() {
                /* class com.facebook.react.C21130g.C211311 */

                @Override // com.facebook.react.modules.core.AbstractC21181b
                /* renamed from: a */
                public void mo71833a() {
                    C21130g.this.mo71829f();
                }
            }, z2, i2));
            if (z) {
                arrayList.add(new C21055b());
            }
            arrayList.addAll(list);
        }
        this.f51538w = jSIModulePackage;
        ReactChoreographer.m76892a();
        if (z) {
            a.mo71805c();
        }
    }
}

package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.p961a.AbstractC21120a;
import com.facebook.react.modules.core.AbstractC21181b;
import com.facebook.react.modules.systeminfo.C21253a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.h */
public class C21143h {

    /* renamed from: a */
    private final List<AbstractC21146k> f51558a = new ArrayList();

    /* renamed from: b */
    private String f51559b;

    /* renamed from: c */
    private JSBundleLoader f51560c;

    /* renamed from: d */
    private String f51561d;

    /* renamed from: e */
    private NotThreadSafeBridgeIdleDebugListener f51562e;

    /* renamed from: f */
    private Application f51563f;

    /* renamed from: g */
    private boolean f51564g;

    /* renamed from: h */
    private LifecycleState f51565h;

    /* renamed from: i */
    private NativeModuleCallExceptionHandler f51566i;

    /* renamed from: j */
    private Activity f51567j;

    /* renamed from: k */
    private AbstractC21181b f51568k;

    /* renamed from: l */
    private RedBoxHandler f51569l;

    /* renamed from: m */
    private boolean f51570m;

    /* renamed from: n */
    private AbstractC21120a f51571n;

    /* renamed from: o */
    private JavaScriptExecutorFactory f51572o;

    /* renamed from: p */
    private int f51573p = 1;

    /* renamed from: q */
    private int f51574q = -1;

    /* renamed from: r */
    private JSIModulePackage f51575r;

    /* renamed from: s */
    private Map<String, Object> f51576s;

    /* renamed from: a */
    private JavaScriptExecutorFactory m76835a(String str, String str2) {
        return null;
    }

    /* renamed from: a */
    public C21143h mo71854a(boolean z) {
        this.f51564g = z;
        return this;
    }

    C21143h() {
    }

    /* renamed from: a */
    public C21130g mo71844a() {
        boolean z;
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        String str;
        C21045a.m76677a(this.f51563f, "Application property has not been set with this builder");
        if (this.f51565h == LifecycleState.RESUMED) {
            C21045a.m76677a(this.f51567j, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z2 = true;
        if (!this.f51564g && this.f51559b == null && this.f51560c == null) {
            z = false;
        } else {
            z = true;
        }
        C21045a.m76679a(z, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f51561d == null && this.f51559b == null && this.f51560c == null) {
            z2 = false;
        }
        C21045a.m76679a(z2, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f51563f.getPackageName();
        String a = C21253a.m77050a();
        Application application = this.f51563f;
        Activity activity = this.f51567j;
        AbstractC21181b bVar = this.f51568k;
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = this.f51572o;
        if (javaScriptExecutorFactory2 == null) {
            javaScriptExecutorFactory = m76835a(packageName, a);
        } else {
            javaScriptExecutorFactory = javaScriptExecutorFactory2;
        }
        JSBundleLoader jSBundleLoader = this.f51560c;
        if (jSBundleLoader == null && (str = this.f51559b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f51563f, str, false);
        }
        return new C21130g(application, activity, bVar, javaScriptExecutorFactory, jSBundleLoader, this.f51561d, this.f51558a, this.f51564g, this.f51562e, (LifecycleState) C21045a.m76677a(this.f51565h, "Initial lifecycle state was not set"), this.f51566i, this.f51569l, this.f51570m, this.f51571n, this.f51573p, this.f51574q, this.f51575r, this.f51576s);
    }

    /* renamed from: c */
    public C21143h mo71856c(String str) {
        this.f51561d = str;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71845a(Application application) {
        this.f51563f = application;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71846a(JSBundleLoader jSBundleLoader) {
        this.f51560c = jSBundleLoader;
        this.f51559b = null;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71847a(JSIModulePackage jSIModulePackage) {
        this.f51575r = jSIModulePackage;
        return this;
    }

    /* renamed from: b */
    public C21143h mo71855b(String str) {
        if (!str.startsWith("assets://")) {
            return mo71846a(JSBundleLoader.createFileLoader(str));
        }
        this.f51559b = str;
        this.f51560c = null;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71848a(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f51572o = javaScriptExecutorFactory;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71849a(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.f51566i = nativeModuleCallExceptionHandler;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71850a(LifecycleState lifecycleState) {
        this.f51565h = lifecycleState;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71851a(RedBoxHandler redBoxHandler) {
        this.f51569l = redBoxHandler;
        return this;
    }

    /* renamed from: a */
    public C21143h mo71852a(AbstractC21146k kVar) {
        this.f51558a.add(kVar);
        return this;
    }

    /* renamed from: a */
    public C21143h mo71853a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f51559b = str2;
        this.f51560c = null;
        return this;
    }
}

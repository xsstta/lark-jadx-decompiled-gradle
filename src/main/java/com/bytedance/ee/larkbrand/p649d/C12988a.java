package com.bytedance.ee.larkbrand.p649d;

import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p643a.p645b.C12955e;
import com.bytedance.ee.larkbrand.p650e.C13042x;
import com.bytedance.ee.larkbrand.p651f.p652a.C13051a;
import com.bytedance.ee.larkbrand.p651f.p652a.C13055b;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24737a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.C24777a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.DebugUtil;

/* renamed from: com.bytedance.ee.larkbrand.d.a */
public class C12988a extends AbstractC67457c {

    /* renamed from: a */
    public String f34577a = "visible";

    /* renamed from: b */
    private C13051a f34578b;

    /* renamed from: c */
    private final Object f34579c = new Object();

    /* renamed from: e */
    private C13055b f34580e;

    /* renamed from: f */
    private final Object f34581f = new Object();

    /* renamed from: g */
    private C13042x f34582g;

    /* renamed from: h */
    private final Object f34583h = new Object();

    /* renamed from: i */
    private C24737a f34584i;

    /* renamed from: j */
    private final Object f34585j = new Object();

    /* renamed from: k */
    private C24777a f34586k;

    /* renamed from: l */
    private final Object f34587l = new Object();

    /* renamed from: m */
    private BeaconManager f34588m;

    /* renamed from: n */
    private final Object f34589n = new Object();

    /* renamed from: o */
    private C12955e f34590o;

    /* renamed from: p */
    private final Object f34591p = new Object();

    /* renamed from: a */
    public C13051a mo48905a() {
        if (this.f34578b == null) {
            synchronized (this.f34579c) {
                if (this.f34578b == null) {
                    this.f34578b = new C13051a(this.f170082d);
                }
            }
        }
        return this.f34578b;
    }

    /* renamed from: b */
    public C13055b mo48906b() {
        if (this.f34580e == null) {
            synchronized (this.f34581f) {
                if (this.f34580e == null) {
                    this.f34580e = new C13055b(this.f170082d);
                }
            }
        }
        return this.f34580e;
    }

    /* renamed from: c */
    public C13042x mo48907c() {
        if (this.f34582g == null) {
            synchronized (this.f34583h) {
                if (this.f34582g == null) {
                    this.f34582g = new C13042x(this.f170082d);
                }
            }
        }
        return this.f34582g;
    }

    /* renamed from: d */
    public C12955e mo48908d() {
        if (this.f34590o == null) {
            synchronized (this.f34591p) {
                if (this.f34590o == null) {
                    this.f34590o = new C12955e(this.f170082d);
                }
            }
        }
        return this.f34590o;
    }

    /* renamed from: e */
    public C24737a mo48909e() {
        if (this.f34584i == null) {
            synchronized (this.f34585j) {
                if (this.f34584i == null) {
                    this.f34584i = new C24737a(this.f170082d);
                }
            }
        }
        return this.f34584i;
    }

    /* renamed from: f */
    public C24777a mo48910f() {
        if (this.f34586k == null) {
            synchronized (this.f34587l) {
                if (this.f34586k == null) {
                    this.f34586k = new C24777a();
                }
            }
        }
        return this.f34586k;
    }

    /* renamed from: g */
    public BeaconManager mo48911g() {
        if (this.f34588m == null) {
            synchronized (this.f34589n) {
                if (this.f34588m == null) {
                    this.f34588m = new BeaconManager(this.f170082d);
                }
            }
        }
        return this.f34588m;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        this.f34580e = null;
        this.f34578b = null;
        C24737a aVar = this.f34584i;
        if (aVar != null) {
            aVar.mo87744g();
        }
        C24777a aVar2 = this.f34586k;
        if (aVar2 != null) {
            aVar2.mo87824a();
        }
    }

    /* renamed from: a */
    public static C12988a m53439a(IAppContext iAppContext) {
        if (iAppContext == null) {
            AppBrandLogger.m52829e("LarkAppSingletonInstanc", "appContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            iAppContext = C67448a.m262353a().mo234192k();
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "LarkAppSingletonInstance.getInstance").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
            if (DebugUtil.debug()) {
                throw new IllegalStateException("appContext is null");
            }
        }
        if (iAppContext == null) {
            iAppContext = C67448a.m262353a().mo234190i();
            AppBrandLogger.m52829e("LarkAppSingletonInstanc", "getRunningAppContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "LarkAppSingletonInstance.getInstance getRunningAppContext is null").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
        }
        if (iAppContext == null) {
            AppBrandLogger.m52829e("LarkAppSingletonInstanc", "findValidMicroAppContext is null, stack:" + Log.getStackTraceString(new Throwable()));
            new C67500a(C67501b.az, iAppContext).addCategoryValue("appContextErrorPosition", "LarkAppSingletonInstance.getInstance findValidMicroAppContext is null").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
            return null;
        }
        C12988a aVar = (C12988a) iAppContext.findServiceByInterface(C12988a.class);
        if (aVar != null) {
            return aVar;
        }
        AppBrandLogger.m52830i("LarkAppSingletonInstanc", "larkAppSingletonInstance is null, AppType:" + iAppContext.getAppType());
        C12988a aVar2 = new C12988a();
        iAppContext.registerService(C12988a.class, aVar2);
        return aVar2;
    }
}

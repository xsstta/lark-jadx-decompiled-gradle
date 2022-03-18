package com.ss.android.lark.browser.biz.messenger.jsapi.location;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.permission.C51323b;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.location.a */
public class C29853a {

    /* renamed from: a */
    boolean f74582a;

    /* renamed from: b */
    private Activity f74583b;

    /* renamed from: c */
    private IBrowserModuleDependency.ILocationDependency f74584c = C29638a.m109622a().getLocationDependency();

    /* renamed from: d */
    private GeoStartLocationHandlerV2 f74585d;

    /* renamed from: a */
    public void mo107479a() {
        this.f74582a = true;
    }

    /* renamed from: b */
    public IBrowserModuleDependency.ILocationDependency mo107482b() {
        return this.f74584c;
    }

    /* renamed from: c */
    public Context mo107483c() {
        return this.f74583b;
    }

    /* renamed from: f */
    public boolean mo107486f() {
        return this.f74582a;
    }

    /* renamed from: e */
    public void mo107485e() {
        GeoStartLocationHandlerV2 geoStartLocationHandlerV2 = this.f74585d;
        if (geoStartLocationHandlerV2 != null) {
            geoStartLocationHandlerV2.mo107467b();
        }
    }

    /* renamed from: d */
    public boolean mo107484d() {
        return C51323b.m199076a(this.f74583b, m110369g());
    }

    /* renamed from: g */
    private String[] m110369g() {
        boolean isGooglePlay = C29638a.m109622a().isGooglePlay();
        boolean isFeatureGatingEnable = C29638a.m109622a().isFeatureGatingEnable("lark.browser.webview.permission.readphone");
        if (isGooglePlay || !isFeatureGatingEnable) {
            return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo107480a(GeoStartLocationHandlerV2 geoStartLocationHandlerV2) {
        this.f74585d = geoStartLocationHandlerV2;
    }

    public C29853a(Activity activity) {
        this.f74583b = activity;
    }

    /* renamed from: a */
    public void mo107481a(Runnable runnable) {
        new C51331a(this.f74583b).mo176924c(m110369g()).subscribe(new Consumer(runnable) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.$$Lambda$a$WCJs9GaJyk_jo3VOCRJGc2dq8KA */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C29853a.m110368a(this.f$0, (Boolean) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110368a(Runnable runnable, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            runnable.run();
        }
    }
}

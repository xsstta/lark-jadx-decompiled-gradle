package com.tt.miniapphost.data;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.appbase.IAppbrandSupport;
import java.util.Locale;

/* renamed from: com.tt.miniapphost.data.c */
public class C67489c implements IAppbrandSupport {

    /* renamed from: a */
    private volatile boolean f170196a;

    /* renamed from: b */
    private volatile boolean f170197b;

    /* renamed from: c */
    private IAppbrandSupport f170198c;

    C67489c() {
    }

    /* renamed from: a */
    public static C67489c m262538a() {
        return C67491e.m262546a().mo234318b();
    }

    /* renamed from: f */
    public boolean mo234315f() {
        if (!this.f170196a || m262539g() == null) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean isSDKSupport() {
        if (mo234315f()) {
            return this.f170198c.isSDKSupport();
        }
        return false;
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void preloadEmptyProcess() {
        if (mo234315f()) {
            this.f170198c.preloadEmptyProcess();
        }
    }

    /* renamed from: g */
    private IAppbrandSupport m262539g() {
        if (this.f170198c == null) {
            try {
                Object newInstance = Class.forName("com.tt.miniapp.AppbrandOpenImpl").newInstance();
                if (newInstance instanceof IAppbrandSupport) {
                    this.f170198c = (IAppbrandSupport) newInstance;
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("AppbrandSupport", "init error: " + th.getMessage(), th);
            }
        }
        return this.f170198c;
    }

    /* renamed from: b */
    public void mo234311b() {
        AppBrandLogger.m52830i("AppbrandSupport", "setIsInitForMainSandbox " + this.f170197b);
        this.f170197b = true;
    }

    /* renamed from: c */
    public boolean mo234312c() {
        AppBrandLogger.m52830i("AppbrandSupport", "isInitForMainSandbox " + this.f170197b);
        return this.f170197b;
    }

    /* renamed from: d */
    public void mo234313d() {
        AppBrandLogger.m52830i("AppbrandSupport", "setInit " + this.f170196a);
        this.f170196a = true;
    }

    /* renamed from: e */
    public boolean mo234314e() {
        AppBrandLogger.m52830i("AppbrandSupport", "isinit  " + this.f170196a);
        return this.f170196a;
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean isSDKSupport(Context context) {
        return isSDKSupport();
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public String getTmaJssdkVersion(IAppContext iAppContext) {
        if (mo234315f()) {
            return this.f170198c.getTmaJssdkVersion(iAppContext);
        }
        return "-1";
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean openShortcut(Intent intent) {
        if (mo234315f()) {
            return this.f170198c.openShortcut(intent);
        }
        return false;
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void switchLang(Locale locale) {
        if (mo234315f()) {
            this.f170198c.switchLang(locale);
        }
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void openAppbrand(C67466a aVar) {
        if (mo234315f()) {
            this.f170198c.openAppbrand(aVar);
            return;
        }
        AppBrandLogger.m52829e("AppbrandSupport", "openAppbrand, isAppbrandInit: false, scheme: " + aVar.mo234204a());
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public String getTmaJssdkVersion(Context context, IAppContext iAppContext) {
        return getTmaJssdkVersion(iAppContext);
    }
}
